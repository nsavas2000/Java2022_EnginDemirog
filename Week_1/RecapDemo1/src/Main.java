public class Main {
    public static void main(String[] args) {
        int num1 = 111;
        int num2 = 11;
        int num3 = 1;

        int biggestNum = num1;


        if(biggestNum<num2){
            biggestNum = num2;
        }
        if (biggestNum<num3){
            biggestNum = num3;
        }
        System.out.println("The biggest number : " +biggestNum);
    }
}