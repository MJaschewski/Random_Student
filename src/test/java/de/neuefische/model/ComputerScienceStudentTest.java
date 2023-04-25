package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerScienceStudentTest {

    @Test
    void getAddress() {
        //Given
        String testPlace = "Central Station";
        ComputerScienceStudent tom = new ComputerScienceStudent();
        tom.setAddress(testPlace);

        //when
        String actual = tom.getAddress();

        //then
        assertEquals(testPlace,actual);
    }

    @Test
    void getIdentityCardNumber() {
        //Given
        int testID = 1234;
        ComputerScienceStudent tom = new ComputerScienceStudent();
        tom.setIdentityCardNumber(testID);

        //when
        int actual = tom.getIdentityCardNumber();

        //then
        assertEquals(testID,actual);
    }

    @Test
    void getIQValue(){
        //Given
        int IQ = 103;
        ComputerScienceStudent tom  = new ComputerScienceStudent();
        tom.setIQValue(IQ);

        //when
        int actual = tom.getIQValue();

        //then
        assertEquals(IQ,actual);
    }
}