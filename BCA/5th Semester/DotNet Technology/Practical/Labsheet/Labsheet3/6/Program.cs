// Write a C# program to select name and address of employee whose salary is maximum using disconnected architecture. (Data Adapter)

using System;
using MySql.Data.MySqlClient;

class Program{
    static void Main(){
        string url = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(url);
        con.Open();
        MySqlCommand cmd = new MySqlCommand("SELECT * FROM employee WHERE salary = (SELECT MAX(salary) from employee);", con);
        MySqlDataAdapter adapter = new MySqlDataAdapter(cmd);
        System.Data.DataSet ds = new System.Data.DataSet();
        adapter.Fill(ds);
        for(int i=0; i<ds.Tables[0].Rows.Count; i++){
            Console.WriteLine(ds.Tables[0].Rows[i][1] + " " + ds.Tables[0].Rows[i][2]);
        }
        con.Close();
    }
}