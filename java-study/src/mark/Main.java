package mark;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new MemberRequest("KIM", 24);
        Object convert = convert(obj1);
        System.out.println(convert.getClass());
    }

    public static Object convert(Object obj) {
        if (obj instanceof Request request) {
            if (request instanceof MemberRequest memberRequest) {
                return Member.from(memberRequest);
            }
        }
        if (obj instanceof Response response) {
            return response;
        }
        throw new IllegalArgumentException();
    }
}
