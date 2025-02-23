class Data{
    private String name;
    private int rollno;
    public void SetData(String n, int r){
        name=n;
        rollno=r;
    }
    public void GetData(){
        System.out.println("Roll No. = "+rollno+"\nName = "+name);
    }
}
class Encapsulation{
    public static void main(String args[]){
        Data obj = new Data();
        obj.SetData("Santosh",58);
        obj.GetData();
    }
}