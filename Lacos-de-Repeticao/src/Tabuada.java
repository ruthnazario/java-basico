import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada de: " + tabuada);
       
        for (int i = 1; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }
    }
}
