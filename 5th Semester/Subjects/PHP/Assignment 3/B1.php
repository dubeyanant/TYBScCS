<html>

<head></head>

<body>
    <form method="POST">
        Enter 1st string: <input type="text" name="str1"><br>
        Enter 2nd string: <input type="text" name="str2"><br>
        Enter the value of n: <input type="text" name="num"><br>

        <input type="radio" name="rbchoice" value="1">Does small string appears at the start of the large string?<br>
        <input type="radio" name="rbchoice" value="2">Position of small string<br>
        <input type="radio" name="rbchoice" value="3">Compare both strings<br>

        <input type="submit" name="btnshow" value="submit"><br>
    </form>
    <hr />
    Ans:
</body>

</html>

<?php
if (isset($_POST["btnshow"])) {
    $str1 = $_POST["str1"];
    $str2 = $_POST["str2"];
    $num = $_POST["num"];
    $rbchoice = $_POST["rbchoice"];
}
$rbchoice = $_POST['rbchoice'] ?? ''; // using to resolve undefined "rbchoice" warning

switch ($rbchoice) {
    case 1:
        if (stripos($str1, $str2) == 0) // stripos find the position of first occurrence of the given substring
            echo ("True");
        else
            echo ("False");

        break;

    case 2:
        echo strpos($str1, $str2);

        break;

    case 3:
        $str1 = strtolower($str1);
        $str2 = strtolower($str2);
        if (strncmp($str1, $str2, $num) >= 0)
            echo "Strings are same";
        else
            echo "Strings are not same";
}
?>