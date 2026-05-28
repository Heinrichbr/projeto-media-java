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
        
        entrada.close();
    }
}
