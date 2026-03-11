import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante aluno = new Estudante("","");

        System.out.print("Digite seu nome: ");
        aluno.setNome(sc.nextLine());
        boolean cpfValido = false;
        /* System.out.print("Digite seu CPF: ");
         String seuCpf = sc.nextLine();

        Estudante estudante1 = new Estudante(aluno,seuCpf);

        try {
            System.out.print("TESTE DE CPF COM 10 DIGITOS: ");
                estudante1.setCpf("1234567890");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

         */
        while (!cpfValido) {
            try {
                System.out.print("Digite seu CPF: ");
                String seuCpf = sc.nextLine();
                aluno.setCpf(seuCpf);
                cpfValido = true;
                System.out.println("CPF " + seuCpf + " aceito");
            } catch (Exception e) {
                System.err.println("Erro: " + e.getMessage());
                System.out.println("");
            }
        }

        System.out.println("Cadastro concluído para: " + "\nNome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf());


    }
}

/*
 Crie um programa que lê os dados de um estudante (Nome e CPF)
 O seu programa deve sempre pedir ao usuário para digitar
 novamente o CPF caso o valor digitado seja inválido (se setCpf()
 lança exceção.

 Digite seu nome: antonio
 Digite seu CPF: 123
 CPF deve ter 11 dígitos.
 Digite seu CPF: 1234
 CPF deve ter 11 dígitos.
 Digite seu CPF: 12312312312
 Cadastro concluido para:
 Nome: antonio
 CPF: 12312312312

 */