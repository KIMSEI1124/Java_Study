package mark;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Member from(MemberRequest request) {
        return new Member(request.name(), request.age());
    }
}
