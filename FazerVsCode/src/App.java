import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();

        Scanner sc = new Scanner(System.in);

        System.out.println();
        int x = sc.nextInt();

        System.out.println();
        int y = sc.nextInt();

        System.out.println(op.subt(x, y));
    }
}
