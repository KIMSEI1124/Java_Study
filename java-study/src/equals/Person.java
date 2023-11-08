package equals;

import java.util.Objects;

public class Person extends Animal {
    private String name;
    private int age;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object) || object instanceof Person) {
            return false;
        }
        Person person = (Person) object;
        return Objects.equals(name, person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
