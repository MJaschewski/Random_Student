package de.neuefische.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testEquals() {
        //Given
        Student tim1 = new Student("Tim",1234);
        Student tim2 = new Student("Tim",1234);
        Student notTim = new Student("Tom", 5678);

        //when
        boolean actualEqual = tim1.equals(tim2);
        boolean actualNotEqual = tim1.equals(notTim);

        //then
        assertTrue(actualEqual);
        assertFalse(actualNotEqual);
    }

}