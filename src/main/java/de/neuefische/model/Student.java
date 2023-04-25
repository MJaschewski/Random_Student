package de.neuefische.model;

import java.util.Objects;

public abstract class Student {
    //properties
        private String name;
        private int id;
    //Methods
        public abstract void setIQValue(int IQValue);
        public abstract int getIQValue();

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return getId() == student.getId() && Objects.equals(getName(), student.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getId());
        }

    //Constructor
        public Student() {
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
        //Getter & Setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
}
