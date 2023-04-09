// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

// Вывести все простые числа от 1 до 1000




import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        int summa = 0;
        int proizvedenie=1;

        for (int index = 1; index <= number; index++) {
            summa = summa + index;
            proizvedenie = proizvedenie*index;
        
        }
        System.out.printf("сумма -> %d", summa); 
        System.out.printf("\nпроизведение -> %d", proizvedenie);  
    }
}