package second_Builder_example;

//Immutable class
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String address;

    Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.address = builder.getAddress();
    }

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

    @Override
    public String toString() {
        return "Person [firstName=" + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                ", email=" + email +
                ", address=" + address + "]";
    }


}
