package org.example.unusedMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Empty {
    public static void main(String[] args) {
        String csvFile = "/Users/Emperor Chizzy/IdeaProjects/JAVA CLASS 1/OOP/School Project 2/src/main/java/org/example/department/file/Dataset for seeding Student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            String[] headers = br.readLine().split(","); // Reading the header row

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1); // To keep trailing empty values

                for (int i = 0; i < data.length; i++) {
                    if (data[i].isEmpty()) {
                        data[i] = null; // Replace empty values with null
                    }
                    System.out.print(headers[i] + ": " + data[i] + " | ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
