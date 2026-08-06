<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EatClub - Place Order</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#fff6f3;
}

.header{
    background:#ff5a1f;
    color:white;
    padding:18px;
    text-align:center;
    font-size:32px;
    font-weight:bold;
}

.banner{
    width:100%;
    height:260px;
    object-fit:cover;
}

.container{
    width:900px;
    margin:30px auto;
    background:white;
    border-radius:15px;
    box-shadow:0 0 15px rgba(0,0,0,0.2);
    overflow:hidden;
}

.content{
    display:flex;
}

.left{
    width:45%;
    background:#fff3ed;
    padding:20px;
    text-align:center;
}

.left img{
    width:220px;
    height:150px;
    border-radius:12px;
    margin:10px;
    object-fit:cover;
}

.right{
    width:55%;
    padding:30px;
}

h2{
    color:#ff5a1f;
    margin-bottom:20px;
}

label{
    font-weight:bold;
}

input[type=text],
input[type=number],
select,
textarea{
    width:100%;
    padding:10px;
    margin-top:6px;
    margin-bottom:15px;
    border:1px solid #ccc;
    border-radius:8px;
}

textarea{
    resize:none;
}

button{
    background:#ff5a1f;
    color:white;
    border:none;
    padding:12px 25px;
    border-radius:8px;
    font-size:16px;
    cursor:pointer;
}

button:hover{
    background:#e24d18;
}

.reset{
    background:gray;
}
</style>

</head>
<body>

<div class="header">
    🍽 EatClub
</div>

<img class="banner"
src="https://images.unsplash.com/photo-1504674900247-0877df9cc836?w=1200"
alt="Food Banner">

<div class="container">

<div class="content">

<div class="left">

<h3>Popular Dishes</h3>

<img src="https://images.unsplash.com/photo-1563379091339-03246963d29c?w=400"
alt="Pizza">

<img src="https://images.unsplash.com/photo-1562967916-eb82221dfb36?w=400"
alt="Burger">

<img src="https://images.unsplash.com/photo-1589302168068-964664d93dc0?w=400"
alt="Biryani">

</div>

<div class="right">

<h2>Place Your Order</h2>

<form action="placeOrder" method="post">

<label>Customer Name</label>
<input type="text" name="customerName" required>

<label>Food Item</label>
<select name="item">
    <option>Veg Biryani</option>
    <option>Chicken Biryani</option>
    <option>Paneer Butter Masala</option>
    <option>Veg Fried Rice</option>
    <option>Pizza</option>
    <option>Burger</option>
</select>

<label>Quantity</label>
<input type="number" name="quantity" min="1" required>

<label>Delivery Address</label>
<textarea rows="3" name="address"></textarea>

<label>Payment Method</label><br><br>

<input type="radio" name="payment" value="Cash on Delivery" checked> Cash on Delivery
<br><br>

<input type="radio" name="payment" value="UPI"> UPI
<br><br>

<input type="radio" name="payment" value="Card"> Card

<br><br>

<button type="submit">🍽 Place Order</button>
<button type="reset" class="reset">Clear</button>

</form>

</div>

</div>

</div>

</body>
</html>