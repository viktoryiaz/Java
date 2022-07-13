//Задача 3.1.1
//
// Дано число Х. Вывести абсолютную величину (модуль) число Х.
//
// Формат входных данных:
//  На единственной строке задано целое число Х. -10^9 <= X <= 10^9
//
// Формат выходных данных:
//  Одно число - ответ на задачу.
//  -5



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
        if (x<0) {
            x = -1 * x;
        }    
        System.out.print(x);
    }
}   