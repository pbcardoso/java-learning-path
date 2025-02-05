import java.util.Scanner;
import java.util.InputMismatchException;

public class diaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = -1;

        do {
            System.out.println("Digite um número de 1 a 7 (0 para sair): ");
            try {
                dia = scanner.nextInt();
                switch (dia) {
                    case 1:
                        System.out.println("Domingo");
                        break;
                    case 2:
                        System.out.println("Segunda-feira");
                        break;
                    case 3:
                        System.out.println("Terça-feira");
                        break;
                    case 4:
                        System.out.println("Quarta-feira");
                        break;
                    case 5:
                        System.out.println("Quinta-feira");
                        break;
                    case 6:
                        System.out.println("Sexta-feira");
                        break;
                    case 7:
                        System.out.println("Sábado");
                        break;
                    case 0:
                        System.out.println("Você saiu do programa.");
                        break;
                    default:
                        System.out.println("Dia inválido! Por favor, digite um número de 1 a 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        } while (dia != 0);

        scanner.close();
    }
}   