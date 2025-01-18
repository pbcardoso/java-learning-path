import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Porque iniciar o 0 evita problemas?
        boolean validEntry;

        do {
            validEntry = false; // Começa como entrada falsa
            System.out.println("Digite um número (0 para sair): ");
            try {
                number = scanner.nextInt(); // Tenta ler a entrada como número inteiro
                validEntry = true; // Marca como válida se a leitura for bem-sucedida
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer de entrada para evitar loops infinitos
            }
        } while (!validEntry || number != 0); // Continua até o usuário digitar 0

        System.out.println("Você saiu do programa.");
        scanner.close();
    }

}