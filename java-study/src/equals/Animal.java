package equals;

import java.util.Objects;

public class Animal {
    private String type;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Animal animal = (Animal) object;
        return Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
