import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para X: ");
        float x = sc.nextInt();

        System.out.println("Digite um valor para Y: ");
        float y = sc.nextInt();

        System.out.println("Adição" + op.adicao(x, y));
        System.out.println("Subtração" + op.subt(x, y));
        System.out.println("Divisão" + op.multi(x, y));
        System.out.println("Multiplicação" + op.divis(x, y));
        System.out.println("_________________");

        System.out.println("X += Y: " + op.maisIgual(x, y));
        System.out.println("X -= Y: " + op.menosIgual(x, y));
        System.out.println("X *= Y: " + op.vezesIgual(x, y));
        System.out.println("X /= Y: " + op.divideIgual(x, y));
        System.out.println("_________________");

        
    }
}
