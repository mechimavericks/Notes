class AnimalData{
    public static void main(String[] args){
        Animal a1=new Animal();
        Animal a2=new Animal();
        a1.Data("Cat","Grey",5,1);
        a2.Data("Dog","White",20,3);
        a1.Display();
        a2.Display();
    }
}
class Animal{
    private String name,color;
    private int weight, height;
    void Data(String n, String c, int w, int h){
        name =n;
        color = c;
        weight = w;
        height = h;
    }
    void Display(){
        System.out.println("Name = "+name+"\nColor = "+color+"\nWeight = "+weight+"KG\nHeight = "+height+"ft");
    }
}