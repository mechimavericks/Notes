<?php
if($_SERVER["REQUEST_METHOD"]=="POST"){
    if(isset($_FILES["file"])){
        $allowed=array("jpg","jpeg","png","gif");
        $filename=$_FILES["file"]["name"];
        $filesize=$_FILES["file"]["size"];
        $error=$_FILES["file"]["error"];
        // $ext = pathinfo($filename,PATHINFO_EXTENSION);
        $exttemp=explode(".",$filename);
        $ext=strtolower(end($exttemp));
        if(!in_array($ext,$allowed))
            die ("File Format Doesn't Match");
        $size=5*1024*1024;
        if($filesize>$size) 
            die ("File must be less than 5MB");
        if($_FILES["file"]["error"]==0){
            if(file_exists("E:/xampp/htdocs/scripting/fileuplod/".$filename)){
                die("File is Already Exist.");   
            }else{
                move_uploaded_file($_FILES["file"]["tmp_name"],"E:/xampp/htdocs/scripting/fileuplod/".$filename);
                echo "File UPloaded Successfully";
            }
        }else{
            echo "Failed to Upload. Error: ".$error;
        }         
    }
}

?>