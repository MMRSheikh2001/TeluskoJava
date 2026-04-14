import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        boolean a = false;
        System.out.println(!a);
        if (a == true) {
            System.out.println("Me");
        }
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        System.out.println(n);
        char ap='u';
        System.out.println(ap);

    }
}
