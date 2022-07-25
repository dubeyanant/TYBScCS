<?php
session_start();

$cname = $_GET['cname'];
$cadd = $_GET['cadd'];
$mobno = $_GET['mobno'];


$_SESSION['cname'] = $cname;
$_SESSION['cadd'] = $cadd;
$_SESSION['mobno'] = $mobno;
?>

<html>

<head>
    <style>
        td {
            font-weight: bold;
        }
    </style>
</head>

<body>

    <center>
        <h2>Enter the product information:</h2>
        <form action="c1_2.php" method="post">

            <table>
                <tr>
                    <td>Product Name : </td>
                    <td><input type="text" name="e1"></td>
                <tr>
                <tr>
                    <td>Quantity : </td>
                    <td><input type="number" name="e2"></td>
                </tr>
                <tr>
                    <td>Rate : </td>
                    <td><input type="number" name="e3"></td>
                </tr>
            </table>
            <br><input type="submit" value=Next><br>

        </form>
    </center>
</body>

</html>