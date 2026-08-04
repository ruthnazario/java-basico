public class OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5};

        System.out.println("Numeros: ");

        int contador = 0;

        while (contador < (numeros.length)) {
            System.out.println(numeros[contador] + " ");
            contador++;
        }

        System.out.println("\nContagem Regressiva: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i] + " ");
        }
    }
}
