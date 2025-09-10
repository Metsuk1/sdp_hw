package first_Builder_Example;

public class BuilderDemo {
    public static void main(String[] args) {
        UserDirector userDirector = new UserDirector();
        UserBuilder userBuilder = new ConcreteUserBuilder();

        User user = userDirector.construct(userBuilder);
        System.out.println(user);
    }
}
