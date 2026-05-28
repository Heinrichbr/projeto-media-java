import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraMediaEscolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("=== CALCULADORA DE MÉDIA ESCOLAR ===");
        
        // Pede o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();
        
        // Pede a 1ª nota
        System.out.print("Digite a 1ª nota de " + nomeAluno + ": ");
        double nota1 = entrada.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
            nota1 = entrada.nextDouble();
        }
        
        //Parte2 NOTA
        System.out.print("Digite a 2ª nota de " + nomeAluno + ": ");
        double nota2 = entrada.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
            nota2 = entrada.nextDouble();
        }

        double media = (nota1 + nota2) / 2;

        System.out.println("\n----------------------------");
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2);
        System.out.println("Média final: " + df.format(media));

        // Situação do aluno
        if (media >= 7) {
            System.out.println("Situação: APROVADO");
        } else if (media >= 5) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        System.out.println("----------------------------");
        
        entrada.close();
    }
}