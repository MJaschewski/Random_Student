package de.neuefische.model;

public class BiologyStudent extends Student{
    private boolean learnBook;

    public BiologyStudent() {
    }

    public BiologyStudent(String name, int id, boolean learnBook) {
        super(name, id);
        this.learnBook = learnBook;
    }

    public boolean isLearnBook() {
        return learnBook;
    }

    public void setLearnBook(boolean learnBook) {
        this.learnBook = learnBook;
    }
}
