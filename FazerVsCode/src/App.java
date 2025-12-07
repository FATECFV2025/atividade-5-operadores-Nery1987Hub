import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();

        Scanner sc = new Scanner(System.in);

        System.out.println();
        float x = sc.nextInt();

        System.out.println();
        float y = sc.nextInt();

        System.out.println(op.adicao(x, y));
        System.out.println(op.subt(x, y));
        System.out.println(op.multi(x, y));
        System.out.println(op.divis(x, y));
    }
}
