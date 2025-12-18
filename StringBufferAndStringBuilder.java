public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hari"); // String Buffer is thread safe and String Builder is non thread safe (cover later)

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("haran");

        // String str = sb.toString();

        // System.out.println(str);

        // sb.deleteCharAt(1);
        // sb.insert(0, "Java ");

        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);
        
    }
}
