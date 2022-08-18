<html>

<head></head>

<body>
    <form method="POST">
        Enter an email-id: <input type="text" name="email"><br>
        <input type="submit" name="btnshow" value="submit">
    </form>
    <hr />
</body>

</html>

<?php
function valid_email($str)
{
    return (!preg_match("/^([a-z0-9\+_\-]+)(\.[a-z0-9\+_\-]+)*@([a-z0-9\-]+\.)+[a-z]{2,6}$/ix", $str)) ? FALSE : TRUE;
}
?>

<?php
if (isset($_POST["btnshow"])) {
    $email = $_POST["email"];

    if (!valid_email($email)) {
        echo "Invalid email address.";
    } else {
        echo "Valid email address.";
    }
}
?>