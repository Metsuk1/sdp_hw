package first_Builder_Example;

//Mutable class
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "firstBuilder.User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", address=" + address + "]";
    }

}
