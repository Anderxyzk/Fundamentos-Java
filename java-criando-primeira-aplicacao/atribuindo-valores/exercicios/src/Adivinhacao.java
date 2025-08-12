//V1 (BAD).
void main() {
    Scanner userInput = new Scanner(System.in);

    //Random Num from Java.
    int computerChoice = new Random().nextInt(100);
    System.out.printf("\nO computador escolheu: " + computerChoice);

    //For loop to: didn't let the user input more than 5 numbers, and keeps looping until the user reach 5 played times.
    for (int cout = 1; cout <= 5; cout++) {
        System.out.println("\nDigite um número [1 - 100]: ");

        //Getting user input.
        int userChoice = userInput.nextInt();
        System.out.printf("Você escolheu: " + userChoice);

        //Basic if-else statement to check if the UserInput is equal or different to the Computer Choice.
        if (userChoice < computerChoice) {
            System.out.println("\nnúmero escolhido pelo computador é maior!");
        }

        if (userChoice > computerChoice) {
            System.out.println("\nnúmero escolhido pelo computador é menor!");
        }

        if (userChoice == computerChoice) {
            System.out.println("\nVocê acertou!");
            break;
        } else {
            System.out.println("\nVocê atingiu o número máximo de tentativas!");
        }
    }
}
