import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        if ( n%2 == 0 && n>2) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}
