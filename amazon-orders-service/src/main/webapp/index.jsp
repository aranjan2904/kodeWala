<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Order Service</title>

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

/* Header */
header{
    background:#131921;
    color:white;
    padding:18px 40px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.logo{
    font-size:30px;
    font-weight:bold;
}

.logo span{
    color:#f3a847;
}

/* Main Container */
.container{
    width:90%;
    max-width:900px;
    margin:50px auto;
    background:white;
    padding:40px;
    border-radius:10px;
    box-shadow:0 5px 15px rgba(0,0,0,0.2);
    text-align:center;
}

.container h1{
    color:#232f3e;
    margin-bottom:10px;
}

.container p{
    color:#555;
    margin-bottom:30px;
    font-size:17px;
}

/* Button */
.btn{
    display:inline-block;
    background:#FFD814;
    color:#111;
    text-decoration:none;
    padding:14px 30px;
    border-radius:8px;
    font-weight:bold;
    transition:0.3s;
    margin-bottom:35px;
}

.btn:hover{
    background:#F7CA00;
}

/* Form */
.order-form{
    width:450px;
    margin:0 auto;
    text-align:left;
}

.order-form label{
    display:block;
    margin-top:15px;
    margin-bottom:5px;
    font-weight:bold;
    color:#232f3e;
}

.order-form input[type="text"],
.order-form input[type="number"]{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:16px;
}

.submit-btn{
    width:100%;
    margin-top:25px;
    padding:14px;
    background:#FFD814;
    border:none;
    border-radius:8px;
    font-size:18px;
    font-weight:bold;
    cursor:pointer;
    transition:0.3s;
}

.submit-btn:hover{
    background:#F7CA00;
}

/* Footer */
footer{
    margin-top:60px;
    background:#232f3e;
    color:white;
    text-align:center;
    padding:18px;
}
</style>

</head>

<body>

<header>
    <div class="logo">amazon<span>.orders</span></div>
    <div>Welcome to Amazon Order Service</div>
</header>

<div class="container">

    <h1>Amazon Order Management</h1>

    <p>
        Place a new order or view your existing order details.
    </p>

    <a href="orders/101" class="btn">
        View Order #101
    </a>

    <form action="placeOrder" method="post" class="order-form">

        <label>Item Name</label>
        <input type="text" name="item" placeholder="Enter item name" required>

        <label>Price</label>
        <input type="number" name="price" placeholder="Enter price" required>

        <label>Quantity</label>
        <input type="number" name="qty" placeholder="Enter quantity" required>

        <label>Mobile Number</label>
        <input type="text" name="mobile" placeholder="Enter mobile number" required>

        <input type="submit" value="Place Order" class="submit-btn">

    </form>

</div>

<footer>
    © 2026 Amazon Order Service | Spring MVC Demo
</footer>

</body>
</html>