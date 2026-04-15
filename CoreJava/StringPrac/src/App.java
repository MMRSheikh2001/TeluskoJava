public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int i = 4;
        int result = ++i;
        result = i++;
        System.out.println(result);
        System.out.println(result == i);
    }
}
