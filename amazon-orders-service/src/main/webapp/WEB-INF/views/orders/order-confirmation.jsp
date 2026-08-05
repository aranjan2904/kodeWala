<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Confirmation</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#eaeded;
}

header{
    background:#131921;
    color:white;
    padding:18px 40px;
    text-align:center;
    font-size:28px;
    font-weight:bold;
}

header span{
    color:#f3a847;
}

.container{
    width:90%;
    max-width:650px;
    margin:60px auto;
    background:white;
    padding:40px;
    border-radius:10px;
    box-shadow:0 5px 15px rgba(0,0,0,0.2);
    text-align:center;
}

.success{
    font-size:70px;
}

h1{
    color:#067D62;
    margin:20px 0;
}

.message{
    color:#555;
    font-size:18px;
    margin-bottom:30px;
}

.btn{
    display:inline-block;
    text-decoration:none;
    background:#FFD814;
    color:#111;
    padding:14px 30px;
    border-radius:8px;
    font-weight:bold;
    transition:.3s;
}

.btn:hover{
    background:#F7CA00;
}

footer{
    margin-top:80px;
    background:#232f3e;
    color:white;
    text-align:center;
    padding:18px;
}
</style>

</head>
<body>

<header>
    amazon<span>.orders</span>
</header>

<div class="container">

    <div class="success">✅</div>

    <h1>Order Placed Successfully!</h1>

    <p class="message">
        Thank you for shopping with Amazon.<br><br>
        Your order has been placed successfully and will be processed soon.
    </p>

    <a href="/" class="btn">Continue Shopping</a>

</div>

<footer>
    © 2026 Amazon Order Service | Spring MVC Demo
</footer>

</body>
</html>