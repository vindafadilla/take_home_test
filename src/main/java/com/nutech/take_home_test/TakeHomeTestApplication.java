package com.nutech.take_home_test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TakeHomeTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TakeHomeTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Get total number of person
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Total number of person:");
        int totalPerson= Integer.parseInt(scanner.nextLine());

        //Get list data of person
        Person[] arrayOfPerson=new Person[totalPerson];

        for (int i = 0; i < totalPerson; i++) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("Date of Birth (yyyy-mm-dd):");
            String dateOfBirthInString = scanner.nextLine();
            Date dateOfBirth=Util.dateFormat().parse(dateOfBirthInString);
            System.out.println("NIK:");
            int nik = Integer.parseInt(scanner.nextLine());

            Person person = new Person(name,dateOfBirth,nik);
            arrayOfPerson[i] = person;
        }

        //Get name of file, where you add list data of person
        System.out.println("Name of File:");
        String nameFile= scanner.nextLine();

        //Add list data of person to file
        File file=new File();
        file.writeObjectPersonToFile(nameFile,arrayOfPerson);

        //Read list data of person from file
        InputStream input = new FileInputStream(nameFile);
        List<String> personFileOutput=file.readFromInputStream(input);
        String[] listOfName=new String[personFileOutput.size()];

        //Show list name of person from file
        for (int i=0;i<personFileOutput.size();i++){
            String[] splitJustPerson=personFileOutput.get(i).split(",");
            listOfName[i]=splitJustPerson[1];
        }
        System.out.println(Arrays.toString(listOfName));
    }

}
