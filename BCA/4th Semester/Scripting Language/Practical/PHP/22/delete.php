<?php
    include_once "connection.php";
    $id=$_GET["id"];
    $delete="DELETE FROM Data WHERE id=".$id.";";
    if($conn->query($delete)){
        header("Location:index.php");
    }else{
        die("Error in Deleting Data.");
    }
?>