// Write a C# program to insert records in above employee table.

using System;
using MySql.Data.MySqlClient;

class Program{
    static void Main(){
        string url = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(url);
        con.Open();
        MySqlCommand cmd = new MySqlCommand("INSERT INTO employee(eid,name,address,salary) VALUES(100,'Santosh Bhandari','Birtamode',20000),(101,'Krishna Oli','Bhadrapur',25000),(102,'Manoj','Damak',25000)", con);
        cmd.ExecuteNonQuery();
        Console.WriteLine("Data Inserted successfully");
        con.Close();
    }
}