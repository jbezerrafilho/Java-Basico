import com.loiane.cursojava.aulas.aula24.labs.FibonacciESomatorio;

public class FibonacciESomatorioTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.print(FibonacciESomatorio.fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println(FibonacciESomatorio.somatorio(5));
    }
}
