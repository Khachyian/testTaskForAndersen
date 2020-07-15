import java.util.Scanner;

public class testTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет ");
        } else {
            System.out.println("Введеное число меньше 7");
        }
        scanner.close();
    }

}

