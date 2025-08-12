void main() {

    double initialPrice = 150.00;
    double discountPer = 0.10;
    double calc = initialPrice * discountPer;
    double currentValue = initialPrice - calc;

    System.out.printf("Valor original do produto: R$%.2f\nDesconto: R$%.2f\nValor final: R$%.2f", initialPrice, calc, currentValue);
}
