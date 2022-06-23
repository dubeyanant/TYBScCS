<?php
$a_name = $_GET['a_name'];
$con = mysql_connect("localhost","root","");
$d = mysql_select_db("bca_programs",$con);
$q = mysql_query("select movie.m_no,m_name,r_year from movie,actor_slip_14 where a_name='$a_name' && actor_slip_14.m_no=movie.m_no"); //echo $q;
echo "<table border=1>";
echo "<tr><th>Movie No</th><th>Movie Name</th><th>Release Year</th></tr>";
while($row = mysql_fetch_array($q))
{
echo "";
echo "".$row[0]."";
echo "".$row[1]."";
echo "".$row[2]."";
echo "";
}
echo "</table>";
