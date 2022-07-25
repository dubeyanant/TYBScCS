<?php
$q = $_REQUEST["q"];
$hint = "";
if ($q !== "") {
    $hint = $q;
}
echo $hint;
