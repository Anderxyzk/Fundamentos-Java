//Scanner lib; to help me read the user Input.
import java.util.Scanner;

void main() {

    //Initializing values
    String name = "Anderson Eloi";
    String accType = "Corrente";
    double initialValue = 2302;
    int userInput = 0;

    //Showing on terminal
    System.out.printf("""
            
            Dados do cliente:
            
            Nome: %s
            Tipo de Conta: %s
            Saldo Inicial: R$%.2f
            """, name, accType, initialValue);

    //Creating simple menu
    String menu = """
            
            Operações:
            
            [1] - Mostrar saldo
            [2] - Depositar valor
            [3] - Sacar valor
            [4] - Sair
            """;

    //Scanner to scan (lol) the user input
    Scanner dataEntrance = new Scanner(System.in);

    //Loop while to: while userInput is different of 4, he keeps popping up the menu and get the user input.
    while (userInput != 4) {
        System.out.println(menu);
        userInput = dataEntrance.nextInt();

        //Basic if else, else-if statement to do the operations.
        if (userInput == 1) {
            System.out.println("Saldo atual " + initialValue);
        } else if (userInput == 2) {
            System.out.println("Quanto você quer depositar: ");
            double currentValue = dataEntrance.nextDouble();
            currentValue += initialValue;
            System.out.println("Saldo atual: " + currentValue);
        } else if (userInput == 3) {
            System.out.println("Quanto você quer sacar: ");
            double currentValue = dataEntrance.nextDouble();
            if (currentValue > initialValue) {
                System.out.println("Saldo insuficiente!");
            } else{
                initialValue -= currentValue;
                System.out.println("Saldo atualizado: " + initialValue);
            }
        //Turn off the while loop, close program.
        } else {
            System.out.println("Até a próxima, obrigado!");
        }
    }
}
