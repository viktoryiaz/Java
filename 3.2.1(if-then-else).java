//Задача 3.2.1
//
// Дано два числа. Вывести минимальное. Если два числа равные, вывести любое.
//
// Формат входных данных:
//  На единственной строке задано два целых числа А, В, разделенные пробелом. 
//  -10^9 <= A, B <= 10^9.
//
// Формат выходных данных:
//  На единственной строке вывести ответ на задачу.
//  20 30



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
      
        if (a > b) {
            System.out.print(b);
        } else {      
            System.out.print(a);
        }     
    }
}   