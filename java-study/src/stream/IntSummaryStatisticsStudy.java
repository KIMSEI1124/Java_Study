package stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class IntSummaryStatisticsStudy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        doDeclaration(list);
        doGetCount(list);
        doGetSum(list);
        doGetMin(list);
        doGetMax(list);
        doGetAverage(list);
        doToString(list);
        doAccept(list);
        doCombine(list);
    }

    private static void doDeclaration(List<Integer> list) {
        System.out.println("** Declaration **");

        IntSummaryStatistics newStat = new IntSummaryStatistics();
        System.out.println("newStat = " + newStat);

        IntSummaryStatistics streamStat1 = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("streamStat1 = " + streamStat1);

        IntSummaryStatistics streamStat2 = list.stream().collect(
                IntSummaryStatistics::new,
                IntSummaryStatistics::accept,
                IntSummaryStatistics::combine);
        System.out.println("streamStat2 = " + streamStat2);
    }

    private static void doGetCount(List<Integer> list) {
        System.out.println("** getCount **");
        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        long count = stat.getCount();
        System.out.println("count = " + count);
    }

    private static void doGetSum(List<Integer> list) {
        System.out.println("** getSum **");
        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        long sum = stat.getSum();
        System.out.println("sum = " + sum);
    }

    private static void doGetMin(List<Integer> list) {
        System.out.println("** getMin **");
        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        int min = stat.getMin();
        System.out.println("min = " + min);
    }

    private static void doGetMax(List<Integer> list) {
        System.out.println("** getMax **");
        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        int max = stat.getMax();
        System.out.println("max = " + max);
    }

    private static void doGetAverage(List<Integer> list) {
        System.out.println("** getAverage **");
        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        double average = stat.getAverage();
        System.out.println("average = " + average);
    }

    private static void doToString(List<Integer> list) {
        System.out.println("** toString **");
        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        String string = stat.toString();
        System.out.println("string = " + string);
    }

    private static void doAccept(List<Integer> list) {
        System.out.println("** Accept **");

        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Before stat = " + stat);

        stat.accept(6);
        System.out.println("After stat = " + stat);
    }

    private static void doCombine(List<Integer> list) {
        System.out.println("** Combine **");

        IntSummaryStatistics stat = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Before stat = " + stat);

        IntSummaryStatistics otherStat = new IntSummaryStatistics();
        otherStat.accept(10);

        stat.combine(otherStat);
        System.out.println("After stat = " + stat);
    }
}
