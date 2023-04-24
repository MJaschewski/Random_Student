package de.neuefische.model;

import java.util.Objects;

public class StudentDB {
    //Properties
        private Student[] database;
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
