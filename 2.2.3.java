//Задача 2.2.3
//
// Сосуд имеет объём V0. Изначально сосуд пуст. В сосуд сначала налили воды объёмом V1, а затем еще добавили воды объёмом V2.
// Найти на сколько процентов заполнен сосуд.
//
// Формат входных данных:
//  Три целых числа, разделённые пробелом. V0,V1,V2. 
//  0 < V0,V1,V2 <= 10^6 и V1 + V2 <= V0 . 
//
// Формат выходных данных:
//  Единственное число - ответ на задачу.
//  100 10 20



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        int V0 = scanner.nextInt();
        int V1 = scanner.nextInt();
        int V2 = scanner.nextInt();;
        double x = V1 + V2;
        
           System.out.print(x / V0 * 100);
    }
}   