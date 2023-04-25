package de.neuefische.model;

public class BiologyStudent extends Student implements Citizen{
    private boolean learnBook;

    private int IdentityCardNumber;

    private String Address;


    public BiologyStudent() {
    }

    public BiologyStudent(String name, int id, boolean learnBook) {
        super(name, id);
        this.learnBook = learnBook;
    }

    void setAddress(String Address){
        this.Address = Address;
    }
    void setIdentityCardNumber(int IdentityCardNumber){
        this.IdentityCardNumber = IdentityCardNumber;
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

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public int getIdentityCardNumber() {
        return IdentityCardNumber;
    }
}
