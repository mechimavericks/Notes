<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	// primary validate function
	function validate($str) {
		return trim(htmlspecialchars($str));
	}

	if (empty($_POST['name'])) {
		$nameError = 'Name should be filled';
	} else {
		$name = validate($_POST['name']);
		if (!preg_match('/^[a-zA-Z0-9\s]+$/', $name)) {
			$nameError = 'Name can only contain letters, numbers and white spaces';
		}
	}

	if (empty($_POST['email'])) {
		$emailError = 'Please enter your email';
	} else {
		$email = validate($_POST['email']);
		if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
			$emailError = 'Invalid Email';
		}
	}

	if (empty($_POST['password'])) {
		$passwordError = 'Password cannot be empty';
	} else {
		$password = validate($_POST['password']);
		if (strlen($password) < 6) {
			$passwordError = 'Please should be longer than 6 characters';
		}
	}

	// see shorthand conditionals chapter
	$website = !empty($_POST['website']) ? (string) filter_var($_POST['website'], FILTER_VALIDATE_URL) : "";
	$description = !empty($_POST['description']) ? validate($_POST['description']) : "";

	if (empty($_POST['gender'])) {
		$genderError = 'Please enter your gender';
	} else {
		$gender = $_POST['gender'];
	}

	$remember = !empty($_POST['remember']) ? filter_var($_POST['remember'], FILTER_VALIDATE_BOOLEAN) : ""; 

	if (empty($nameError) && empty($emailError) && empty($passwordError) && empty($genderError)) {
		// great form filling
		echo "You have filled the form successfully!";
		echo "<br>
			Name: $name <br>
			Email: $email <br>
			Password: $password <br>
			Website: $website <br>
			Description: $description <br>
			Gender: $gender <br>
			Remember Me: $remember";
		//exit(); // terminates the script
	} 


}

?>

<html>
<head>
	<title>Complete Form</title>
	<style type="text/css">
		.error {
			color:red;
		}
	</style>
</head>
<body>
<form method="POST" action="">
	Name: 
	<input type="text" name="name" value="<?php if (isset($name)) echo $name ?>"> 
	<span class="error"><?php if (isset($nameError)) echo $nameError ?></span><br>
	Email: 
	<input type="text" name="email" value="<?php if (isset($email)) echo $email ?>"> 
	<span class="error"><?php if (isset($emailError)) echo $emailError ?></span><br>
	Password: 
	<input type="password" name="password"> 
	<span class="error"><?php if (isset($passwordError)) echo $passwordError ?></span><br>
	Website: 
	<input type="text" name="website" value="<?php if (isset($website)) echo $website ?>"><br>
	Description: 
	<textarea name="description"><?php if (isset($description)) echo $description ?></textarea> <br>
	Gender: 
		Male
		<input type="radio" name="gender" value="male" <?php if (isset($gender) && $gender === "male") echo "checked" ?>> 
		Female
		<input type="radio" name="gender" value="female" <?php if (isset($gender) && $gender === "female") echo "checked" ?>>

	<span class="error"><?php if (isset($genderError)) echo $genderError ?></span> <br>
	Remember Me: 
	<input type="checkbox" name="remember">
	<input type="submit" name="submit">
</form>
</body>
</html>