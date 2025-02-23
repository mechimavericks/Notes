<?php
$arr=["santosh Bhandari","Ayussh Dahal"];
$data = array(
    "fname"=>"Santosh",
    "lname"=>"Bhandari",
    "add"=>"BTM",
    "other"=>$arr

);
header("content-Type:Application/json");
$final= json_encode($data);
echo $final;

?>