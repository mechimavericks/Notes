<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Validation</title>
</head>
<style>
    p{
        color:red;
    }
</style>
<body>
    <?php
        if(isset($_POST["submit"])){
            $name=$_POST["name"];
            $add=$_POST["address"];
            $message=$_POST["message"];
            if(empty($name))
                echo "<p>* Name Cannot be Empty.</p>";
            if(empty($add))
                echo "<p>* Address Cannot be Empty.</p>";
            if(empty($message))
                echo "<p>* Message Cannot be Empty.</p>";
            if($name && $add && $message){
                echo "Form Validate Successfully!!!";
            }

        }
    ?>
    <form action="#" method="post">
        <label for="name">Full Name:</label>
        <input type="text" name="name" id="name"/><br/><br/>
        <label for="address">Address</label>
        <input type="text" name="address" id="address"/><br/><br/>
        <label for="message">Message</label>
        <textarea cols="15" rows="5" id="message" name="message"></textarea><br/><br/>
        <button type="submit" name="submit">Submit</button>
    </form>
</body>
</html>