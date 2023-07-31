package com.nutech.take_home_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    public void writeObjectPersonToFile(String fileName, Person[] persons) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Person person:persons){
                writer.write(person.getNik()+","+person.getName()+","+Util.dateFormat().format(person.getDateOfBirth())+"\n");
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readFromInputStream(InputStream inputStream) {
        List<String> resultStringArray = new ArrayList<String>();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringArray.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return resultStringArray;
    }
}
