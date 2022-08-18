<html>

<head></head>

<body>
    <form method="POST">
        Enter a string: <input type="text" name="str"><br>
        Choose a separator:
        <select name="sep">
            <option>#</option>
            <option>%</option>
            <option>@</option>
        </select><br>

        <input type="radio" name="rbchoice" value="1">Split<br>
        <input type="radio" name="rbchoice" value="2">Replace<br>
        <input type="radio" name="rbchoice" value="3">Last word<br>

        <input type="submit" name="btnshow" value="submit"><br>
    </form>
    <hr />
    Ans:
</body>

</html>

<?php
if (isset($_POST["btnshow"])) {
    $str = $_POST["str"];
    $sep = $_POST["sep"];
    $rbchoice = $_POST["rbchoice"];
}
$rbchoice = $_POST['rbchoice'] ?? ''; // using to resolve undefined "rbchoice" warning

switch ($rbchoice) {
    case 1:
        $words = explode(" ", $str); // explode function seprate the words with whitespace passed
        foreach ($words as $word)
            echo $word, $sep;

        break;

    case 2:
        $words = explode(" ", $str);
        foreach ($words as $word)
            echo $word, ","; // replaces the separator with comma
        break;

    case 3:
        $last_word_start = strrpos($str, ' ') + 1; // +1 so we don't include the space in our result
        echo $last_word = substr($str, $last_word_start);
}
?>