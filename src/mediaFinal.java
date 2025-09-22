import java.util.Scanner;

public class mediaFinal {
    String nomeDoAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaFinal;
    double media;
    String situacao;

    public void obterDados (){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do aluno(a):");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota:");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota:");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota:");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota:");
        nota4 = leitor.nextDouble();
        calcularDados();
    }

    public void calcularDados(){
        media = nota1 + nota2 + nota3 + nota4;
        mediaFinal = media /4;
        definirAprovadoReprovado();
    }
    public void definirAprovadoReprovado(){
        if (mediaFinal >= 5) {
            situacao = "Aprovado!";
        } else {
            situacao = "Reprovado!";
        }
        exibirResultados();
    }

    public void exibirResultados(){
        System.out.println("---------------------------------------");
        System.out.println("média do aluno:" + mediaFinal);

        System.out.println("Resultado: o(a) aluno(a) " + nomeDoAluno + " está : " + situacao);
    }
}
