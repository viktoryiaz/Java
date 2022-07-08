//Задача 2.1.2
//
// Напишите программу, которая считывает два вещественных (А,В) и выводит 5 значений:
// -сумму двух чисел
// -разность двух чисел
// -произведение двух чисел
// -частное двух чисел
// -остаток от деления первого числа на второе
//
// Формат входных данных:
//  Два вещественных числа, разделенные пробелом. -100000 <= A, B<= 100000, B ≠ 0 .
//
// Формат выходных данных:
//  Пять вещественных чисел, каждое на новой строке.


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        double x = scanner.nextDouble();
        double y = scanner.nextDouble ();
     
      System.out.println(x + y);
      System.out.println(x - y);
      System.out.println(x * y);
      System.out.println(x / y);
      System.out.println(x % y);
    }
}   