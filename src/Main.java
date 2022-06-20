import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        mapToString();
    }

    /*Дан массив пар названий книг и авторов,
    необходимо привести каждую пару в строку вида:
    “Название книги” Имя Отчество Фамилия автора
     */

    public static void mapToString() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Как стать знаменитым.", "Полишинель.");
        map.put("Закат в Вегасе", "Дж. Дж. Коуч.");

        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println('"' + entry.getKey() + '"' + ", " + entry.getValue());
        }
    }
}