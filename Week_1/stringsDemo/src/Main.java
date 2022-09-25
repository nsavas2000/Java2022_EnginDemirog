public class Main {
    public static void main(String[] args) {

        System.out.println("String Ders1.............");
        String message="Today the weather is good.";

        System.out.println(message);
        System.out.println("Eleman Sayısı="+message.length());
        System.out.println("5.inci eleman="+message.charAt(4));
        System.out.println(message.concat(" Wonderful!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);

        System.out.println(message.indexOf("o"));

        System.out.println("String Ders2.............");
        System.out.println(message.replace(' ','_'));

        String newMessage = message.replace(' ','_');
        System.out.println(newMessage);

        System.out.println(message.substring(2));
        System.out.println(message.substring(2,5));

        System.out.println("......................");
        for (String word: message.split(" ")) {
            System.out.println(word);
            
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim());
    }
}