import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para X: ");
        float x = sc.nextInt();

        System.out.println("Digite um valor para Y: ");
        float y = sc.nextInt();

        System.out.println("Adição de x e y = " + op.adicao(x, y));
        System.out.println("Subtração de x e y = " + op.subt(x, y));
        System.out.println("Multiplicação de x e y = " + op.multi(x, y));
        System.out.println("Divisão de x e y = " + op.divis(x, y));
        System.out.println("_________________");

        System.out.println("X += Y: " + op.maisIgual(x, y));
        System.out.println("X -= Y: " + op.menosIgual(x, y));
        System.out.println("X *= Y: " + op.vezesIgual(x, y));
        System.out.println("X /= Y: " + op.divideIgual(x, y));
        System.out.println("_________________");

        System.out.println("Neste momento, são utilizadas as variáveis A e B.\nA = FALSE");
        boolean a = false;

        System.out.println("B = TRUE");
        boolean b = true;

        System.out.println("a == a && b == a: " + op.andAnd(a, b));
        System.out.println("b == b & b == a: " + op.and(a, b));
        System.out.println("b != b || b == a: " + op.orOR(a, b));
        System.out.println("b != b | x == x: " + op.or(a, b));
        System.out.println("a ^ b: " + op.exclusivo(a, b));
        System.out.println("a == b é false. !(a == b): " + op.nao(a, b));
        System.out.println("_________________");
    }
}
