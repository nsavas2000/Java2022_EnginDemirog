public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,5,7,9,0};

        int find = 15;

        boolean result = false;

        for (int num:numbers) {
            if (find == num){
                result = true;
                break;
            }


        }
        if (result){
            System.out.println(find+" sayısı bu dizideki sayıların arasında var.");
        }else{
            System.out.println(find+" sayısı bu dizideki sayıların arasında yok.");
        }
    }
}