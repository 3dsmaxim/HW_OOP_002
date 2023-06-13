import java.util.Scanner;

public class Enter extends ActionsExpressions {
    private int a;
    private int b;

    public void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int numA = scanner.nextInt();
        this.a = numA;
        System.out.print("Введите второе значение: ");
        int numB = scanner.nextInt();
        this.b = numB;
        System.out.print("Введите действие: ");
        Character action = scanner.next().trim().charAt(0);
        scanner.close();

        switch (action) {
            case '+':
                Summ(a, b);

                break;
            case '-':
                Difference(a, b);

                break;
            case '*':
                Multiplication(a, b);

                break;
            case '/':
                Division(a, b);

                break;

        }

    }

}
