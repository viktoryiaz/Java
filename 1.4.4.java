//Задача 1.4.4
//
// Напишите программу, которая считывает строку х и выводит три строки:
//  - считанная строка х
//  - Repeat:
//  - считанная строка х
//
// Формат входных данных:
//  Содержит одну строку х.
//  I like coding
//
// Формат выходных данных:
//  Три строки, требуемые по условию задачи


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        
        String a = scanner.nextLine();
     
      System.out.println(a);
      System.out.println("Repeat:");
      System.out.println(a);
        
    }
}   