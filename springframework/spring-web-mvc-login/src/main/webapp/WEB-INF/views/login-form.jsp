<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#f3f3f3;
}

.logo{
    text-align:center;
    font-size:34px;
    font-weight:bold;
    margin:30px;
    color:#131921;
}

.container{
    width:350px;
    margin:auto;
    background:#fff;
    border:1px solid #ddd;
    padding:25px;
    border-radius:8px;
}

h2{
    margin-bottom:20px;
    font-weight:500;
}

label{
    display:block;
    margin-top:15px;
    margin-bottom:5px;
    font-weight:bold;
}

input{
    width:100%;
    padding:10px;
    border:1px solid #999;
    border-radius:4px;
}

button{
    width:100%;
    margin-top:20px;
    padding:10px;
    background:#f7ca00;
    border:none;
    border-radius:6px;
    font-size:16px;
    cursor:pointer;
}

button:hover{
    background:#f2b600;
}

.small{
    font-size:13px;
    margin-top:15px;
    color:#555;
}

a{
    text-decoration:none;
    color:#0066c0;
}

.footer{
    text-align:center;
    margin-top:30px;
    color:#666;
    font-size:13px;
}
</style>

</head>

<body>

<div class="logo">
    ShopZone
</div>

<div class="container">

<h2>Sign In</h2>

<form action="login" method="post">

<label>Email</label>
<input type="email" name="email" placeholder="Enter your email">

<label>Password</label>
<input type="password" name="password" placeholder="Enter your password">

<button type="submit">Sign In</button>

</form>

<p class="small">
By continuing, you agree to the Terms of Service and Privacy Policy.
</p>

<p class="small">
New customer?
<a href="#">Create your account</a>
</p>

</div>

<div class="footer">
© 2026 ShopZone
</div>

</body>
</html>