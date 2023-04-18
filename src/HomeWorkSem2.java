import java.io.File;
import java.util.Formatter;

public class HomeWorkSem2 {

    /*
    1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
    Данные для фильтрации приведены ниже в виде json-строки.
    Если значение null, то параметр не должен попадать в запрос.
     */
    public String selectQuery(String[] filter) {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);
        stringBuilder.append("SELECT * FROM USER");
        int counter = 0;
        for (int i = 0; i < filter.length; i++) {
            String[] subStr = filter[i].split(":");
            if (counter == 0 && !subStr[1].equalsIgnoreCase("null")) {
                formatter.format(" WHERE %s = '%s'", subStr[0], subStr[1]);
                counter++;
            } else if (counter != 0 && !subStr[1].equalsIgnoreCase("null")) {
                formatter.format(" and %s = '%s'", subStr[0], subStr[1]);
            }
        }
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    /*
    2. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат
     */
    public void fileType() {
        File file = new File(System.getProperty("user.dir"));
        String[] files = file.list();

        for (int i = 0; i < files.length; i++) {
            String currentFile = files[i];
            if (currentFile.contains(".")) {
                int index = currentFile.lastIndexOf(".");
                String filenameExtension = currentFile.substring(index + 1, currentFile.length());
                System.out.printf("%d Расширение файла: %s\n", i + 1, filenameExtension);
            } else {
                System.out.printf("%d Расширение файла:\n", i + 1);
            }
        }
    }
}
