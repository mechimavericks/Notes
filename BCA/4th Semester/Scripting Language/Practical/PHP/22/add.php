<?php
include_once "connection.php";
if(isset($_POST["add"])){
    $fname=$_POST['fname'];
    $lname=$_POST['lname'];
    $insert="INSERT INTO Data(firstname,lastname) VALUES('$fname','$lname');";
    if($conn->query($insert))
        header("Location:index.php");
    else    
        die("Failed to Add the Data");
}   
?>