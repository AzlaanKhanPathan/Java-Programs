interface Shape{
    public Double calculateArea();
}
class Rectangle implements Shape{
    Double length;
    Double width;
    public Double calculateArea(){
        return length*width;
    }
}
class Circle implements Shape{
    public Double radius;
    public Double calculateArea(){
        return (22.0/7)*radius*radius;
    }
}
class AreaCalculator{
    public Double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }
}
class RESULT{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.length = 10.5;
        r.width = 20.0;
        AreaCalculator a= new AreaCalculator();
        System.out.println(a.calculateShapeArea(r));
        Circle c=new Circle();
        c.radius=1.0;
        System.out.println(a.calculateShapeArea(c));
    }
}