package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_Equal_Databases() {
        //Given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);

        Student dieter = new Student("Fritz",1004);
        Student klaus = new Student("Klaus",1005);
        Student bob = new Student("Bob",1006);

        Student[] database = {tim,paul,alex};
        Student[] databaseEqual = {tim,paul,alex};


        StudentDB databaseTest = new StudentDB(database);
        StudentDB databaseTestEqual = new StudentDB(databaseEqual);


        //When
        Student[] actual = databaseTest.getAllStudents();
        Student[] actualEqual = databaseTestEqual.getAllStudents();

        //Then
        for (int i = 0; i < actual.length; i++) {
            assertEquals(actual[i], actualEqual[i]);
        }
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
        Student[] databaseAADifferent = {klaus,bob,dieter};

        StudentDB databaseTest = new StudentDB(database);
        StudentDB databaseTestAllDifferent = new StudentDB(databaseAADifferent);

        //Then
        Student[] actual = databaseTest.getAllStudents();
        Student[] actualAllDifferent = databaseTestAllDifferent.getAllStudents();

        //Then
        for (int i = 0; i < actual.length; i++) {
            assertNotEquals(actual[i], actualAllDifferent[i]);
        }
    }

    @Test
    void  getAllStudents_OneDifferent(){
        //Given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);

        Student dieter = new Student("Fritz",1004);

        Student[] database = {tim,paul,alex};
        Student[] databaseOneDifferent = {tim,paul,dieter};

        StudentDB databaseTest = new StudentDB(database);
        StudentDB databaseTestOneDifferent = new StudentDB(databaseOneDifferent);

        //When
        Student[] actual = databaseTest.getAllStudents();
        Student[] actualOneDifferent = databaseTestOneDifferent.getAllStudents();

        //Then
        for (int i = 0; i < actual.length; i++) {
            assertNotEquals(actual[i], actualOneDifferent[i]);
        }

    }
    @Test
    void getAllStudents_Equals_DifferentOrder_Databases() {
        //Given
        Student tim = new Student("Tim",1001);
        Student paul = new Student("Paul",1002);
        Student alex = new Student("Alex", 1003);

        Student[] database = {tim,paul,alex};
        Student[] databaseChangedOrder = {paul,alex,tim};

        StudentDB databaseTest = new StudentDB(database);
        StudentDB databaseTestChangedOrder = new StudentDB(databaseChangedOrder);

        //When
        Student[] actual = databaseTest.getAllStudents();
        Student[] actualDifferentOrder = databaseTestChangedOrder.getAllStudents();

        //Then
        for (int i = 0; i < actual.length; i++) {
            assertEquals(actual[i], actualDifferentOrder[i]);
        }

    }
}