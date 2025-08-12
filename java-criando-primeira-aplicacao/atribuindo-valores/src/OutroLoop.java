import java.util.Scanner;
public class OutroLoop {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double average = 0;
        double grade = 0;
        int gradetotal = 0;

        while (grade != -1) {
            System.out.println("Avaliação (-1 para encerrar) : ");
            grade = entrada.nextDouble();

            if (grade != -1) {
                average += grade;
                gradetotal++;
            }

        }

        System.out.println("Média das avaliações: " + average / gradetotal);

    }
}
