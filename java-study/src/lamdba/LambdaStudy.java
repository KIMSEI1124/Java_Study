package lamdba;

import java.util.ArrayList;
import java.util.List;

public class LambdaStudy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println("직접 함수를 작성");
        list.forEach(i -> {
            if (i < 3) {
                System.out.println("해당 숫자는 3미만 입니다. 해당 숫자는 :\"" + i + "\"입니다");
            } else {
                System.out.println("해당 숫자는 3이상 입니다. 해당 숫자는 :\"" + i + "\"입니다");
            }
        });

        System.out.println("\n================================================");
        System.out.println("작성한 함수를 호출");
        list.forEach(i -> printList(i));
    }

    private static void printList(Integer number) {
        if (number < 3) {
            System.out.println("해당 숫자는 3미만 입니다. 해당 숫자는 :\"" + number + "\"입니다");
        } else {
            System.out.println("해당 숫자는 3이상 입니다. 해당 숫자는 :\"" + number + "\"입니다");
        }
    }
}
