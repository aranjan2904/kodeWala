import java.util.Scanner;

class Hello {
	public static void main(String args[]){
		//int a = 6;
		//int b = 4;
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a > b){
			System.out.println(a+" is greater ");
		}else{
			System.out.println(b + "is greater");
		}
		
		//System.out.println("Hello world");
	}
}