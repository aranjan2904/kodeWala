<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Details</title>

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
}

.logo{
    font-size:28px;
    font-weight:bold;
}

.logo span{
    color:#f3a847;
}

.container{
    width:700px;
    margin:50px auto;
    background:white;
    border-radius:10px;
    box-shadow:0 4px 10px rgba(0,0,0,.2);
    padding:35px;
}

h2{
    color:#232f3e;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
}

table td{
    padding:14px;
    border-bottom:1px solid #ddd;
}

.label{
    font-weight:bold;
    width:40%;
    color:#444;
}

.status{
    color:green;
    font-weight:bold;
}

.btn{
    display:inline-block;
    margin-top:25px;
    padding:12px 25px;
    background:#FFD814;
    color:black;
    text-decoration:none;
    border-radius:8px;
    font-weight:bold;
}

.btn:hover{
    background:#F7CA00;
}

footer{
    margin-top:50px;
    background:#232f3e;
    color:white;
    text-align:center;
    padding:15px;
}
</style>

</head>

<body>

<header>
    <div class="logo">amazon<span>.orders</span></div>
</header>

<div class="container">

    <h2>Order Details</h2>

    <table>
        <tr>
            <td class="label">Order ID</td>
            <td>101</td>
        </tr>

        <tr>
            <td class="label">Product</td>
            <td>Apple iPhone 16</td>
        </tr>

        <tr>
            <td class="label">Price</td>
            <td>₹79,999</td>
        </tr>

        <tr>
            <td class="label">Customer</td>
            <td>Ranjan</td>
        </tr>

        <tr>
            <td class="label">Delivery Status</td>
            <td class="status">Delivered</td>
        </tr>
    </table>

    <a href="index.jsp" class="btn">Back to Home</a>

</div>

<footer>
    © 2026 Amazon Order Service | Spring MVC Demo
</footer>

</body>
</html>