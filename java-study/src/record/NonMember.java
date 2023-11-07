package record;

import java.util.Objects;

public class NonMember {

    /* 각 변수에 대한 `private final` */
    private final String name;
    private final int age;

    /* 각 필드에 해당하는 인수가 있는 `public` 생성자 */
    public NonMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* 각 필드에 대한 `Getter` */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /* 모든 필드가 일치할 때 동일한 클래스의 객체에 대해 참을 반환하는 `equals` 메서드 */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        NonMember member = (NonMember) object;
        return age == member.age && Objects.equals(name, member.name);
    }

    /* 모든 필드가 일치할 때 동일한 값을 반환하는 `hashCode` 메서드 */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /* 클래스 이름과 각 필드의 이름 및 해당 값을 포함하는 `toString` 메서드 */
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
