//Задача 1.5.2
//
// Напишите программу, которая генерирует короткий рассказ "О себе". Программа принимает имя name, возраст age, город city,
// место работы job.И генерирует следующий рассказ:
// My name is {name}.
// I'm {age} old.
// I live in {city}.
// I'm a {job}.
// And now I want to be a Java developer.
//
// Формат входных данных:
//  Единственная строка содержит слово name, целое положительное число age, слово city и слово job.
//  Все данные разделены пробелом.
//
// Формат выходных данных:
//  Пять строк с ответом на задачу


import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        
        String name = scanner.next();
        int age = scanner.nextInt();
        String city = scanner.next();
        String job = scanner.next();
     
      System.out.println("My name is " + name + ".");
      System.out.println("I'm " + age + " old.");
      System.out.println("I live in " + city + ".");
      System.out.println("I'm a " + job + ".");
      System.out.println("And now I want to be a Java developer.");
    }
}   