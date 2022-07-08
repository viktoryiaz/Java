//Задача 2.5.5
//
// Вводится три логических значения (true или false).
// Программа должна вывести true, если только одно из значений равно true.
//
// Формат входных данных:
//  Три слова, разделенные через пробел.
//  Слова могут принимать только значения true или false.
//
// Формат выходных данных:
//  Одно слово true или false.
//  true true false



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        Boolean a = scanner.nextBoolean();
        Boolean b = scanner.nextBoolean();
        Boolean c = scanner.nextBoolean();    
        Boolean d = false;
            
        System.out.print(a!=b && b==c || a==c && c==d && b!=a);
    }
}   