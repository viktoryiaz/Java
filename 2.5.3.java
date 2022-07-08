//Задача 2.5.3
//
// Дан треугольник с длинами сторон А, В, С.
// Является ли треугольник равнобедренным?
//
// Формат входных данных:
//  Три целых числа А, В, С, разделенные пробелом. 1 <= А, В, С <= 10^9
//  Гарантируется, что на вход поступят стороны, с которых можно составить треугольник.
//
// Формат выходных данных:
//  Единственное слово true, если треугольник равнобедренный. Иначе false.
//  10 5 7



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
            
        System.out.print(c==b || a==b || a==c);
    }
}   