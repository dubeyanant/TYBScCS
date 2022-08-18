<html>

<head></head>

<body>
    <form method="post">
        <input type="file" name="myFile"><br>
        <input type="radio" name="rbchoice" value="1">Display type of file<br>
        <input type="radio" name="rbchoice" value="2">Display last access time of file<br>
        <input type="radio" name="rbchoice" value="3">Display the size of file<br>
        <input type="radio" name="rbchoice" value="4">Delete the file<br>
        <input type=submit value="Submit" name="btnshow">
    </form>
    <hr />
</body>

</html>

<?php
$myFile = $_POST["myFile"];

if (isset($_POST["btnshow"])) {

    $rbchoice = $_POST['rbchoice'];

    switch ($rbchoice) {
        case 1:
            echo filetype($myFile);;
            break;

        case 2:
            echo "Last accessed: " . date("d F Y H:i:s.", fileatime("abc copy.txt"));
            break;

        case 3:
            echo filesize($myFile) . " bytes";
            break;

        case 4:
            unlink($myFile);
            echo "File deleted!";
            break;
    }
}
?>