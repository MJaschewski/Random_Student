package de.neuefische;

import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

public class Main {
    public static void main(String[] args) {
        //given
        ComputerScienceStudent tim = new ComputerScienceStudent("Tim",1001,100);
        BiologyStudent paul = new BiologyStudent("Paul",1002,true);

        System.out.println(tim);
        System.out.println(paul);


    }
}
