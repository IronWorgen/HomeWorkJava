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



}
