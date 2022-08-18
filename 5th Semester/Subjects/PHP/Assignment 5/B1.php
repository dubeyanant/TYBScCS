<?php {

    $myFile = "student.dat";
    $lines = file($myFile); //file to array conversion

    $itemcode = $lines[0];
    $itemname = $lines[1];
    $unitssold = $lines[2];
    $rate = $lines[3];

    $i_code = explode(' ', $itemcode);
    $i_name = explode(' ', $itemname);
    $i_unit = explode(' ', $unitssold);
    $i_rate = explode(' ', $rate);

    $t_amt = (($i_unit[0] * $i_rate[0]) + ($i_unit[1] * $i_rate[1]) + ($i_unit[2] * $i_rate[2]) + ($i_unit[3] * $i_rate[3]) + ($i_unit[4] * $i_rate[4]));
}
?>

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
    <br /><br /><br />

    <table align=center border=1>
        <tr>
            <td><b>Item Code</b></td>
            <td><b>Item Name</b></td>
            <td><b>Unit Sold</b></td>
            <td><b>Rate</b></td>
        </tr>
        <tr>
            <td><?php echo $i_code[0] ?></td>
            <td><?php echo $i_name[0] ?></td>
            <td><?php echo $i_unit[0] ?></td>
            <td><?php echo $i_rate[0] ?></td>
        </tr>
        <tr>
            <td><?php echo $i_code[1] ?></td>
            <td><?php echo $i_name[1] ?></td>
            <td><?php echo $i_unit[1] ?></td>
            <td><?php echo $i_rate[1] ?></td>
        </tr>
        <tr>
            <td><?php echo $i_code[2] ?></td>
            <td><?php echo $i_name[2] ?></td>
            <td><?php echo $i_unit[2] ?></td>
            <td><?php echo $i_rate[2] ?></td>
        </tr>
        <tr>
            <td><?php echo $i_code[3] ?></td>
            <td><?php echo $i_name[3] ?></td>
            <td><?php echo $i_unit[3] ?></td>
            <td><?php echo $i_rate[3] ?></td>
        </tr>
        <tr>
            <td><?php echo $i_code[4] ?></td>
            <td><?php echo $i_name[4] ?></td>
            <td><?php echo $i_unit[4] ?></td>
            <td><?php echo $i_rate[4] ?></td>
        </tr>
        <tr>
            <th colspan=3>Total amout </th>
            <td><?php echo $t_amt ?></td>
        </tr>
    </table>
</body>

</html>