//Задача 3.2.2
//
// Даны две даты, вывести большую. Если даты равны, вывести любую.
//
// Формат входных данных:
//  На первой строке заданы три первых числа, разделенные пробелом D1, M1, Y1 - день, месяц, год первой даты.
//  На второй строке заданы три целых числа, разделенные пробелом D2, M2, Y2 - день, месяц, год второйдаты.
//  Гарантируется, что даты существуют в календаре.
//
// Формат выходных данных:
//  На единственной строке вывести три числа через пробел: день, месяц, год максимальной даты.
//  28 10 2019
//  1 1 2020



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
      
        if (y2 > y1) {
            System.out.print(d2+" "+m2+" "+y2);
        } 
        if (y2 < y1) {
            System.out.print(d1+" "+m1+" "+y1);
        } 
        if (y2 == y1 && m1 > m2) {
            System.out.print(d1+" "+m1+" "+y1);
        } 
        if (y2 == y1 && m1 < m2) {
            System.out.print(d2+" "+m2+" "+y2);
        } 
        if (y2 == y1 && m1 == m2 && d1 > d2) {
            System.out.print(d1+" "+m1+" "+y1);
        } 
        if (y2 == y1 && m1 == m2 && d1 < d2) {
            System.out.print(d2+" "+m2+" "+y2);
        } 
        if (y2 == y1 && m1 == m2 && d1 == d2) {
            System.out.print(d1+" "+m1+" "+y1);
        } 
    }
}   