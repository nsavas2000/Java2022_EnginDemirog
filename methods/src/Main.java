public class Main {
    public static void main(String[] args) {

        findNumber();

    }

    public static void findNumber(){
        int[] numbers = {1,6,7,4,8,12,65,9};
        int search = 6;
        boolean result = true;

        for (int num : numbers) {
            if (num==search){
                result = true;
                break;
            }
        }
        if (result){
            sendMessage("Sayı mevcuttur "+search);
        }else{
            sendMessage("Sayı mevcuttur değildir "+search);
        }
    }
    public static void sendMessage(String message){
        System.out.println(message);
    }
}