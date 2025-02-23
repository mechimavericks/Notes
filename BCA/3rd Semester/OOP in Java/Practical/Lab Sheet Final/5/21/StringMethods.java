class StringMethods{
    public static void main(String args[]){
        String str1="Hello ",str2="World";
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str2.indexOf("l"));
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.equals(str2));
        System.out.println(str1.replaceAll("l","o"));
        
    }
}