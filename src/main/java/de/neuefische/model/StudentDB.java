package de.neuefische.model;
import java.lang.Math;

import java.util.Arrays;
import java.util.Objects;

public class StudentDB {
    //Properties
        private Student[] database;
    //Methods

        public Student randomStudent() {
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
                int length = this.database.length;
                Student[] copy = this.database.clone();
                Student[] ordered = new Student[length];

                int pChange = 0;
                int idSmall = copy[0].getId();

                for (int i = 0; i < length - 1; i++) {
                    for (int j = 0; j < length -1 ; j++) {

                        if(copy[j].getId() < idSmall){
                            idSmall = copy[j].getId();
                            pChange = j;
                        }
                    }
                    ordered[i] = copy[pChange];
                    copy[pChange] = new Student("Null",0000);
                }
                return ordered;
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
