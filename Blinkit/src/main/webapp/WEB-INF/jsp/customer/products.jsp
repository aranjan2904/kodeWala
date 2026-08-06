<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blinkit</title>

<link rel="stylesheet" type="text/css"
      href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div class="header">
    <h2>Blinkit</h2>
</div>

<div class="container">

<div class="search-box">

    <form action="${pageContext.request.contextPath}/search" method="get">

        <input
            type="text"
            name="keyword"
            placeholder="Search products...">

        <button type="submit">Search</button>

    </form>

</div>

    <div class="product-container">

        <c:forEach var="product" items="${products}">

            <div class="product-card">

                <h3>${product.productName}</h3>

                <p>Category : ${product.category}</p>

                <h4>&#8377; ${product.price}</h4>

                <c:choose>
                    <c:when test="${product.stock > 0}">
                        <p style="color:green;">In Stock</p>
                    </c:when>

                    <c:otherwise>
                        <p style="color:red;">Out of Stock</p>
                    </c:otherwise>
                </c:choose>

                <button>Add</button>

            </div>

        </c:forEach>

    </div>

</div>

</body>
</html>