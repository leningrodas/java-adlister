<%--
  Created by IntelliJ IDEA.
  User: macowner
  Date: 1/21/21
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order a pizza</title>
</head>
<body>
<h1>Please choose your style and toppings for a pizza!</h1>
<h4>Select crust type</h4>
<form action="/pizza-order" method="post">

        <input type="checkbox" class="radio" name="crust" id="pizzacrust" value="Thin Crust">
        <label for="pizzacrust">Thin Crust</label><br>
        <input type="checkbox" class="radio" name="crust" id="pizzacrust2" value="Deep crust">
        <label for="pizzacrust2">Deep Crust</label><br>
        <input type="checkbox" class="radio" name="crust" id="pizzacrust3" value="Sicilian">
        <label for="pizzacrust3">Sicilian</label>

<br>
<h4>Please Select your size</h4>

        <select name="size" id="pizzasize">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="xlarge">Extra Large</option>
        </select>

<br>
<h4>Select your toppings, each is 50 cents</h4>

        <input type="radio" id="toppings1" name="toppings" value="bacon">
        <label for="toppings1"> bacon</label><br>
        <input type="checkbox" id="toppings2" name="toppings" value="pineapple">
        <label for="toppings2"> pineapple</label><br>
        <input type="checkbox" id="toppings3" name="toppings" value="yellow peppers">
        <label for="toppings3"> yellow peppers</label><br><br>


    <br>
<h3>Enter your address and personal info</h3>


        <label for="address">Address</label>
        <input type="text" id="address" name="address"><br>





    <input type="submit" value="Submit">
</form>


</body>
</html>
