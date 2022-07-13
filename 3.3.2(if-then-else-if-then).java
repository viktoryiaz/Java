//Задача 3.3.2
//
// Дано три числа А,В,С. Необходимо найти медиану трёх чисел.
//           
// Формат входных данных:
//  На единственной строке задано три целых числа А,В,С, разделенные пробелом. 
//  -10^9 <= А,В,С <= 10^9.
//
// Формат выходных данных:
//  Единственное число ответ на задачу.
//  10 5 30



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
     
        if ((b < a && a < c) || (c < a && a < b)) {
            System.out.print(a);
        } else if ((b > a && b > c) || (c < b && a > b)) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }    
    }
}  