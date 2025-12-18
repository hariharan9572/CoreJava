public class Strings {
    public static void main(String[] args) {
        // String name = "Hari";

        String name = new String("Hari");

        System.out.println("Hello "+name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));
        System.out.println(name.concat("haran"));
    }
}
