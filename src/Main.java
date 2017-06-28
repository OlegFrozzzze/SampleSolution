import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ОЛЕГ on 6/27/17.
 */
public class Main {
    public static void main(String[] args) {

        // Алгоритм
        // Отобразить меню выбора
        Solution.showMenu();
        // Получить выбор пользователя

        int a = Solution.getUserChoice();
        // Вызвать соответствующий метод, либо вывести на экран сообщение об некорректных входных данных
        if (a == 1) {
            Solution.seqSumOfNum();
        } else {
            if (a == 2) {
                Solution.seqPairSumOfNum();
            } else {
                if (a == 3) {
                    Solution.OutputTextToFile();
                } else {
                    if (a == 4) {
                        Solution.OutputTextToFileTwo();
                    } else {
                        if (a == 5) {
                            Solution.OutputTextToFileHtml();

                        } else {
                            System.out.println("Некорректные данные введите");
                        }
                    }
                }
                //3 txt document

                //4 txt document
                //5 html document
                //6 html document
            }
        }
    }
}

