public class triangle extends figure{
    private final double[] sides=new double[3];
    private int view;
    public triangle(double[] sides){
        System.arraycopy(sides, 0, this.sides, 0, 3);
        view = 0;
    }
    public int getView() {
        return view;
    }
    public void workTriangle()throws Exception {
        double p;
        perimeter = sides[0] + sides[1] + sides[2];
        p = perimeter / 2;
        area = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
        if (area == 0) {
            throw new Exception ("Такого треугольника не существует");
        }
        if (sides[0] == sides[1] && sides[1] == sides[2])
            view = 1;
        else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2])
            view = 2;
        else view = 3;
    }
}