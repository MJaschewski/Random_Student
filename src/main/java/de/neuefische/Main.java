package de.neuefische;

import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

public class Main {
    public static void main(String[] args) {
        Student tim = new BiologyStudent("Tim",1001,true);
        Student paul = new BiologyStudent("Paul",1002,false);
        Student alex = new BiologyStudent("Alex", 1003,true);

        Student peter = new ComputerScienceStudent("Peter",1004,101);
        Student chris = new ComputerScienceStudent("Chris",1005,99);

        Student[] database = {tim,paul,alex,paul,chris};
        StudentDB databaseTest = new StudentDB(database);

        for (int i = 0; i < 10; i++) {
            System.out.println(databaseTest.randomStudent());
        }
    }
}
