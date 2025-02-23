// Write a program in JAVA to create a class Bird also declares the different parameterized constructor to display the name of Birds.
class Bird{
    Bird(String name){
        System.out.println("Name = "+name);
    }
    Bird(String name, float weight){
        System.out.println("Name = "+name+"\nWeight = "+weight);
    }
    Bird(String name, int age, float weight){
        System.out.println("Name = "+name+"\nAge = "+age+"\nWeight = "+weight);  
    }
}
class DifferentParameterDemo {
    public static void main(String[] args) {
        Bird b1=new Bird("Sparrow");
        Bird b2=new Bird("Dove",0.5f);
        Bird b3=new Bird("Parrot",2,0.9f);
    }
}
