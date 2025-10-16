public class TestCircle{
    public static void main (String[]args){
        Circle c1= new Circle();
        System.out.println("The Circle has Radius of"
                +c1.getRadius(2.2)+"and area of"+ c1.getArea());
        Circle c2= new Circle(2.0);
        System.out.println("The Circle has Radius of"
                +c2.getRadius(2.2)+"and area of"+ c2.getArea());


    }
}