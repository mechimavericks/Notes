using MySql.Data.MySqlClient;
class Program{
    static void Main(){
        string connection ="SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection conn = new MySqlConnection(connection);
        conn.Open();
        // string query = "INSERT INTO Student VALUES(101,'Aryan','Kanakai');";
        string query = "UPDATE Student set name = 'San',address='Birtamode' WHERE roll=101";
        MySqlCommand cmd = new MySqlCommand(query,conn);
        cmd.ExecuteNonQuery();
        // Console.WriteLine("Data Inserted");
        Console.WriteLine("Data Updated Successfully");
        conn.Close();
    }
}