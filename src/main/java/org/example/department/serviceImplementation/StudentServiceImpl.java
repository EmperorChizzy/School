package org.example.department.serviceImplementation;

import org.example.department.entities.*;
import org.example.department.services.StudentServices;

import java.io.*;
import java.util.*;

public class StudentServiceImpl implements StudentServices<String, Payment> {

    public static List<User> listOfStudents = new ArrayList<>();
    public static Map<User, List<Subject>> studentSubjectChoice = new HashMap<>();

    public String learn(Subject subject) {
        return subject.getSubjectContent();
    }

    public Payment payFees(Payment payment) {
        return payment;
    }

    public Set<Question> takeAssessment(Assessment assessment) {
        return assessment.getQuestions();
    }

    public Map<User, List<Subject>> registerSubject(User student, List<Subject> subjects) {
        studentSubjectChoice.put(student, subjects);
        return studentSubjectChoice;
    }

    public void readStudentServiceImpl(String csvFile) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int counter = 0;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1); // trailing empty values
                if (counter != 0) {
                    String ID = "";
                    String firstName = "";
                    String lastName = "";
                    String gradeLevel = "";
                    String email = "";
                    String guardianEmail1 = "";
                    String guardianEmail2 = "";
                    String isArchived = "";
                    String isDeleted = "";

                    for (int i = 0; i < data.length; i++) {
                        if (data[i].isEmpty()) {
                            data[i] = null; // Replace empty values with null
                        }

                        /**
                         *
                         * Tying the fetched values to our Student class
                         */
                        if (i == 0) {
                            ID = data[i];
                        } else if (i == 1) {
                            firstName = data[i];
                        } else if (i == 2) {
                            lastName = data[i];
                        } else if (i == 3) {
                            gradeLevel = data[i];
                        } else if (i == 4) {
                            email = data[i];
                        } else if (i == 5) {
                            guardianEmail1 = data[i];
                        } else if (i == 6) {
                            guardianEmail2 = data[i];
                        } else if (i == 7) {
                            isArchived = data[i];
                        } else if (i == 8) {
                            isDeleted = data[i];
                        }

                    }
                    Student student = Student.builder()
                            .userId(ID)
                            .firstName(firstName)
                            .lastName(lastName)
                            .gradeLevel(gradeLevel)
                            .email(email)
                            .guardianEmail1(guardianEmail1)
                            .guardianEmail2(guardianEmail2)
                            .isArchived(isArchived)
                            .isDeleted(isDeleted)
                            .build();

                    listOfStudents.add(student);
                }
                counter++;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeStudentToFile(String fileName) {

        try (
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {
            for (User student : listOfStudents) {
                writer.write(String.valueOf(student));
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}