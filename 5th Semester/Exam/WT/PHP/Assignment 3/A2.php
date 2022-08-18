<html>

<head></head>

<body>
    <form method="POST">
        Enter a string: <input type="text" name="str"><br>
        <input type="radio" name="rbchoice" value="1">Length<br>
        <input type="radio" name="rbchoice" value="2">Vowel Counter<br>
        <input type="radio" name="rbchoice" value="3">Lowercase & Titlecase<br>
        <input type="radio" name="rbchoice" value="4">Pad with "*"<br>
        <input type="radio" name="rbchoice" value="5">Remove Whitespace<br>
        <input type="radio" name="rbchoice" value="6">Reverse<br>

        <input type="submit" name="btnshow" value="submit"><br>
    </form>
    <hr />
    Ans:
</body>

</html>

<?php
if (isset($_POST["btnshow"])) {
    $str = $_POST["str"];
    $rbchoice = $_POST["rbchoice"];
}
$rbchoice = $_POST['rbchoice'] ?? ''; // using to resolve undefined "rbchoice" warning

switch ($rbchoice) {
    case 1:
        $i = 0; // inbuilt function is strlen($str); to find length of the string
        while (@$str[$i++] != NULL); // here we are going from 0 to untill we don't find NULL at the end of the string
        $i--; // we are subtracting one cause we have counted null also
        echo $i;

        break;

    case 2:
        $str = strtolower($str); // converting lowercase for simplicity purposes
        $vowels = array('a', 'e', 'i', 'o', 'u');
        $len = strlen($str); // finding the length of the string
        $num = 0;
        for ($i = 0; $i < $len; $i++) {
            if (in_array($str[$i], $vowels)) { // using in_array function so that if a vowel is in the ith postition of the array it increases the count
                $num++;
            }
        }
        echo $num;

        break;

    case 3:
        $str = strtolower($str);
        echo "<br>" . $str . "<br>";
        $str = ucwords($str);
        echo $str;

        break;

    case 4:
        echo str_pad($str,  strlen($str) + 2, "*", STR_PAD_BOTH); // second parameter is how much should be the length of the output string

        break;

    case 5:
        echo trim($str); // ltrim() & rtrim() removes whitespaces from the respective sides

        break;

    case 6:
        echo strrev($str);

        break;
}
?>