import java.util.Scanner;

class Derivative {

    private static void menuDriven() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter a menu option to continue to find derivative \n \t 1.Polynomial of degree n \n\t 2.Trignometric");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Enter the highest degree ");
                int n = sc.nextInt();
                polyMethod(sc, n);
                break;
            case 2:
                System.out.println("Enter a trignometric fn");
                String s = sc.next();
                System.out.println(trigMethod(s));
                break;
            default:
                System.out.println("Error!!!");

        }

    }

    private static String trigMethod(String s) {
        String sin = "cos";
        String cos = "-sin";
        String tan = "sec^2";
        if (s == "sinx")
            return sin;
        else if (s == "cosx")
            return cos;
        else if (s == "tanx")
            return tan;
        else
            return "";
    }

    private static void polyMethod(Scanner sc, int n) {
        int a[] = new int[n + 1];
        for (int j = n; j >= 0; --j) {
            System.out.println("Enter co efficients x^" + j);
            a[n - j] = sc.nextInt();
        }
        for (int j = n; j > -1; --j) {
            a[n - j] = a[n - j] * j;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + "x^" + (n - j - 1));
            if (j != n - 1) {
                System.out.print("+");
            }
        }
        System.out.println();
        sc.close();
    }

    public static void main(String[] args) {
        menuDriven();
    }
}