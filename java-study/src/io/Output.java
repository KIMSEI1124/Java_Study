package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Output {
    private static final StringBuilder timeBuilder = new StringBuilder();
    private static final long[] timeArray = new long[5];
    private static long beforeTime;
    private static long afterTime;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            bufferedWriterTest1();
            bufferedWriterTest2();
            stringBuilderTest();
            printWriterTest();
            printlnTest();
        }
        timeBuilder.append("BufferedWriter Integer.toString(i) : ").append(timeArray[0] / 10).append("ms").append("\n");
        timeBuilder.append("BufferedWriter br.write(i + \"\\n\") : ").append(timeArray[1] / 10).append("ms").append("\n");
        timeBuilder.append("StringBuilder + Println : ").append(timeArray[2] / 10).append("ms").append("\n");
        timeBuilder.append("PrintWriter : ").append(timeArray[3] / 10).append("ms").append("\n");
        timeBuilder.append("Println : ").append(timeArray[4] / 10).append("ms").append("\n");
        System.out.println(timeBuilder);
    }

    private static void bufferedWriterTest1() throws IOException {
        beforeTime = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= 10_000_000; i++) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }
        System.out.println(bw);

        afterTime = System.currentTimeMillis();
        timeArray[0] += afterTime - beforeTime;
    }

    private static void bufferedWriterTest2() throws IOException {
        beforeTime = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= 10_000_000; i++) {
            bw.write(i + "\n");
        }
        System.out.println(bw);

        afterTime = System.currentTimeMillis();
        timeArray[1] += afterTime - beforeTime;
    }

    private static void stringBuilderTest() {
        beforeTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 10_000_000; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);

        afterTime = System.currentTimeMillis();
        timeArray[2] += afterTime - beforeTime;
    }

    private static void printWriterTest() {
        beforeTime = System.currentTimeMillis();

        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i <= 10_000_000; i++) {
            pw.println(i);
        }

        afterTime = System.currentTimeMillis();
        timeArray[3] += afterTime - beforeTime;
    }

    private static void printlnTest() {
        beforeTime = System.currentTimeMillis();

        for (int i = 0; i <= 10_000_000; i++) {
            System.out.println(i);
        }

        afterTime = System.currentTimeMillis();
        timeArray[4] += afterTime - beforeTime;
    }
}
