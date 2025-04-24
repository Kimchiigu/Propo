package id.ac.binus.solutions;

public class Author {
    private String name;
    private int age;
    private Address address;

    public Author(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
    public String getStreet() {
        return this.address.getStreet();
    }
    public int getNumber() {
        return this.address.getNumber();
    }
}
