// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Task4 {
    public static void bubbleSort(int[] sortArr){
        Loger ll = Loger.getLogger(lg.class.getName());
        String LogsPatch = 'log.txt';
        FileHandler fh = new FileHandler(logsPatch, append:false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    ll.log(Level.INFO, "perestanovka:" + swap)
                }
            }
        }
    }
    
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}
