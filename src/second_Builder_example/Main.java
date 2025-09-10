package second_Builder_example;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .withFirstName("Khabib")
                .withLastName("Nurmagomedov")
                .withAge(37)
                .withEmail("khabibnurmagomedov@gmail.com")
                .withAddress("Dagestan, Russian")
                .build();

        System.out.println(person);
    }
}