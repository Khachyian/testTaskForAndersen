import java.util.Scanner;

public class testTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }
    }

}
