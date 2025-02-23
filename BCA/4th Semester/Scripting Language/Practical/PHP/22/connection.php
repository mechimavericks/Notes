<?php
    $server="localhost";
    $user="root";
    $pwd="";
    $db="crudoperation";
        $conn=new mysqli($server,$user,$pwd,$db);
        if(!$conn->connect_error){
            // echo "Databse Connected Successfully";
        }else{
            die("Failed to Connect to the Database. Error: ".$conn->connect_error);
        }
?>