package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiologyStudentTest {

    @Test
    void getAddress() {
        //Given
        String testPlace = "Central Station";
        BiologyStudent tom = new BiologyStudent();
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
        BiologyStudent tom = new BiologyStudent();
        tom.setIdentityCardNumber(testID);

        //when
        int actual = tom.getIdentityCardNumber();

        //then
        assertEquals(testID,actual);
    }
}