package de.neuefische.model;
import java.lang.Math;

import java.util.*;

public class StudentDB {
    //Properties
        private Map<String,Student> dataMap = new HashMap<>();
    //Methods
        public Student findById(String id) throws NoSuchElementException{
            Student foundStudent = this.dataMap.get(id);
            if (foundStudent == null){
                System.out.println("No student with this ID found");
                throw new NoSuchElementException();
            }
            return foundStudent;
        }

        public Student randomStudent() {
            //"This" not needed. Explicit call
            //Alternative:
            //Import java.util.random
            // Random rng = new Random();
            // rng.nextInt(5); Int between 0 and 4
            Collection<Student> dataList = dataMap.values();
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
                    "dataMap=" + dataMap +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDB studentDB = (StudentDB) o;

        return Objects.equals(dataMap, studentDB.dataMap);
    }

    @Override
    public int hashCode() {
        return dataMap != null ? dataMap.hashCode() : 0;
    }

    public Student[] getAllStudents(){
            Collection<Student> dataList = dataMap.values();
            Student[] database = dataList.toArray(new Student[dataMap.size()]);
            return database;
        }

    //Constructor
        public StudentDB(Student[] database) {
            for (int i = 0; i < database.length; i++) {
                this.dataMap.put(database[i].getId(),database[i]);
            }
        }
        public StudentDB() {
        }

    //Getter & Setter

        public Student[] getDatabase() {
            Collection<Student> dataList = dataMap.values();
            Student[] database = dataList.toArray(new Student[0]);
            return database;
        }

        public void setDatabase(Student[] database) {
            for (int i = 0; i < database.length; i++) {
                this.dataMap.put(database[i].getId(),database[i]);
            }
        }

        public void addStudent(Student student){
            dataMap.put(student.getId(),student);
        }

        public void removeStudentByID(String studentID) throws NoSuchElementException{
            Student student = findById(studentID);
            dataMap.remove(student.getId());
        }
}
