public class Main {
    public static void main(String[] args) {
        int toplam = topla(5,6,9);
        System.out.println("Toplam "+toplam);

    }

    public static int topla(int... nums){
        int toplam = 0;
        for(int num:nums){
            toplam+=num;
        }
        return toplam;
    }
}