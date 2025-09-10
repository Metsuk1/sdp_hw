package first_Builder_Example;

public interface UserBuilder {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setAge(int age);
    void setEmail(String email);
    void setAddress(String address);
    User build();
}
