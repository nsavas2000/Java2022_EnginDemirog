public class Main {

    public static void main (String[] args) {

        double[] myList = {1.2 , 2.5, 6.7, 3.9};
        double total = 0;
        double max = myList[0];

        for (double number:myList){
            if (max<number)
                max = number;
            total = total + number ;
            System.out.println(number);
        }
        System.out.println("Total: " + total);
        System.out.println("The biggest number: " + max);ssss
    }
}
