using System;
using MySql.Data.MySqlClient;
class Program{
    static void Main(){
        string connectingstring = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection conn= new MySqlConnection(connectingstring);
        conn.Open();
        string query="CREATE TABLE IF NOT EXISTS Student(roll INT, name VARCHAR(50),address VARCHAR(50));";
        MySqlCommand cmd = new MySqlCommand(query,conn);
        cmd.ExecuteNonQuery();
        Console.WriteLine("Table Created Successfully");
        string insert = "INSERT INTO Student VALUES(100,'Santosh Bhandari','Kanakai');";
        MySqlCommand ins = new MySqlCommand(insert,conn);
        ins.ExecuteNonQuery();
        Console.WriteLine("Data Inserted Successfully");
        conn.Close();

    }
}