package de.neuefische.model;

import java.util.Arrays;
import java.util.Objects;

public class StudentDB {
    //Properties
        private Student[] database;
    //Methods

        @Override
        public String toString() {
            return "StudentDB{" +
                    "database=" + Arrays.toString(database) +
                    '}';
        }

    public Student[] getAllStudents(){
               // Arrays.sort(this.database);
                return this.database;
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
