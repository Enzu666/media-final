import java.util.Scanner;

public class mediaFinal {
    String nomeDoAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaFinal;
    double media;

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

}
