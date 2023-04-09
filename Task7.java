import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(-25);
list.add(4006);

int min = list.get(0);
int max = list.get(0);

for (Integer i: list) {
    if(i < min) 
        min = i;
    if(i > max) 
        max = i;
}

System.out.println("минимальное число: " + min);
System.out.println("максимальное число: " + max);
}
}

