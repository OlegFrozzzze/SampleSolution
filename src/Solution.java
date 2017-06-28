import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 1+2
 * 3+4
 * 5+6
 */
//TODO Придумать нормальное имя для класса
public class Solution {
    //Sequential pairwise sum of numbers
    public static int seqPairSumOfNum() {
        for (int i = 1; i < 26; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));

            }
        }
        return 1;
    }

    //Sequential sum of numbers
    public static void seqSumOfNum() {
        for (int i = 1; i < 26; i++) {
            System.out.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
        }
    }
    //3 txt document

    //4 txt document
    //5 html document
    //6 html document

    public static void showMenu() {
        System.out.println("Выберите 1 из вариантов");
        System.out.println("1) Последовательное попарное сложение чисел от 1 до 26");
        System.out.println("2) Последовательное сложение чисел через один");
    }

    public static void OutputTextToFile() {
        try {
            PrintWriter out = new PrintWriter("B:\\Project\\src\\Test.txt");
            for (int a = 1; a < 26; a++) {
                if (a % 2 != 0)
                    out.println(a + "+" + (a + 1) + "=" + (a + (a + 1)));
            }
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void OutputTextToFileTwo() {
        try {
            PrintWriter out = new PrintWriter("B:\\Project\\src\\Test2.txt");
            for (int a = 1; a < 26; a++) {
                out.println(a + "+" + (a + 1) + "=" + (a + (a + 1)));
            }
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void OutputTextToFileHtml() {
        try {
            PrintWriter out = new PrintWriter("B:\\Project\\src\\Test1.html");
            String b = "<!DOCTYPE html>" + "\n" +
                    "<html lang=\"ru\">" + "\n" +
                    "<head>" + "\n" +
                    "<meta charset=\"UTF-8\">" + "\n" +
                    "<title>Document</title>" + "\n" +
                    "</head>" + "\n" +
                    "<body>" + "\n" +
                    "<table border=\"1\">";
            String d = "</table>" + "\n" +
                    "</body>" + "\n" +
                    "</html>";
            String tr = "<tr>";
            String td = "<td>";
            String trClose = "</tr>";
            String tdClose = "</td>";
            out.println(b);
            for (int a = 1; a < 26; a++) {
                if (a % 2 != 0) {
                    out.println(tr + td + a + "+" + (a + 1) + tdClose + td + (a + (a + 1)) + tdClose + trClose);
                    //<tr > <td > 34, 5 </td > <td > 3, 5 </td > <td > 36 </td > </tr >
                }
            }
            out.println(d);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static int getUserChoice() {
        //Вывод на экран сообщения
        System.out.print("Введите выбранный вариант: ");
        //Ввести данные
        //Создать объект класса Scanner
        //Создать переменную класса Scanner
        Scanner scanner;
        //Занести в неё объект класса Scanner
        scanner = new Scanner(System.in);
        //Вернуть введённое с клавиатуры число
        return scanner.nextInt();
    }
}








