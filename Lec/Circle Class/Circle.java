public class Circle {
    private double radius;
    private String color;

    // CONSTRUCTORS
    public Circle(){
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius){
        this.radius=radius;
        this.color="red";
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    // GETTERS
    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    // SETTERS
    public void setRadius(double r){
        if(r<0){
            this.radius=radius;
        }
        else{
            this.radius = r;
        }
    }

    public void setColor(String c){
        this.color = c;
    }

    // AREA METHOD
    public double getArea(){
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }

    // CIRCUMFERENCE METHOD
    public double getCircumference(){
        double circumference = Math.PI * (2 * this.radius);
        return circumference;
    }

    // TOSTRING METHOD
    public String toString(){
        return "Radius : " + this.radius +"\nColor : " + this.color; 
    }

}
