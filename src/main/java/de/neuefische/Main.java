package de.neuefische;

import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

public class Main {
    public static void main(String[] args) {
        //given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);

        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);
        Student[] database2 = databaseTest.getAllStudents();

        for (int i = 0; i < 2; i++) {
            System.out.println(database[i]);
            System.out.println(database2[i]);
        }
        //randomStudent
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(databaseTest.randomStudent());
        }
         */
    }
}
