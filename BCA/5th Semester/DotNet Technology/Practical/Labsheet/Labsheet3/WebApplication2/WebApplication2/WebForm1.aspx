<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication2.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
       <asp:Label runat="server" Text="First Number"></asp:Label>
        <asp:TextBox ID="firstnum" runat="server"></asp:TextBox><br /><br />
         <asp:Label runat="server" Text="Second Number"></asp:Label>
  <asp:TextBox ID="secondnum" runat="server"></asp:TextBox><br />
        <asp:Label ID="result" runat="server" Text="Result : "></asp:Label><br /><br />
        <asp:Button ID="submit" runat="server" Text="Get Result" onClick="CalculateSum" />
    </form>
</body>
</html>
