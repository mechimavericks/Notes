import java.util.*;
class Sorting{
    public static void main(String args[]){
        String city[]={"Dharan","Dharan","Jhapa","Kathmandu","Ilam","Damak","Birtamode"};
        // TreeSet<String> list = new TreeSet<String>();
        // for(String data:city){
        // list.add(data);
        // }
        // System.out.println(list);
        String temp;
        for(int i=0;i<7;i++){
            for(int j=i+1;j<6;j++){
                if((city[i].compareTo(city[j]))>0){
                    temp=city[i];
                    city[i]=city[j];
                    city[j]=temp;
                }
            }
            
        }

        for(String data:city){
            System.out.println(data);
        }

    }
}