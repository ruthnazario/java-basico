import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double media = 0;
        double maior = 0;

        int contador = 0;

        do {
            System.out.println("Digite um número: ");
            double numero = scanner.nextDouble();

            soma += numero;
            contador = contador + 1;

            if (numero > maior) {
                maior = numero;
            }
        } while (contador < 5);

        media = soma / 5;
        System.out.println("A média é: " + media);
        System.out.println("O maior número digitado é: " + maior);  


    }
}
