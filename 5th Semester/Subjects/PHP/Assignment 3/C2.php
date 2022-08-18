<html>

<head></head>

<body>
    <form method="POST">
        Enter a sentence: <input type="text" name="str1"><br>
        Enter a word: <input type="text" name="str2"><br>
        Enter position: <input type="text" name="pos"><br>
        Enter no. of characters to be deleted: <input type="text" name="n"><br>

        <input type="radio" name="rbchoice" value="1">Delete<br>
        <input type="radio" name="rbchoice" value="2">Insert<br>
        <input type="radio" name="rbchoice" value="3">Replace<br>
        <input type="radio" name="rbchoice" value="4">Replace all<br>

        <input type="submit" value="submit" name="btnshow">
    </form>
    <hr>
    Ans:
</body>

<?php
if (isset($_POST["btnshow"])) {
    $str1 = $_POST["str1"];
    $str2 = $_POST["str2"];
    $pos = $_POST["pos"];
    $n = $_POST["n"];
    $rbchoice = $_POST["rbchoice"];

    switch ($rbchoice) {
        case 1:
            echo str_replace(substr($str1, $pos, $n), "", $str1); // finding word that is to be deleted with substr and replacing it with nothing
            break;

        case 2:
            echo substr_replace($str1, $str2, $pos, 0);
            break;

        case 3:
            echo str_replace(substr($str1, $pos, strlen($str2)), $str2, $str1);
            break;

        case 4:
            echo substr_replace($str1, $str2, $pos);
            break;
    }
}
?>

</html>