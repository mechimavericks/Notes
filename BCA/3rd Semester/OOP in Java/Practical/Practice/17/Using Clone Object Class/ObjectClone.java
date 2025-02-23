import java.util.Date;
class ObjectClone{
    public static void main(String args[]){
        Date d1 = new Date();
        Date d2 = (Date) d1.clone(); //cloning the object d1 
        System.out.println(d1);
        System.out.println(d2);
    }
}