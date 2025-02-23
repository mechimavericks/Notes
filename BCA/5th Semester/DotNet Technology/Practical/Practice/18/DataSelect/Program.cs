using MySql.Data.MySqlClient;
class Program{
    static void Main(){
        string connectingstring = "SERVER=localhost;DATABASE=BCA;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(connectingstring);
        con.Open();
        string readdata="SELECT * FROM Student;";
        MySqlCommand cmd = new MySqlCommand(readdata,con);
        MySqlDataReader data = cmd.ExecuteReader();
        Console.WriteLine("Roll\tName\tAddress");
        while(data.Read()){
            // Use one of the Method
            // int roll=data.GetInt32("roll");
            // string name=data.GetString("name");
            // string address=data.GetString("address");  

            // Use One Of The Method 
            int roll=data.GetInt32(0);
            string name=data.GetString(1);
            string address=data.GetString(2);
            Console.WriteLine("{0}\t{1}\t{2}\t",roll,name,address);
        }
    }
}