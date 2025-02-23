// Write a C# program to update name as Ram and salary as 55000 of employee whose eid is 102.
using System;
using MySql.Data.MySqlClient;

class Program{
    static void Main(){
        string url = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(url);
        con.Open();
        MySqlCommand cmd = new MySqlCommand("UPDATE employee SET name='Ram',salary=55000 WHERE eid=102;", con);
        cmd.ExecuteNonQuery();
        Console.WriteLine("Data Updated successfully");
        con.Close();
    }
}