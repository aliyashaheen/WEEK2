import java.util.Scanner;
class circle{
    double r;

    double calculatearea(double r){
        return 3.14*r*r;
    }

    void display(double r){
        double area = calculatearea(r);
        System.out.println(area);
    }
}
public class areaofcircle{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius");
    double r= sc.nextDouble();

    circle cir = new circle();
    cir.display(r);
    sc.close();
}
}
