
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EatClub - Order Confirmation</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#fff5f2;
}

.header{
    background:#ff5a1f;
    color:white;
    text-align:center;
    padding:20px;
    font-size:32px;
    font-weight:bold;
}

.container{
    width:700px;
    margin:40px auto;
}

.card{
    background:white;
    border-radius:15px;
    box-shadow:0 5px 15px rgba(0,0,0,.2);
    padding:30px;
}

.success{
    text-align:center;
}

.success img{
    width:120px;
    margin-bottom:15px;
}

.success h2{
    color:#28a745;
    margin-bottom:10px;
}

.success p{
    color:#555;
}

table{
    width:100%;
    border-collapse:collapse;
    margin-top:25px;
}

th{
    background:#ff5a1f;
    color:white;
    padding:12px;
    text-align:left;
}

td{
    padding:12px;
    border-bottom:1px solid #ddd;
}

.footer{
    margin-top:25px;
    text-align:center;
}

.footer h3{
    color:#ff5a1f;
}

button{
    margin-top:20px;
    background:#ff5a1f;
    color:white;
    border:none;
    padding:12px 25px;
    border-radius:8px;
    cursor:pointer;
    font-size:16px;
}

button:hover{
    background:#e64a19;
}

</style>

</head>
<body>

<div class="header">
🍽️ EatClub
</div>

<div class="container">

<div class="card">

<div class="success">

<img src="https://cdn-icons-png.flaticon.com/512/845/845646.png"
alt="Success">

<h2>Order Placed Successfully!</h2>

<p>Thank you for ordering with <b>EatClub</b>.</p>
<h3 style="color:#ff5a1f;">
    Order ID : ${orderId}
</h3>

</div>

<table>

<tr>
<th>Customer Name</th>
<td>${customerName}</td>
</tr>

<tr>
<th>Food Item</th>
<td>${item}</td>
</tr>

<tr>
<th>Quantity</th>
<td>${quantity}</td>
</tr>

<tr>
<th>Delivery Address</th>
<td>${address}</td>
</tr>

<tr>
<th>Payment Method</th>
<td>${payment}</td>
</tr>

</table>

<div class="footer">

<h3>👨‍🍳 Your delicious food is being prepared!</h3>

<p>Estimated Delivery Time: <b>25 - 35 Minutes</b></p>

<button onclick="history.back()">🍔 Order Again</button>

</div>

</div>

</div>

</body>
</html>