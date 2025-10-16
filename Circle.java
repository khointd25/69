import static java.lang.Math.PI;

public class Circle{
private double radius;
private String color;
public Circle(){
    radius=1.0;
    color="red";
}
public Circle (double r){
    radius=r;
    color="red";
}
public double getRadius(double v){
    return radius;
}
public double getArea(){
    return radius*radius* PI;
}

    public double getCircumference(){
    return 2 *Math.PI *radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}



