package first_Builder_Example;

public class ConcreteUserBuilder implements UserBuilder{
    private User user = new User();

    @Override
    public void setFirstName(String firstName) {
        user.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        user.setLastName(lastName);
    }

    @Override
    public void setAge(int age) {
        user.setAge(age);
    }

    @Override
    public void setEmail(String email) {
        user.setEmail(email);
    }

    @Override
    public void setAddress(String address) {
        user.setAddress(address);
    }

    @Override
    public User build() {
        return user;
    }
}
