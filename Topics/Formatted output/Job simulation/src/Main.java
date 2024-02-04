public class Main {
    public static void main(String[] args) {
        String textBlock = """
                Hello\\sWord\\n!
                Hello Java\\s!""";

        System.out.println(textBlock.translateEscapes());
    }
}