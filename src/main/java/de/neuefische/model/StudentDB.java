package de.neuefische.model;
import java.lang.Math;

import java.util.Arrays;
import java.util.Objects;

public class StudentDB {
    //Properties
        private Student[] database;
    //Methods

        public Student randomStudent() {
            //"This" not needed. Explicit call
            //Alternative:
            //Import java.util.random
            // Random rng = new Random();
            // rng.nextInt(5); Int between 0 and 4
            int max = this.database.length - 1;
            int min = 0;
            int range = max - min + 1;
            int rand = (int)(Math.random() * range) + min;
            return this.database[rand];
        }

        @Override
        public String toString() {
            return "StudentDB{" +
                    "database=" + Arrays.toString(database) +
                    '}';
        }

        public Student[] getAllStudents(){
                return database;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StudentDB studentDB = (StudentDB) o;
            return Arrays.equals(getDatabase(), studentDB.getDatabase());
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(getDatabase());
        }

    //Constructor
        public StudentDB(Student[] database) {
            this.database = database;
        }
        public StudentDB() {
        }

    //Getter & Setter

        public Student[] getDatabase() {
            return database;
        }

        public void setDatabase(Student[] database) {

            this.database = database;
        }
}
