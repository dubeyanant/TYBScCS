<html>

<head>
	<meta charset="uft-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title></title>
</head>

<body>
	<form method="post">
		<table>
			<tr>
				<td>
					Enter User Name
				</td>
				<td>
					<input type="text" name="txtname">
				</td>
			</tr>
			<tr>
				<td>
					Enter Password
				</td>
				<td>
					<input type="password" name="txtpass">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="btnlogin" value="Login">
				</td>
			</tr>
		</table>
	</form>
</body>

</html>

<?php
if (isset($_POST['btnlogin'])) {
	session_start();
	$nm = $_POST['txtname'];
	$ps = $_POST['txtpass'];
	if ($_SESSION['login'] == "3") {
		echo "Blocked";
	} else if ($nm == "admin" && $ps == "admin") {
		header("location:welcome.php");
	} else {
		echo $_SESSION['login']++;
	}
}
?>