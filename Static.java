class Person {
    public void speak(){
        System.out.println("Person speaks");
    }
}
class Person2 extends Person {
    @Override
    public  void speak(){
        System.out.println("Teacher speaks");
    }
}
class StaticBinding{
    public static void main (String[] args){
        Person obj = new Person ();
        obj.speak();
        Person obj2 = new Person ();
        obj.speak();
    }
}