//Задача 2.1.1
//
// Противоположное число n'по отношению к числу n - это число, которое при сложении с n даёт ноль: n + n' = 0
// Напишите программу, которая считывает два (А,В) и выводит противоположные к заданным.
//
// Формат входных данных:
//  Первая строка содержит целое число А, -100000 <= A <=100000. Вторая строка содержит вещественное число В, -100000 <= В <=100000.
//
// Формат выходных данных:
//  На первой строке вывести целое число противоположное А. На второй строке вывести вещественное число противоположное В.
// 5 -20.21


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
     
      System.out.println(-a);
      System.out.println(-b);
    }
}   