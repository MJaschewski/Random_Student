package de.neuefische.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void removeStudentByID_no_such_student_throws_exception(){
        //given
        Student tim = new BiologyStudent("Tim","1001",true);
        Student paul = new BiologyStudent("Paul","1002",false);
        Student alex = new BiologyStudent("Alex", "1003",true);
        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);
        String wrongID = "1015";
        //When & Then
        assertThrows(NoSuchElementException.class, () ->databaseTest.removeStudentByID(wrongID));
    }

    @Test
    void findById_student_not_found_throws_exception(){
        //given
        Student tim = new BiologyStudent("Tim","1001",true);
        Student paul = new BiologyStudent("Paul","1002",false);
        Student alex = new BiologyStudent("Alex", "1003",true);
        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);
        String wrongID = "1015";
        //when - then
        /*
        boolean actual = true;
        try{
            Student exceptionStudent = databaseTest.findById(wrongID);
            Assertions.fail();
            //fail();
        } catch (NoSuchElementException e){
            Assertions.assertTrue(true);
        }
        */
        //Alternative assertThrows with lambda arguments
        Assertions.assertThrows(NoSuchElementException.class, () ->databaseTest.findById(wrongID));
    }

    @Test
    void findById_student_found(){
        //given
        Student tim = new BiologyStudent("Tim","1001",true);
        Student paul = new BiologyStudent("Paul","1002",false);
        Student alex = new BiologyStudent("Alex", "1003",true);
        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);
        String rightID = "1002";
        //when
        boolean actual = true;
        try{
            Student expectionStudent = databaseTest.findById(rightID);
        } catch (NoSuchElementException notFound){
            actual = false;
        }
        //Then
        assertTrue(actual);
    }

    @Test
    void getAllStudents(){
        //Given
        Student tim = new BiologyStudent("Tim","1001",true);
        Student[] database = {tim};
        StudentDB databaseTest = new StudentDB(database);

        //When
        Student[] actual = databaseTest.getAllStudents();

        assertArrayEquals(database,actual);

    }

}