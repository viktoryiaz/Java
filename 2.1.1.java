//Задача 2.1.1
//
// Напишите программу, которая считывает два целых (А,В) и выводит 5 значений:
// -сумму двух чисел
// -разность двух чисел
// -произведение двух чисел
// -частное двух чисел
// -остаток от деления первого числа на второе
//
// Формат входных данных:
//  Два целых числа, разделенные пробелом. -100 <= A, B<=100, B ≠ 0 .
//
// Формат выходных данных:
//  Пять целых чисел, каждое на новой строке.


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
        int y = scanner.nextInt();
     
      System.out.println(x + y);
      System.out.println(x - y);
      System.out.println(x * y);
      System.out.println(x / y);
      System.out.println(x % y);
    }
}   