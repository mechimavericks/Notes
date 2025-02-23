<?php
    // if($_SERVER["REQUEST_METHOD"]=="POST"){
        if(isset($_FILES["file"])){
            $filename=$_FILES["file"]["name"];
            $filesize=$_FILES["file"]["size"];
            $fileerror=$_FILES["file"]["error"];
            if($fileerror==0){
                $allowedtype=array("png","jpeg","jpg");
                $tempextension=explode(".",$filename);
                $extension=strtolower(end($tempextension));
                $location="E:\\xampp\\htdocs\\scripting\\fileupload\\";
                if(!in_array($extension,$allowedtype))
                    die("File Type Not Allowed.");
                if(($filesize>(5*1024*1024)))
                    die("File Size Must Be Less than 5MB.");
                if(file_exists($location.$filename)){
                            die("File Already Uploaded.");
                }else if(move_uploaded_file($_FILES["file"]["tmp_name"],$location.$filename)){
                            echo "File Uploaded Successfully.";
                }else{
                            die("File Upload Failed");
                }
            }else{
                echo "Failed to Upload File. Error: ".$fileerror;
            }
        }
    // }
?>
