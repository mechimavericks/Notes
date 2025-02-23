<%@ Page Language="C#" %>

<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta charset="utf-8" />
    <title></title>    
</head>
<body>
    <form id="form1" runat="server"> 
        <fieldset>
            <legend>Personal Details:</legend>
        <label for="salutation">Salutation</label>
        <select name="salutation" id="salutation">
            <option value="none">None</option>
            <option value="mr">Mr.</option>
            <option value="mrs">Mrs.</option>
        </select>
        <br />
        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName" />
        <br />
        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName" />
        <br />
        <label for="gender">Gender</label>
        <input type="radio" value="male" name="gender"/> Male 
        <input type="radio" value="female" name="gender"/>Female 
        <br />
        <label for="email">Email</label>
        <input type="email" id="email" name="email" />
        <br />
        <label for="dob">Date Of Birth: </label>
        <input type="date" id="dob" name="dob" />
        <br />
        <label for="address">Address</label>
        <textarea id="address" name="address"></textarea>
        <br />
        <button type="submit">Submit</button>
        </fieldset>
    </form>
</body>
</html>
