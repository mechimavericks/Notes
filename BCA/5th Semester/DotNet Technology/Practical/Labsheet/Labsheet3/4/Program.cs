// Write a C# program to delete record of employee whose eid is 104.
using System;
using MySql.Data.MySqlClient;

class Program{
    static void Main(){
        string url = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(url);
        con.Open();
        MySqlCommand cmd = new MySqlCommand("DELETE FROM employee WHERE eid=104;", con);
        cmd.ExecuteNonQuery();
        Console.WriteLine("Data Deleted successfully");
        con.Close();
    }
}