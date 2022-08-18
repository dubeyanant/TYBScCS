<?php
$myfile = fopen("fullForm.txt", "r") or die("Unable to open file!");
echo fread($myfile, filesize("fullForm.txt"));
echo "<br>File size: " . filesize("fullForm.txt") . " bytes";
fclose($myfile);
