public class MutableVsImmutableString {
    public static void main(String[] args) {
        String name = "Hari";

        name +="haran";

        System.out.println("Hello "+name);

        String s1 = "Hari";
        String s2 = "Hari";

        System.out.println(s1==s2);

    }
}
