package de.neuefische.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void toString_Test(){
        //given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);
        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);

        //then
        String actual = databaseTest.toString();

        //
        assertEquals( "StudentDB{database=[Student{name='Tim', id=1001}, Student{name='Paul', id=1002}, Student{name='Alex', id=1003}]}",actual);
    }
    @Test
    void getAllStudents_Equal(){
        //Given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);

        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);

        //When
        Student[] actual = databaseTest.getAllStudents();

        //Then
        assertArrayEquals(database,actual);
    }
    @Test
    void getAllStudents_AllDifferent(){
        //Given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);

        Student dieter = new Student("Fritz",1004);
        Student klaus = new Student("Klaus",1005);
        Student bob = new Student("Bob",1006);

        Student[] database = {tim,paul,alex};
        StudentDB databaseTest = new StudentDB(database);
        Student[] databaseAllDifferent = {klaus,bob,dieter};

        //When
        Student[] actual = databaseTest.getAllStudents();

        //Then
        for (int i = 0; i < actual.length - 1; i++) {
            assertNotEquals(actual[i], databaseAllDifferent[i]);
        }

    }

}