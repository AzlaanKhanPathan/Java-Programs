class world{
    int id; String name; float salary;
    void insert (int i,String n,float s) {
        id=i;
        name = n;
        salary = s;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
class TestEmployee {
    public static void main(String[] args) {
        world e1 = new world();
        world e2 = new world();
        world e3 = new world();
        e1.insert(101, "beast", 90000);
        e2.insert(102, "ray", 80000);
        e3.insert(103, "raj", 100000);
        e1.display();
        e2.display();
        e3.display();
    }
}
class Hello{
    public Hello()
    {
        System.out.println("this is a no argument constructor");
    }
    public static void main(String[] args){
        new Hello();
    }
}
class Addition{
    public static void main(String[] args){
        int a=20;
        int b=50;
        int c=a+b;

        System.out.println("Addition of"  +a+  "is" +b+  "=" +c );
    }

}
