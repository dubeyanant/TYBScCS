<html>

<body>
    <form method="POST">
        Select options:<br>

        <input type="radio" name="rbchoice" value="1">Insert in Stack</input><br>
        <input type="radio" name="rbchoice" value="2">Delete from Stack</input><br>
        <input type="radio" name="rbchoice" value="3">Insert in Queue</input><br>
        <input type="radio" name="rbchoice" value="4">Delete from Queue</input><br>

        <input type="submit" name="btnshow" value="submit">
    </form>

    <hr />
</body>
<?php
$a = array(1, 2, 3, 4, 5, 6, 7);
echo "Original array :<br>";
print_r($a);
echo "<br><br>After operation :";

if (isset($_POST["btnshow"])) {
    $rbchoice = $_POST["rbchoice"];

    switch ($rbchoice) {
        case 1:
            array_push($a, 11);
            echo "<br>";
            print_r($a);
            break;
        case 2:
            array_pop($a);
            echo "<br>";
            print_r($a);
            break;
        case 3:
            array_unshift($a, 11);
            echo "<br>";
            print_r($a);
            break;
        case 4:
            array_pop($a);
            echo "<br>";
            print_r($a);
            break;
            // case 4:
            //     array_shift($a);
            //     echo "<br>";
            //     print_r($a);
            //     break;
    }
}
?>
<html>