<?php

echo "Ascending order sort by value";
$array2 = array("Sophia" => "31", "Jacob" => "41", "William" => "39", "Ramesh" => "40");

asort($array2); // sorts by ascending value
foreach ($array2 as $y => $y_value) {
    echo "<br>Age of " . $y . " is : " . $y_value . "";
}

echo "<br><br>Ascending order sort by Key";
$array3 = array("Sophia" => "31", "Jacob" => "41", "William" => "39", "Ramesh" => "40");

ksort($array3); // sorts by ascending key
foreach ($array3 as $y => $y_value) {
    echo "<br>Age of " . $y . " is : " . $y_value . "";
}


echo "<br><br>Descending order sorting by Value";
$age = array("Sophia" => "31", "Jacob" => "41", "William" => "39", "Ramesh" => "40");

arsort($age); // sorts by decending value
foreach ($age as $y => $y_value) {
    echo "<br>Age of " . $y . " is : " . $y_value . "";
}

echo "<br><br>Descending order sorting by Key";
$array4 = array("Sophia" => "31", "Jacob" => "41", "William" => "39", "Ramesh" => "40");

krsort($array4); // sorts by decending key
foreach ($array4 as $y => $y_value) {
    echo "<br>Age of " . $y . " is : " . $y_value . "";
}
