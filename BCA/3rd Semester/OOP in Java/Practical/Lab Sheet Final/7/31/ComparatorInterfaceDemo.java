import java.util.*;
class Student{
    int rno,age;
    String name;
    Student(int r, String n, int a){
        rno=r;
        name=n;
        age=a;
    }
}
class RollnoComparator implements Comparator <Student>{
    public int compare(Student s1, Student s2){
        if(s1.rno>s2.rno)
            return 1;
        else if(s1.rno<s2.rno)
            return -1;
        else    
            return 0;
    }
}
class ComparatorInterfaceDemo{
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(5,"Sita",22));
        list.add(new Student(1,"Ram",20));
        list.add(new Student(3,"Geeta",19));
        list.add(new Student(32,"Shyam",25));
        list.add(new Student(10,"Ravi",23));
        Collections.sort(list,new RollnoComparator());
        for(Student s: list)
            System.out.println(s.rno+"   "+s.name+"   "+s.age);
    }
}