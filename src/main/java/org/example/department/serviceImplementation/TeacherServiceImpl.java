package org.example.department.serviceImplementation;
import org.example.department.entities.*;
import org.example.department.enums.AssessmentType;
import org.example.department.enums.SubjectName;
import org.example.department.services.TeacherServices;
import org.w3c.dom.css.Counter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherServiceImpl implements TeacherServices <String, Long>{
    public static List<User> listOfTeachers = new ArrayList<>();
    public static Map<User, StudentRecord> studentLedger = new HashMap<>();
    @Override
    public String teach(Subject subject){


        return subject.getSubjectContent();
    }
    @Override
    public Long assess(Assessment assessment, User student){
        return null;
    }

    @Override
    public String teach(SubjectName subject) {
        return null;
    }

    @Override
    public Long assess(AssessmentType assessment, User student) {
        return null;
    }

    @Override
    public Map<User, StudentRecord> promoteStudent(User student, StudentRecord studentReport){
        return studentLedger;
    }

    public void readTeacherServiceImpl(String csvFile) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int counter = 0;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1); // Trailing the empty values
                if (counter != 0) {
                    String ID = "";
                    String email = "";
                    String firstName = "";
                    String lastName = "";


                    for (int i = 0; i < data.length; i++) {
                        if (data[i].isEmpty()) {
                            data[i] = null; // Replace empty values with null
                        }

                        /**
                         *
                         * tying the fetched values to out Staff(Teacher)
                         */
                        if (i == 0) {
                            ID = data[i];
                        } else if (i == 1) {
                            email = data[i];
                        } else if (i == 2) {
                            firstName = data[i];
                        } else if (i == 3) {
                            lastName = data[i];


                        }
                    }
                    Staff teacher = Staff.builder()
                            .userId(ID)
                            .email(email)
                            .firstName(firstName)
                            .lastName(lastName)
                            .build();


                    listOfTeachers.add(teacher);
                }
                counter++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void writeTeacherToFile(String fileName) {

            try (
                    FileWriter fileWriter = new FileWriter(fileName);
                    BufferedWriter writer = new BufferedWriter(fileWriter);
            ) {
                for (User teacher    : listOfTeachers) {
                    writer.write(String.valueOf(teacher));
                    writer.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}