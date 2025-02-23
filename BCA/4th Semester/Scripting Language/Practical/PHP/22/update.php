<html>
    <head>
        <title>CRUD Operation</title>
    </head>
<body>
    <?php
            include_once "connection.php";
            $id=$_GET["id"];
            $read="SELECT * FROM Data WHERE id=$id;";
            $rows=$conn->query($read);
            $row=$rows->fetch_assoc();
            if(!$row)
                die("Error in Reading Data.");
    ?>
    <form action="#" method="post">
        <label>FirstName: <input type="text" name="fname" value=<?=$row['firstname']?>> </label><br/><br/>
        <label>LastName: <input type="text" name="lname" value=<?=$row['lastname']?>> </label><br/><br/>
        <button type="submit" name="update">Update</button>
    </form>
    <?php
           if(isset($_POST["update"])){
               $fname=$_POST['fname'];
               $lname=$_POST['lname'];
               $update="UPDATE Data set firstname='$fname',lastname='$lname' WHERE id=$id;";
               if($conn->query($update))
                   header("Location:index.php");
               else    
                   die("Failed to Update the Data");
           }
    ?>
</body>
</html>