import java.util.Scanner;
class Students{
    private String name;
    private int roll, semester;
    void setData(int roll, String name, int semester){
        this.roll=roll; // Here this.roll represent the private Int Roll.
        this.name=name;
        this.semester=semester;
    }
    void Display(){
        System.out.println("Roll No. = "+roll+"\nName = "+name+"\nSemester = "+semester);
    }
}
class ThisExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Students s1=new Students();
        System.out.println("Enter the Roll No., Name and Semester of Student: ");
        int r=sc.nextInt(); 
        String n=sc.next();
        int s=sc.nextInt();
        s1.setData(r,n,s);
        s1.Display();
    }
}