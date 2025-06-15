//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 1.5;
        double doubleOperandB = 2.5;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and "+ intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of ints of "+  intOperandA + " and " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of doubles " +  doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of "+ doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        double myLunchCost = 7.98;
        System.out.println("The lunch cost is $" + myLunchCost);
        int kidsInFamily = 4;
        System.out.println("There are "+ kidsInFamily + " kids in my family");
        boolean isRaining = false;
        System.out.println("Is it raining? " + isRaining);
        double gasPricePerGallon = 4.75;
        System.out.println("The price of a gallon of gas is $" +  gasPricePerGallon);
        int favNumber = 7;
        System.out.println("My favorite number is " + favNumber);
        double shoeSize = 9.5;
        System.out.println("My shoe size is " + shoeSize);
        String birthMonth = "March";
        System.out.println("My birth month is " + birthMonth);
        String fullName = "Ola Babiuch";
        System.out.println("My full name is " + fullName);



    }

}