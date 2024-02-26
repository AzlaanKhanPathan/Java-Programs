abstract class Top{
    abstract void draw();
}
class Sha1 extends Top{
     void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Sha2 extends Top{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class draw{
    public static void main(String[] args){
        Top s = new Sha2();
        s.draw();
    }
}