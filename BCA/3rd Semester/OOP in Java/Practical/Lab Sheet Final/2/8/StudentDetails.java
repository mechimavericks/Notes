// Write a program to create a class Student with data "name, city and age‟ along with method printData to display the data. Create the two objects s1 ,s2 to declare and access the value
class Student{
	String name,city;
	int age;
	void printData(){
		System.out.println("Name = "+name+"\nCity = "+city+"\nAge = "+age);
	}
}
class StudentDetails{
	public static void main(String[] args){
		Student s1 =new Student();
		Student s2 =new Student();
		s1.name= "Hari";
		s1.city="Birtamode";
		s1.age=20;
		s2.name="Anish";
		s2.city="Bhadrapur";
		s2.age=28;
		s1.printData();
		s2.printData();	
	}
}