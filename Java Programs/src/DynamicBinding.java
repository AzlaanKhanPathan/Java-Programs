import java.security.Permission;

class Human{
    public void speak(){
        System.out.println("Person speaks");
    }
}
class Teacher extends Human{
    @Override
    public void speak(){
        System.out.println("Teacher speaks");
    }
}
class DynamicBinding{
    public static void main(String[] args){
        Human obj2 = new Human();
        obj2.speak();
        Teacher obj = new Teacher();
        obj.speak();
    }
}






