public class Driver {
    public static void main(String[] args){
        Circle test = new Circle();

        // SETTING RADIUS
        test.setRadius(2.0);

        // SETTING COLOR
        test.setColor("Pink");
        
        // PRINTING AREA, CIRCUMFERENCE, RADIUS AND COLOR
        System.out.println(test.toString());
        System.out.println("Area: " + String.format("%.2f",test.getArea()));
        System.out.println("Circumference: " + String.format("%.2f",test.getCircumference()));
    }
}
