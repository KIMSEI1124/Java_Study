package thread.obj;

import java.util.Random;

public class Task implements Runnable {

    private final Random random;
    Account account = new Account();

    public Task() {
        random = new Random();
        random.setSeed(System.currentTimeMillis()); // `seed`를 랜덤으로 설정
    }

    @Override
    public void run() {
        while (account.canWithDraw()) {
            int money = (random.nextInt(3) + 1) * 100;
            account.withDraw(money);
        }
    }
}