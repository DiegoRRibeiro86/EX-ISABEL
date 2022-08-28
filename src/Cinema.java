import java.util.Objects;
import java.util.Scanner;

/*
O sistema deve controlar a faixa etária dos clientes e a capacidade das salas. A prioridade no agendamento é por ordem
 de chegada.

1° Usuário informa nome, idade e filme.
2° Sistema confere se a faixa etária condiz e se tem vaga. Sistema também deve conferir se atingiu o limite de entradas de usuário.
3° Sistema deve imprimir na primeira linha o filme e embaixo os relacionados para aquele filme por ordem alfabética.
 */
public class Cinema {
    static final Integer FAIXA_ETARIA_BATMAN = 16;
    static final Integer FAIXA_ETARIA_OS_VINGADORES = 12;
    static final Integer FAIXA_ETARIA_PORTO_SEGURO = null;
    static final Integer CAPACIDADE_TOTAL_BATMAN = 3;
    static final Integer CAPACIDADE_TOTAL_OS_VINGADORES = 4;
    static final Integer CAPACIDADE_TOTAL_PORTO_SEGURO = 2;
    static final Integer CAPACIDADE_TOTAL_SALA = 15;            // Acabando as vagas não deve aceitar mais agendamentos.
    static final Integer CAPACIDADE_TOTAL_AGENDAMENTO = 15;     // Atingindo o limite não deve aceitar mais agendamentos.

    public static void main(String[] args) {

        String[] filmes = new String[]{"Batman","Os Vingadores","Porto Seguro"};

        Scanner scanner = new Scanner(System.in);    // FALTA CRIAR OS VETORES E MANIPULAR ELE.
                                                    // FALTA APLICAR AS CONDIÇÕES QUE ESTÃO COMENTADAS.

/*      1° Usuário informa nome, idade e filme.  */
        System.out.println("****** CINE VITÓRIA ******");
        System.out.println();
        System.out.println("Seja bem vindo ao agendamento!");
        System.out.print("Informe seu nome: ");
        String nome = scanner.next();
        System.out.print("Agora informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Nossa programação: ");

        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "° opção: " + filmes[i]);
        }
        for (int j = 0; j < 16; j++) {
            System.out.println("Escolha o filme desejado: [1] [2] [3] ");
            int opcaoFilme = scanner.nextInt();

            if (opcaoFilme == 1) {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Filme escolhido: " + filmes[0]);
            } else if (opcaoFilme == 2) {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Filme escolhido: " + filmes[1]);
            } else if (opcaoFilme == 3) {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Filme escolhido: " + filmes[2]);
            }
        }

/*    2° Sistema confere se a faixa etária condiz e se tem vaga. Sistema também deve conferir
      se atingiu o limite de entradas de usuário. */

        // se a capacidade total de agendamento não exceder, ler linha debaixo
        // se a capacidade total de lotação não exceder, ler linha debaixo
        // se a capacidade da sala do filme em questão não exceder, ler linha debaixo
        if (Objects.equals(filmes, "Batman")) {
            if (idade >= FAIXA_ETARIA_BATMAN) {
                // adiciona no vetor do filme em questão
            }
        }
        // se a capacidade total de agendamento de pessoas não exceder, ler linha debaixo
        // se a capacidade total de lotação de salas não exceder, ler linha debaixo
        // se a capacidade da sala do filme em questão não exceder, ler linha debaixo
        if (Objects.equals(filmes, "Os Vingadores")) {
            if (idade >= FAIXA_ETARIA_OS_VINGADORES) {
                // adiciona no vetor do filme em questão
            }
        }
        // se a capacidade total de agendamento de pessoas não exceder, ler linha debaixo
        // se a capacidade total de lotação de salas não exceder, ler linha debaixo
        // se a capacidade da sala do filme em questão não exceder, ler linha debaixo
        if (Objects.equals(filmes, "Porto Seguro")) {
            if (idade >= FAIXA_ETARIA_PORTO_SEGURO) {
                // adiciona no vetor do filme em questão
            }
        }


/*    3° Sistema deve imprimir na primeira linha o filme e embaixo os relacionados para aquele filme por ordem alfabética. */

        for (int i = 0; i < ; i++) {
            System.out.println(); // nome do filme
            for (int j = 0; j < ; j++) {
                System.out.println(); // nome das pessoas que agendaram para o filme
            }
        }

        scanner.close();
    }
}
