// Write a C# program to select records of employee whose address is Btm and salary is between 30000 to 40000 using connected architecture (Data Reader).

using System;
using MySql.Data.MySqlClient;

class Program{
    static void Main(){
        string url = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(url);
        con.Open();
        MySqlCommand cmd = new MySqlCommand("SELECT * FROM employee WHERE address='Birtamode' AND salary BETWEEN 30000 AND 40000;", con);
        MySqlDataReader reader = cmd.ExecuteReader();
        while(reader.Read()){
            Console.WriteLine(reader[0] + " " + reader[1] + " " + reader[2] + " " + reader[3]);
        }
        con.Close();
    }
}