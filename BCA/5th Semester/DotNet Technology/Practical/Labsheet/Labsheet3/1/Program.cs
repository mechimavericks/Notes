// Write a C# program to create table named employee with columns eid as int, name as varchar, address as varchar and salary as double using ADO.Net.

using System;
using MySql.Data.MySqlClient;

class Program{
    static void Main(){
        string url = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(url);
        con.Open();
        MySqlCommand cmd = new MySqlCommand("create table employee(eid int, name varchar(20), address varchar(50), salary double)", con);
        cmd.ExecuteNonQuery();
        Console.WriteLine("Table created successfully");
        con.Close();
    }
}