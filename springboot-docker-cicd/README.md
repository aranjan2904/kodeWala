# Spring Boot Docker + Jenkins CI/CD Demo

A deliberately small REST service for learning the build-to-deployment workflow.

## Stack

- Java 21
- Spring Boot 4.0.0
- Maven
- Docker
- Docker Compose
- Jenkins Pipeline

## Endpoints

| Method | URL | Purpose |
|---|---|---|
| GET | `http://localhost:8080/api/hello` | Returns a hello message |
| GET | `http://localhost:8080/api/version` | Shows configured framework and Java versions |

## 1. Run without Docker

Make sure Java 21 and Maven are installed:

```bash
java -version
mvn -version
```

From the project root:

```bash
mvn clean test
mvn clean package
mvn spring-boot:run
```

Open `http://localhost:8080/api/hello`.

## 2. Build and run with Docker

Build the executable JAR first, because the Dockerfile copies it:

```bash
mvn clean package
docker build -t springboot-docker-demo:1.0 .
docker run -d --name springboot-docker-demo -p 8080:8080 springboot-docker-demo:1.0
```

Test it:

```bash
curl http://localhost:8080/api/hello
```

Useful commands:

```bash
docker ps
docker logs springboot-docker-demo
docker stop springboot-docker-demo
docker rm springboot-docker-demo
```

Or use Compose:

```bash
mvn clean package
docker compose up --build -d
docker compose logs -f
docker compose down
```

## 3. Run the Jenkins pipeline

### Jenkins prerequisites

The machine/agent that runs this pipeline needs:
- Java 21
- Maven available as `mvn` on PATH
- Docker Desktop installed and running
- Jenkins Pipeline support

This starter Jenkinsfile uses Windows `bat` commands. If your Jenkins agent is Linux, replace each `bat '...'` with `sh '...'` and use Linux shell syntax in the deploy stage.

### Configure the job

1. Push this project to a GitHub repository.
2. In Jenkins, select **New Item**.
3. Enter a job name and choose **Pipeline**.
4. Under **Pipeline**, select **Pipeline script from SCM**.
5. Choose **Git**, paste your repository URL, and set branch to `*/main` (or your branch).
6. Set **Script Path** to `Jenkinsfile`, then save.
7. Select **Build Now**.

The pipeline performs:

1. Checkout source code.
2. Run unit/integration tests.
3. Package the executable JAR.
4. Build and tag a Docker image.
5. Replace the previous local container with the new one.

After a successful run, test `http://localhost:8080/api/hello` on the Docker host.

> Learning note: this is a local deployment pipeline. It does not push an image to Docker Hub or deploy to a cloud server. Those are good next steps after this works.

## 4. What to learn from each file

- `pom.xml`: dependencies, Java version, and executable JAR packaging.
- `Dockerfile`: how the packaged JAR becomes a container image.
- `docker-compose.yml`: how to run the service with one command.
- `Jenkinsfile`: how Jenkins automates testing, packaging, image creation, and deployment.
