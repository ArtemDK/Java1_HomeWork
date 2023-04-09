// Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        for (int i = 2; i <= number; i++) {
            Integer rez = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    rez = null;
                    break;
                }
            }
            if (rez != null) {
            System.out.println(rez);
            }  
        }
    }   
}
