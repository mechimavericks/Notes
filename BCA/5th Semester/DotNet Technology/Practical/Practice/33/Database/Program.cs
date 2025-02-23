/*Provided that a mysql database named "University" with table named "Student" with following columns 
(Rollnumber as int, Name as varchar(50),Department as varchar(50),Address as varcahr(50), and Tution_fee as float). 
Write c# program to connect to the database and insert 5 student records and display the student record form 
University database who's Department is 'Computer Application'.
*/


using MySql.Data.MySqlClient;
class Program{
    public static void Main(){
        string conn="SERVER=localhost;DATABASE=University;UID=root;PASSWORD=;";
        MySqlConnection con = new MySqlConnection(conn);
        con.Open();
        Console.WriteLine("Database Connected");
        string insertquery="INSERT INTO student VALUES(101,'Santosh Bhandari','Computer Application','Birtamode',200000),(102,'Aditya Oli','IOST','Bhadrapur',250000),(103,'Krishna Raj Awasti','Computer Application','Biratnagar',200000),(104,'Uttam Acharya','FOHSS','Bhadrapur',150000),(105,'Nithin Dangal','Computer Application','Birtamode',200000);";
        MySqlCommand cmd = new MySqlCommand(insertquery,con);
        cmd.ExecuteNonQuery();
        Console.WriteLine("Data Inserted Successfully!!!");
        string readdataquery="SELECT * FROM student WHERE Department='Computer Application';";
        MySqlCommand readcmd = new MySqlCommand(readdataquery,con);
        MySqlDataReader reader = readcmd.ExecuteReader();
        Console.WriteLine("Student Information\nRoll No.\tName\tDepartment\tAddress\tTution Fee");
        while(reader.Read()){
            int rollno=reader.GetInt32("RollNumber");
            string name = reader.GetString("Name");
            string department = reader.GetString("Department");
            string address = reader.GetString("Address");
            float fee = reader.GetFloat("Tution_Fee");
            Console.WriteLine($"{rollno}\t{name}\t{department}\t{address}\t{fee}");
        }
        con.Close();
    }
}