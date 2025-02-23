class AutoboxingUnboxing{
    public static void main(String args[]){
        int a=10;
        Integer i=new Integer(a);
        char ch='X';
        Character c=new Character(ch);
        Double db=103.54;
        Double d=new Double(db);
        System.out.println("After Wrappping:");
        System.out.println("Integer = "+i+"\nCharacter = "+c+"\nDouble = "+d);
        int a1= i; char c1= c; Double d1= d;
        System.out.println("After Unwrappping:");
        System.out.println("Integer = "+a1+"\nCharacter = "+c1+"\nDouble = "+d1);
    }
}