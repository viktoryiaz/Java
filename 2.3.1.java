//Задача 2.3.1
//
// На вход поступает три слова, каждое с новой строки. Необходимо вывести все // слова на одной строке разделённые пробелом.
//
// Формат входных данных:
//  Три слова, каждое с новой строки.
//
// Формат выходных данных:
//  Единственное строка, содержащая три слова, разделённых пробелом.
//  I
//  can
//  program



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
           System.out.println(a + " " + b + " " + c);
    }
}   