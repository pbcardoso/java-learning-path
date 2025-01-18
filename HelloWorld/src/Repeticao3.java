import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
        } while (numero != 0);

        System.out.println("Você saiu do programa.");
        scanner.close();
    }
}