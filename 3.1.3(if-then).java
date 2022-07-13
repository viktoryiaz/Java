//Задача 3.1.3
//
// Даны часы Н, минуты М, секунды S. Вывести время в формате hh:mm:ss.
//
// Формат входных данных:
//  На единственной строке задано три целых числа H,M,S, разделенные пробелом. 
//  0 <= H < 24, 0 <= M, S < 60.
//
// Формат выходных данных:
//  На единственной строке вывести ответ на задачу.
//  5 0 0



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        
        if (h < 10) {
            System.out.print(0);
            System.out.print(h);
        }    
        if (h >= 10) {
            System.out.print(h);
        }     
        System.out.print(":");
        
        if (m < 10) {
            System.out.print(0);
            System.out.print(m);
        }  
        if (m >= 10) {
            System.out.print(m);
        }   
        System.out.print(":");
        
        if (s < 10) {
            System.out.print(0);
            System.out.print(s);
        }    
        if (s >= 10) {
            System.out.print(s);
        }     
    }
}  