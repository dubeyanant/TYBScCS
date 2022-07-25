<?php
session_start();
echo "<b>This page is accessed </b>";
echo  $_SESSION['count']++;
echo "<b> times.</b>";
