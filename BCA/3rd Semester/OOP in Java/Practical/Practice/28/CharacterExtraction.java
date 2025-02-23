class CharacterExtraction{
    public static void main(String args[]){
        String str = "Santosh";
        System.out.println(str.charAt(2));
        char s[]=new char[10];
        str.getChars(0,3,s,0);
        System.out.println(s);
        System.out.println(str.getBytes());
        System.out.println(str.toCharArray()); 
        System.out.println(str.indexOf('n')); 
    }
}