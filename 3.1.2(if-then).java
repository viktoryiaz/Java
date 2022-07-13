//Задача 3.1.2
//
// Даны числа А,В,С,Х. Вывести какие числа из  А,В,С являются делителем числа Х.
// Гарантируется, что хотя бы одно число будет делителем.
//
// Формат входных данных:
//  На единственной строке задано 4 числа А,В,С,Х, разделенные пробелом. 
//  -10^9 <= А,В,С,Х <= 10^9
//
// Формат выходных данных:
//  От одного до трёх чисел, каждое нан новой строке.
//  Числа выводить в порядке, в котором они были введены.
//  1 2 3 10



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        
        if (x % a == 0) {
            x = -1 * x;
            System.out.println(a);
        }    
        if (x % b == 0) {
            x = -1 * x;
            System.out.println(b);
        }    
        if (x % c == 0) {
            x = -1 * x;
            System.out.println(c);
        }    
    }
}   