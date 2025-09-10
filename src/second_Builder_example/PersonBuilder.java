package second_Builder_example;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
