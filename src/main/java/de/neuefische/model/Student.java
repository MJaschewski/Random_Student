package de.neuefische.model;

import java.util.Objects;

public abstract class Student {
    //properties
        private String name;
        private String id;
    //Methods
        public abstract void setIQValue(int IQValue);
        public abstract int getIQValue();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getId() != null ? getId().equals(student.getId()) : student.getId() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }

    //Constructor
        public Student() {
        }

        public Student(String name, String id) {
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
}
