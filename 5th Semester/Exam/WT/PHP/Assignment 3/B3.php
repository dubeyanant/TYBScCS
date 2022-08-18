<html>

<head></head>

<body>
    <form method="POST">
        Enter student name: <input type="text" name="str1"><br>
        Enter college name: <input type="text" name="str2"><br>
        Enter greeting message: <input type="text" name="str3"><br>

        <input type="submit" name="btnshow" value="submit">
    </form>
    <hr />
    Ans:
</body>

</html>

<?php

function greet($name = "Anant Dubey", $clg = "KTHM", $msg = "Have a good day")
{
    return "Hello $name from $clg college. $msg!";
}

if (isset($_POST["btnshow"])) {
    $str1 = $_POST["str1"];
    $str2 = $_POST["str2"];
    $str3 = $_POST["str3"];

    if (empty($_POST["str1"]) && empty($_POST["str2"]) && empty($_POST["str3"]))
        echo greet();
    elseif (empty($_POST["str2"]) && empty($_POST["str3"]))
        echo greet($str1);
    elseif (empty($_POST["str3"]))
        echo greet($str1, $str2);
    else
        echo greet($str1, $str2, $str3);
}

?>