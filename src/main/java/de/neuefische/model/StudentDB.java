package de.neuefische.model;
import java.lang.Math;

import java.util.*;

public class StudentDB {
    //Properties
        private List<Student> dataList = new ArrayList<>();
    //Methods

        public Student randomStudent() {
            //"This" not needed. Explicit call
            //Alternative:
            //Import java.util.random
            // Random rng = new Random();
            // rng.nextInt(5); Int between 0 and 4
            Student[] database = dataList.toArray(new Student[0]);
            int max = database.length - 1;
            int min = 0;
            int range = max - min + 1;
            int rand = (int)(Math.random() * range) + min;
            return database[rand];
        }

        @Override
        public String toString() {
            return "StudentDB{" +
                    "dataList=" + dataList +
                    '}';
        }

        public Student[] getAllStudents(){
            Student[] database = dataList.toArray(new Student[0]);
            return database;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StudentDB studentDB = (StudentDB) o;

            return dataList.equals(studentDB.dataList);
        }

        @Override
        public int hashCode() {
            return dataList.hashCode();
        }

    //Constructor
        public StudentDB(Student[] database) {
            for (int i = 0; i < database.length; i++) {
                this.dataList.add(database[i]);
            }
        }
        public StudentDB() {
        }

    //Getter & Setter

        public Student[] getDatabase() {
            Student[] database = dataList.toArray(new Student[0]);
            return database;
        }

        public void setDatabase(Student[] database) {
            for (int i = 0; i < database.length; i++) {
                this.dataList.add(database[i]);
            }
        }
}
