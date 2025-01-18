public class Variaveis {
    public static void main(String[] args) {
        int idade = 32; // Número inteiro
        double altura = 1.90; // Número decimal
        String nome = "Paulo"; // Texto
        boolean aprovado = true; // Valor booleano
        char inicial = 'P'; // Novo tipo char
        int anoAtual = 2025;
        int mesAtual = 1; //Janeiro
        int mesNascimento = 2; //Fevereiro
        int diaAtual = 17;
        int diaNascimento = 28;

        // Calculo do ano de nascimento
        int anoNascimento = anoAtual - idade;
        if (mesAtual < mesNascimento) {
            anoNascimento--; // Subtrai 1 do ano se o mês atual for antes do mês de nascimento
        } else if (mesAtual == mesNascimento) {
            // Verifica se o mês atual é igual ao mês de nascimento
            if (diaAtual < diaNascimento) {
                // Verifica se o fia atual é menor/anterior ao dia do nascimento
                anoNascimento--;
            }
        }


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Aprovado: " + aprovado);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("Ano de nascimento: " + anoNascimento);
    }
}
