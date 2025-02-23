class StringMethods{
    public static void main(String []args){
        char []a={' ','H','e','l','l','o'};
        String str1=new String(a);
        String str2="     WorlD";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str1.concat(str2));
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.trim());
        System.out.println(str1.isEmpty());
        System.out.println(str2.compareTo(str1));
    }
}