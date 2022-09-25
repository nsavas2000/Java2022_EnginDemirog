public class Main {
    public static void main(String[] args) {
    System.out.println(topla(3,5));

    }
    public static  void add(){
        System.out.println("Eklendir");
    }
    public static  void delete(){
        System.out.println("Silindi");
    }
    public static  void update(){
        System.out.println("Güncellendi");
    }

    public static  int topla(int num1, int num2){
        int sonuc = num1 + num2;
        return sonuc;
    }
}