public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Loop Finish");

        System.out.println(".................");

        int i=2 ;

        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Loop Finish");

        System.out.println(".................");

        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do- While Loop Finish");
    }
}