import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        int i,f,j = 0,k = 0;
        double e, s, p;
        double[] sides = new double[3];
        square[] one = new square[2];
        circle[][] two = new circle[2][2];
        triangle three = null;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("\n1-квадрат\n2-круг\n3-треугольник\nВыберите фигуру:");
            figure.setType(in.nextInt());
            f = 1;
            s = 0;
            p = 0;
            //Ввод и обработка
            switch (figure.type) {
                case 1:
                    System.out.print("Длина стороны квадрата:");
                    e = in.nextDouble();
                    one[j] = new square(e);
                    one[j].workSquare();
                    break;
                case 2:
                    System.out.print("Радиус круга:");
                    e = in.nextDouble();
                    two[j][k] = new circle(e);
                    two[j][k].workCircle();
                    break;
                case 3:
                    System.out.print("Длина сторон треугольника:");
                    for (i = 0; i < 3; i++) {
                        sides[i] = in.nextDouble();
                    }
                    three = new triangle(sides);
                    try {
                        three.workTriangle();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        f = 0;
                    }
                default:
                    ;
            }
            //Вывод результатов
            if (f == 1) {
                System.out.print("\nФигура: ");
                switch (figure.type) {
                    case 1:
                        System.out.print("квадрат");
                        e = one[j].getDiagonal();
                        System.out.printf("\nДиагональ: %f", e);
                        s = one[j].getArea();
                        p = one[j].getPerimeter();
                        break;
                    case 2:
                        System.out.println("круг");
                        e = two[j][k].getD();
                        System.out.printf("Диаметр: %f", e);
                        s = two[j][k].getArea();
                        p = two[j][k].getPerimeter();
                        break;
                    case 3:
                        i = three.getView();
                        switch (i) {
                            case 1:
                                System.out.print("равносторонний");
                                break;
                            case 2:
                                System.out.print("равнобедренный");
                                break;
                            case 3:
                                System.out.print("разносторонний");
                                break;
                            default:
                                ;
                        }
                        System.out.print(" треугольник");
                        s = three.getArea();
                        p = three.getPerimeter();
                        break;
                }
                System.out.printf("\nПлощадь: %f", s);
                System.out.printf("\nПериметр: %f\n", p);
            }
            k++;
            j++;
        }
        while (k<2);
    }
}