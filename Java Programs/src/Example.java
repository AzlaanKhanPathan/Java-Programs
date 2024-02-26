class Example {
    public static void main(String[] args){
        String string="Java Program";
        String reversedStr="";
        for(int i=string.length()-1; i>=0; i--){
            reversedStr=reversedStr+string.charAt(i);
        }
        System.out.println("Original String: "+ string);
        System.out.println("reverse of the given string: "+reversedStr);
    }
}
