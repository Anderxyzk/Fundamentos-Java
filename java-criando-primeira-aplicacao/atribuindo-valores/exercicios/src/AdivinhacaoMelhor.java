void main() {
    //Scanner to get User Input.
    Scanner userInput = new Scanner(System.in);

    //Random Computer number (between 0 and 100).
    int computerNumber = new Random().nextInt(100);

    //Attempts counter.
    int attempts = 0;

    //Basic while loop to: didn't let the user input more than 5 times, and keeps looping until the user reach 5 played times.
    while (attempts < 5) {
        System.out.println("Digite um número [0 - 100]:");
        int userChoose = userInput.nextInt();
        attempts++;

        //Basic if else, else-if statement to: Check if the user Choose is equal or bigger or lower or different from Computer Number.
        if (userChoose == computerNumber) {
            System.out.printf("Você acertou o número do computador! Com %d tentativas!", attempts);
            break;

        } else if (userChoose < computerNumber) {
            System.out.println("O número do computador é maior!");
        } else {
            System.out.println("O número do computador é menor!");
        }
        //If the player reach 5 played times, output this message and close the program.
        if (attempts == 5) {
            System.out.println("Você atingiu o máximo de tentativas");
        }
    }
}
