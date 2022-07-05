//Задача 1.4.3
//
// Напишите программу, которая считывает из консоли четыре значения:слово,целое число,вещественное число и логическое значение.
// Выведи их в обратном порядке
//
// Формат входных данных:
//  Четыре значения, разделенные пробелом
//  String 5 3.14 true
//
// Формат выходных данных:
//  Четыре значения, каждое на новой строке


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        
        String a = scanner.next();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();
        Boolean d = scanner.nextBoolean();
     
      System.out.println(d);
      System.out.println(c);
      System.out.println(b);
      System.out.println(a);
        
    }
}   