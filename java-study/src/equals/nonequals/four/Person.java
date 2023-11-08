package equals.nonequals.four;

import java.util.Objects;

public class Person {

    private String name;

    @Override
    public boolean equals(Object object) {
        throw new RuntimeException();   // 호출 금지!
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
