public class figure {
    protected double area;
    protected double perimeter;
    protected static int type;
    public figure(){
        area = 0;
        perimeter = 0;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public static void setType(int e) {
        type = e;
    }
}
