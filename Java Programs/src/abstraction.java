interface Drawable{
    void draw();
}
class Shape1 implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Shape2 implements Drawable{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class output{
    public static void main(String[] args){
        Drawable d = new Shape2();
        d.draw();
    }
}