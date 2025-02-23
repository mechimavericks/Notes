<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="BCATestProject.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Label runat="server" Text="Name: " ></asp:Label>
        <asp:TextBox runat="server" ID="name"></asp:TextBox><br /></br>
        <asp:Label runat="server" Text="Address: " ></asp:Label>
        <asp:TextBox runat="server" ID="address" ></asp:TextBox><br /><br />
        <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="DispInfo" /> <br /></br>
        <asp:Label ID="result" runat="server"></asp:Label>
    </div>
    </form>
</body>
</html>
