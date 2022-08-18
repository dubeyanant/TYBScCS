<?php

function Search($value, $array)
{
    return (array_search($value, $array));
}

$array = array(
    "ram",
    "aakash",
    "saran",
    "mohan",
    "saran"
);

$value = "saran";
print_r(Search($value, $array));
