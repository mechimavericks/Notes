<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="FactorialCalculate.aspx.cs" Inherits="BCATestProject.FactorialCalculate" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <h1>Factorial Calculator</h1>
        <label for="number">Enter a Number: </label>
        <asp:TextBox ID="number" runat="server"></asp:TextBox></br> </br>
        <asp:Button Text="Calculate" runat="server" OnClick="CalcFact" /><br />
        <asp:Label ID="result" runat="server"></asp:Label>
    </form>
</body>
</html>
