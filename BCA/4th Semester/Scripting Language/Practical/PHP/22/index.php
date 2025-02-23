<html>
    <head>
        <title>CRUD Operation</title>
    </head>
<body>
    <form action="add.php" method="post">
        <label>FirstName: <input type="text" name="fname"> </label><br/><br/>
        <label>LastName: <input type="text" name="lname"> </label><br/><br/>
        <button type="submit" name="add">Add</button>
    </form>
    <table border="1">
        <tr><th>First Name</th><th>Last Name</th><th>Actions</th></tr>
        <?php
            include_once "connection.php";
            $read="SELECT * FROM Data";
            if($result=$conn->query($read))
                while($row=$result->fetch_assoc()){
                    echo "<tr><td>".$row["firstname"]."</td><td>".$row["lastname"]."</td><td><a href='update.php?id=".$row["id"]."'>Edit</a> | <a href='delete.php?id=".$row["id"]."'>Delete</a></td></tr>";
                }
        ?>
    </table>
</body>
</html>