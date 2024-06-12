import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        int[] testScores;
        // Matriz para armazenar as pontuações dos cinco testes
        try ( // Criação de um objeto Scanner para entrada de dados pelo console
                Scanner scanner = new Scanner(System.in)) {
            // Matriz para armazenar as pontuações dos cinco testes
            testScores = new int[5];
            // Solicita ao usuário para inserir as pontuações dos testes e armazena na matriz
            for (int i = 0; i < 5; i++) {
                System.out.print("Insira a pontuacao do teste " + (i+1) + ": ");
                testScores[i] = scanner.nextInt();
            }
            // Fecha o objeto Scanner para liberar recursos
        }
        
        // Calcula a média das pontuações dos testes
        double averageScore = calculateAverage(testScores);
        
        // Exibe a média das pontuações dos testes
        System.out.println("A média das pontuacoes dos testes é: " + averageScore);
    }
    
    // Método para calcular a média das pontuações
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
