<html>

<head></head>

<body>
    <form method="POST">
        Enter the 1st number: <input type="text" name="no1"><br>
        Enter the 2nd number: <input type="text" name="no2"><br>
        <input type="radio" name="rbchoice" value="1">Mod<br>
        <input type="radio" name="rbchoice" value="2">Power<br>
        <input type="radio" name="rbchoice" value="3">Sum<br>
        <input type="radio" name="rbchoice" value="4">Factorial<br>
        <input type="submit" name="btnshow" value="submit"><br>
    </form>
    <hr />
    Ans:
</body>

</html>

<?php
if (isset($_POST["btnshow"])) {
    $no1 = $_POST["no1"];
    $no2 = $_POST["no2"];
    $rbchoice = $_POST["rbchoice"];
}
$rbchoice = $_POST['rbchoice'] ?? ''; // using to resolve undefined rbchoice warning

switch ($rbchoice) {
    case 1:
        echo $no1 % $no2;
        break;

    case 2:
        echo pow($no1, $no2);
        break;

    case 3:
        echo $no1 + $no2;
        break;

    case 4:
        $ans = 1;
        for ($i = 1; $i <= $no2; $i++) {
            $ans = $ans * $i;
        }
        echo $ans;
        break;
}
?>