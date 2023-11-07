package record;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("KIM", 24);
        Member member2 = new Member("KIM", 24);

        // getName()이 아닌 name() 으로 조회를 해야합니다. -> KIM
        System.out.println(member1.name());

        // equalsAndHashCode -> true
        System.out.println(member1.equals(member2));

        // toString -> Member[name=KIM, age=24]
        System.out.println(member1);

        System.out.println(member1.say());

        /* 정적 팩토리 메서드로 객체 생성 */
        Member lee = Member.from("Lee");
        System.out.println(lee.say());
    }
}
