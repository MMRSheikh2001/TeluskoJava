import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        for (int i = 0; i < 100; i++) {
            System.out.println("hello" + i);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " is the number");
        sc.close();

    }
}