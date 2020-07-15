import java.util.Scanner;

public class testTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int j = i + 1;
            System.out.print("Введите " + j + " элемент массива: ");
            array[i] = scan.nextInt();
        }
        for( int i = 0; i< array.length; i++){
            if(array[i]%3==0){
                System.out.print(array[i] + " ");

            }
        }
    }
}
