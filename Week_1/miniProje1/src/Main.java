public class Main {
    public static void main(String[] args) {

        int number = 9;
        int counter = 0;

        if (number < 1) {
            System.out.println("Invalid Number");
        }
        if (number == 1) {
            System.out.println("Number is not Prime Number");
        }

        for (int i = 2; i < number; i++) {
            if(number%i==0)
                counter++;

            }
        if (counter==0)
            System.out.println("Number is Prime Number");
        else
            System.out.println("Number is not Prime Number");


        }
    }
