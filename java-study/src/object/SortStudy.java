package object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toUpperCase().toCharArray();
        ArrayList<Alphabet<Character, Integer>> list = new ArrayList<>();
        for (char check : arr) {
            int pos = AlphabetContains(list, check);
            if (list.isEmpty() || pos == -1) {
                list.add(new Alphabet<>());
                list.get(list.size() - 1).setAlphabet(check, 1);
            } else {
                list.get(pos).setCount(list.get(pos).getCount() + 1);
            }
        }
        Comparator<Alphabet<Character, Integer>> comparator = (b, a) -> a.getCount() - b.getCount();
        list.sort(comparator);
        if (list.size() > 1) {
            if (list.get(0).getCount() != (list.get(1).getCount())) {
                System.out.println(list.get(0).getAlpha());
            } else {
                System.out.println("?");
            }
        } else if (list.size() == 1) {
            System.out.println(list.get(0).getAlpha());
        }
    }

    public static int AlphabetContains(List<Alphabet<Character, Integer>> list, char check) {
        for (int i = 0; i < list.size(); i++) {
            if (check == list.get(i).getAlpha()) {
                return i;
            }
        }
        return -1;
    }
}


class Alphabet<A, C> {
    private char alpha;
    private int count;

    public void setAlphabet(char alpha, int count) {
        this.alpha = alpha;
        this.count = count;
    }

    public char getAlpha() {
        return alpha;
    }

    public void setAlpha(char alpha) {
        this.alpha = alpha;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
