import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int somaPares = 0;
        int somaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorTotal = 0;

        System.out.println("Quantos números você deseja inserir?");
        quantidadeNumeros = scanner.nextInt();

    do{
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            somaPares += numero;
            contadorPares++;
        } else {
            somaImpares += numero;
            contadorImpares++;
        }
        contadorTotal++;
    } while (contadorTotal < quantidadeNumeros);
    System.out.println("Soma dos números pares: " + somaPares);
    System.out.println("Soma dos números ímpares: " + somaImpares);
    System.out.println("Quantidade de números pares: " + contadorPares);
    System.out.println("Quantidade de números ímpares: " + contadorImpares);
    }
}
