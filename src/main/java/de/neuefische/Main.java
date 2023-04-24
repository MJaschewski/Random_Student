package de.neuefische;

import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

public class Main {
    public static void main(String[] args) {
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);
        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);

        //then
        String actual = databaseTest.toString();

        System.out.println(actual);
    }



}
