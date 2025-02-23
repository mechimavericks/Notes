class Details{
    private String name;
    private int age;
    void getData(String n, int a){
        name = n;
        age =a;
    }
    void setData(){
        System.out.println("Name = "+name+"\nAge = "+age);
    }
}
class EncapsulationProgram{
    public static void main(String[] args){
        Details obj=new Details();
        obj.getData("Kiran",28);
        obj.setData();
    }
}