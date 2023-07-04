// 1)Дана строка sql-запроса"select * from students where ".Сформируйте часть 
// WHERE этого запроса,используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации:{"name":"Ivanov","country":"Russia",
// "city":"Moscow", "age":"null"}

package ru.zagalskij.api.homework2;

import org.json.JSONObject;

public class Task1 {
    public static String run() {
        StringBuilder whereClause = new StringBuilder();
        String jsonString = "{\"name\":\"Ivanov\", \"country\":Russia, \"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject filters = new JSONObject(jsonString);

        boolean isFirstCondition = true;
        for (String key : filters.keySet()) {
            Object value = filters.get(key);
            if (value != null && !value.toString().equals("null")) {
                if (!isFirstCondition) {
                    whereClause.append(" AND ");
                } else {
                    whereClause.append(" WHERE ");
                }
                whereClause.append(key).append(" = '").append(value).append("'");
                isFirstCondition = false;
            }
        }

        return whereClause.toString();
    }
}