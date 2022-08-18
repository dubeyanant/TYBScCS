<html>

<body>
    <form method="post">
        <h2>Enter choice :</h2>
        <input type="radio" name="rbchoice" value=1> Split an array into chunks<br>
        <input type="radio" name="rbchoice" value=2> Sort array by values without changing key values <br>
        <input type="radio" name="rbchoice" value=3> Filter the odd elements from array <br>
        <input type="radio" name="rbchoice" value=4> Merge given two arrays <br>
        <input type="radio" name="rbchoice" value=5> Find intersection of two array <br>
        <input type="radio" name="rbchoice" value=6> Find union of two array <br>
        <input type="radio" name="rbchoice" value=7> Find set difference of two array <br>

        <input type="submit" value="Submit" name="btnshow"><br>
    </form>
    <hr />

    <?php
    if (isset($_POST["btnshow"])) {
        function is_odd($var)
        {
            if ($var % 2 == 1)
                return $var;
        }

        $rbchoice = $_POST['rbchoice'];

        $arr0 = array('BBD' => "WT", 'RSK' => "OS", 'RAP' => "CN", '"RSC' => "FDS", 'MNS' => "JAVA", 'SSP' => "TCS", 'VPS' => "PP");
        $arr = array('a' => 1, 'b' => 2, 'c' => 3, 'd' => 4, 'e' => 5, 'f' => 6, 'g' => 7, 'h' => 8, 'j' => 9, 'k' => 10);
        $arr1 = array('j' => 9, 'k' => 10, 'l' => 11, 'm' => 22, 'n' => 33, 'o' => 44, 'p' => 55, 'q' => 66, 'r' => 77, 's' => 88);
        switch ($rbchoice) {
            case 1:
                print_r(array_chunk($arr0, 1, TRUE));
                break;

            case 2:
                asort($arr);
                echo "Array in ascending order:<br>";
                print_r($arr);
                arsort($arr);
                echo "<br><br>Array in descending order:<br>";
                print_r($arr);
                break;

            case 3:
                print_r(array_filter($arr, 'is_odd'));
                break;

            case 4:
                print_r(array_merge($arr, $arr1));
                break;

            case 5:
                print_r(array_intersect($arr, $arr1));
                break;

            case 6:
                $union = array_merge($arr, $arr1);
                print_r(array_unique($union));
                break;

            case 7:
                print_r(array_diff($arr, $arr1));
                break;
        }
    }

    ?>
</body>

</html>