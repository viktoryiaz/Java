//Задача 2.5.4
//
// Назовем "сложным словом" слово, которое объединено(сконкатенировано) из двух других слов.
// Например itman-сложное слово состаящее из it и man.
// Вам дано два слова и сложное слово.Вам нужно сказать, можно ли получить сложное слово из этих двух слов.
//
// Формат входных данных:
//  Две строки.Первая содержит два слова.Вторая содержит сложное слово.
//  Все слова написаны в нижнем регистре.
//
// Формат выходных данных:
//  Единственная строка, содержащая слово true, можно.false, если нельзя.
//  it man
//  itman



import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
       
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();       
        String d = a+b;
        String e = b+a; 
            
        System.out.print(d.equals(c) || e.equals(c));
    }
}   