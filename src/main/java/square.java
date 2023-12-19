public class square extends figure{
    private double a;
    private double diagonal;
    public square(double a){
        this.a = a;
        diagonal = 0;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void workSquare(){
        diagonal=Math.sqrt(2)*a;
        area=Math.pow(a,2);
        perimeter = a * 4;
    }
}
