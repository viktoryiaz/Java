//Задача 2.5.1
//
// Программа должна проверять правильный ли возраст ввел пользователь. 
// Правильным возрастом считать возраст в диапазоне от 0 (включительно) до 130 (не включительно)лет:[0;130].
//
// Формат входных данных:
//  Целое число х - количество лет. -10^9 <= х <= 10^9
//
// Формат выходных данных:
//  Единственное слово true, если возраст правильный. false, если неправильный.
// 5



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int x = scanner.nextInt();
            
        System.out.print(0<=x && x<130);
    }
}   