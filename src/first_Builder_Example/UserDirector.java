package first_Builder_Example;

public class UserDirector {
    public User construct(UserBuilder builder){
        builder.setFirstName("Conor");
        builder.setLastName("McGregor");
        builder.setAge(35);
        builder.setEmail("mcGregor2@mail.ru");
        builder.setAddress("Dublin, Ireland");
        return builder.build();
    }
}
