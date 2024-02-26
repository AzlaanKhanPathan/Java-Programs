class Test{
    public static void main(String[] args){
        int a = 50;
        Integer a3=Integer.valueOf(a);
        Integer a4=a;
        System.out.println("a3=" + a3);
        System.out.println("a4=" + a4);
    }
}
class Student {
    static int a;
    static int b;

    public static void setData(int c, int d) {
        a = c;
        b = d;
    }

    public static void showData() {
        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setData(1, 2);
        s2.setData(3, 4);
        s1.showData();
        s2.showData();
    }
}

