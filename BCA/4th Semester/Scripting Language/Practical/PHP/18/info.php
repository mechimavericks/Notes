<?php
if(isset($_GET["fName"]) && isset($_GET["lName"])){
    $fname=htmlspecialchars($_GET["fName"]);
    $lname=htmlspecialchars($_GET["lName"]);
    echo $fname." ".$lname.", Welcome to the World of Programming";
}else{
    echo "Welcome to the world of Programming";
}
?>