import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite medida de um triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite medida de um triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("valor de x: %.4f\n",areax);
        System.out.printf("valor de y: %.4f\n",areay);

        if(areax > areay){
            System.out.print("maior area X");
        }
        else{
            System.out.print("maior area Y");
        }


    }
}
