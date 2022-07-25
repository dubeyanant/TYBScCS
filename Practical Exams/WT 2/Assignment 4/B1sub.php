<?php
$sname=$_GET['sname'];
$con=mysql_connect("localhost","root","");
$d=mysql_select_db("bca_programs",$con);
$result=mysql_query("select *from student where sname='$sname'");
while($row=mysql_fetch_array($result))
{
echo $row['sno']."--".$row['sname']."--".$row['per']."<br>";
}
