public class Main {
    public static void main(String[] args) {

        //Mükemmel sayı: Kendinden başka pozitif bölenlerinin toplamı kendisine eşit olan sayıdır.

        int number = 16;
        int counter = 0;

        for (int i = 1; i<number; i++){
            if (number%i==0)
                counter = counter + i;

        }
        if (counter==number)
            System.out.println(number+" Mükemmel sayıdır.");
        else System.out.println(number+" Mükemmel sayı değildir.");
    }
}