<?php
session_start();
$e1 = $_POST['e1'];
$e2 = $_POST['e2'];
$e3 = $_POST['e3'];

echo "<h2>Customer Information</h2>";
echo "Name : " . $_SESSION['cname'] . "<br>";
echo "Address : " . $_SESSION['cadd'] . "<br>";
echo "Mobno : " . $_SESSION['mobno'] . "<br>";

echo "<h2>Product Information</h2>";
echo "Productname : " . $e1 . "<br>";
echo "Qty : " . $e2 . "<br>";
echo "Rate : " . $e3 . "<br><br>";
$total = $e2 * $e3;
echo "<h2>Total Amount : " . $total . "</h2>";
