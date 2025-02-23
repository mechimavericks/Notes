<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Send Message</title>
    <link rel="shortcut icon" href="icons/icon.png" type="image/x-icon">
    <script defer src="send.js"></script>
    <link rel="stylesheet" href="send.css">
    <link rel="shortcut icon" href="icons/icon.png" type="image/x-icon">
</head>
<body>
<?php
    use PHPMailer\PHPMailer\PHPMailer;
    use PHPMailer\PHPMailer\Exception;
    require './includes/PHPMailer.php';
    require './includes/Exception.php';
    require './includes/SMTP.php';
    if(isset($_POST["submit"])){
        // data info
        $name=trim($_POST["name"]);
        $formemail=trim($_POST["email"]);
        $contact=trim($_POST["phone"]);
        $email="santoshvandari100@gmail.com";
        $password="wjnfaamxdfpvjmhn";
        $subject="Kanakai Suggestion Form Response By ".$name;
        // echo $subject;
        $message="Form Submitted <b>".$name."</b><br/><b>Contact Number:</b> ".$contact."<br/><b>Email:</b>".$formemail."<br/><h2>Question:</h2><br/>".trim($_POST["question"])."<br/><br/><h2>Problem:</h2><br/>".trim($_POST["problem"])."<br/><br/><h2>Suggestion:</h2><br/>".trim($_POST["suggestion"])."<br/><br/>Thank you.<br/>By <b>".$name."</b>";
        $to="santoshvandari1@gmail.com";
        // Sending mail config
        $mail=new PHPMailer(true);
        $mail->isSMTP();
        $mail->Host="smtp.gmail.com";
        $mail->SMTPAuth=true;
        $mail->Username=$email;
        $mail->Password=$password;
        $mail->Port=465;
        $mail->SMTPSecure="ssl";
        $mail->isHTML(true);
        $mail->setFrom($email,$name);
        $mail->addAddress($to);
        $mail->Subject=$subject;
        $mail->Body=$message;
        if($mail->send()){
            echo "<div><h2 id='mssg'>Message sent Successfully! Thank you for the Feedback.🙂🙂🙂</h2>";
        }else{
            echo "<div><h2 id='failure'>Something Went Worng😔😔😔!! Please Try Again</h2>";
        }
        $mail->SMTPClose();
        }else{
            header("Location: index.php");
        }
?>
    <h3 class="auto">Automatically redirect to Home Page in <span id="para">5</span></h3>
    <a href="index.php" id="home" style="display:none"></a>
    </div>
</body>
</html>