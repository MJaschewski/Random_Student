package de.neuefische.model;

public class BiologyStudent extends Student{
    private boolean learnBook;

    public BiologyStudent() {
    }

    public BiologyStudent(String name, int id, boolean learnBook) {
        super(name, id);
        this.learnBook = learnBook;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "learnBook=" + learnBook +
                "} " + super.toString();
    }

    public boolean isLearnBook() {
        return learnBook;
    }

    public void setLearnBook(boolean learnBook) {
        this.learnBook = learnBook;
    }
}
