public class Person {

    String firstName = "";

    public Person() {
        this.firstName = "";
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
