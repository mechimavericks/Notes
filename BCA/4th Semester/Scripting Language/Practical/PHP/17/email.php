<?php
    $to = 'acharyakrishnaxt@email.com';
    $subject = 'Project Proposal';
    $from = 'krishnaxt@email.com';
    $message="Test Mail";
    //Email headers
    $headers = "From: $from\r\n";
	$headers .= "Reply-To: $from \r\n";
	$headers .= "Return-Path: $from\r\n";
	$headers .= "X-Mailer: PHP \r\n"; 
    // To send HTML mail, the Content-type header must be set
    $headers  = 'MIME-Version: 1.0' . "\r\n";
    $headers .= 'Content-type: text; charset=iso-8859-1' . "\r\n";
    // Create email headers
    $headers .= 'From: '.$from."\r\n".
    'Reply-To: '.$from."\r\n" .
    'X-Mailer: PHP/' . phpversion();
    //Try to send the email
    if (mail($to, $subject, $message, $headers)) {
        echo "Email sent successfully to $to";
    } else {
        echo "Email sending failed.";
    }
?>