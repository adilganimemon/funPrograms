import static java.lang.Math.pow;

public class StringToInteger {

    public static void main(String args[]) {
        String number = "429";

        int decimalMul = number.length() - 1;
        int finalNumber = 0;
        for(int i = 0; i < number.length(); i++) {
            finalNumber += (number.charAt(i) - '0')*pow(10, decimalMul);
            decimalMul--;
        }
        System.out.println("Final number is: " + finalNumber);
    }
}
