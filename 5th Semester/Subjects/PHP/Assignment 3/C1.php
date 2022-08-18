<html>

<head>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>

<body>

    <form method="POST">
        Serial number: <input type="text" name="sno"><br>
        Subject Name: <input type="text" name="subject"><br>
        Marks: <input type="text" name="marks"><br>

        <input type="submit" name="btnshow" value="submit">
    </form>
    <hr />
    Ans:<br>

    <?php

    if (isset($_POST["btnshow"])) {
        $marks = $_POST["marks"];
        $marks = explode(" ", $marks); // converting string to array

        $total = 0; // calculating total marks
        foreach ($marks as $a) {
            $total = $total + $a;
        }

        $per = ($total / 500) * 100; // calculating percentage

        $grade = "NA"; // calculating grade
        if ($per > 90)
            $grade = "A";
        elseif ($per > 80)
            $grade = "B";
        elseif ($per > 70)
            $grade = "C";
        elseif ($per > 60)
            $grade = "D";
        elseif ($per > 40)
            $grade = "E";
        else
            $grade = "F";
    }

    ?>

    <table>
        <tr>
            <th>Total</th>
            <th>Percentage</th>
            <th>Grade</th>
        </tr>
        <tr>
            <td><?php echo $total ?></td>
            <td><?php echo $per . "%" ?></td>
            <td><?php echo $grade ?></td>
        </tr>
    </table>

</body>

</html>