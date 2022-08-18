<?php

$original = array('1', '2', '3', '4', '5');
echo 'Original array : ' . "\n";
foreach ($original as $x) {
    echo "$x ";
}

$pos = 3;
$inserted = '$';
array_splice($original, $pos, 0, $inserted);

echo "<br>After inserting '$' at position " . ($pos + 1) . " the array is : " . "\n";
foreach ($original as $x) {
    echo "$x ";
}
echo "\n";
