//Задача 2.2.2
//
// Вводится 3 целых числа a,b,c. Найти среднее арифметическое 3 чисел.
//
// Формат входных данных:
//  Три целых числа, разделённые пробелом. -1 * 10^6 <= a,b,c <= 10^6 . 
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
// 1 2 3



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();;
        double x = 3;
        
           System.out.print((a+b+c)/x);
    }
}   