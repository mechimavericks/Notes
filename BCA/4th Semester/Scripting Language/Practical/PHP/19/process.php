<?php
if(!empty(($_POST["comment"]))){
    $cmt = trim($_POST['comment']);
    // echo "Hello World";
    echo $cmt;
}else{
    echo "Failed to Post Data";
}
?>