import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double average = 0;
       double grade = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Avaliação: ");
            grade = entrada.nextDouble();
            average += grade;
        }

        System.out.println("Média das avaliações: " + average/3);

    }
}
