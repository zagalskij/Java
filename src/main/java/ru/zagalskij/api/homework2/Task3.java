package ru.zagalskij.api.homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Task3 {

    public void saveToFile(String data, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(data);
            System.out.println("The data has been successfully written to the file.");
        } catch (IOException e) {
            System.out.println("Error when writing to a file: " + e.getMessage());
        }
    }

    public JSONArray readFromFile(String fileName) {
          StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            System.out.println("The data was successfully read from the file.");
        } catch (IOException e) {
            System.out.println("Error when reading from a file:" + e.getMessage());
        }
         JSONArray jsonArray = new JSONArray(stringBuilder.toString());
         return jsonArray;
    }

 public StringBuilder parseJson(JSONArray json) {
     StringBuilder stringBuilder = new StringBuilder();
     for (int i = 0; i < json.length(); i++) {
            JSONObject jsonObject = json.getJSONObject(i);
            String фамилия = jsonObject.getString("фамилия");
            String оценка = jsonObject.getString("оценка");
            String предмет = jsonObject.getString("предмет");

            stringBuilder.append("Студент ")
                    .append(фамилия)
                    .append(" получил ")
                    .append(оценка)
                    .append(" по предмету ")
                    .append(предмет)
                    .append(".\n");
        }

        return stringBuilder;
    }
    }
    
