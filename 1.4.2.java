//Задача 1.4.2
//
// Напишите программу, которая считывает одну строку из потока ввода (с помощью Scanner) и выводит ее на экран
//
// Формат входных данных:
//  Содержит одну строку
//  I will be a programmer
//
// Формат выходных данных:
//  Единственная строка, требуемая по условию задачи


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        
        String line = scanner.nextLine();
     
      System.out.println(line);
        
    }
}    