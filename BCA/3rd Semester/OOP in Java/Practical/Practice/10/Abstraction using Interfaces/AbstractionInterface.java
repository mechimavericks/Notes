interface Students{
    void Faculty();
    void Course();
    void Subject();
}
class Student1 implements Students{
    public void Faculty(){
        System.out.println("Faculty of Management");
    }
    public void Course(){
        System.out.println("Bachelor in Business Studies");
    }
    public void Subject(){
        System.out.println("Principle of Accounting");
    }
}
class Student2 implements Students{
    public void Faculty(){
        System.out.println("Faculty of Humanities and Social Sciences");
    }
    public void Course(){
        System.out.println("Bachelor in Compute Application");
    }
    public void Subject(){
        System.out.println("OOP in Java");
    }
}
// class Student3 implements Students{
//     public void Faculty(){
//         System.out.println("Faculty of Management");
//     }
//     public void Course(){
//         System.out.println("Bachelor in Information Management");
//     }
//     public void Subject(){
//         System.out.println("C++ Programming");
//     }
// }
class AbstractionInterface{
    public static void main(String args[]) {
        Student1 s1=new Student1();
        Student2 s2=new Student2();
        // Student3 s3=new Student3();
        System.out.println("Displaying Student1 Data:");
        s1.Faculty();
        s1.Course();
        s1.Subject();
        System.out.println("Displaying Student2 Data:");
        s2.Faculty();
        s2.Course();
        s2.Subject();        
        // System.out.println("Displaying Student1 Data:");
        // s3.Faculty();
        // s3.Course();
        // s3.Subject(); 
    }
}