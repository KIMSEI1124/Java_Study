package thread.obj;

public class Account {
    private int balance = 1000;

    public void withDraw(int money) {
        synchronized (this) {
            if (canWithDrawByMoney(money)) {
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + ") 출금 금액 : [" + money + "]");
                    Thread.sleep(1000);
                    balance -= money;
                    System.out.println(threadName + ") balance : [" + balance + "]");
                    doubleLock();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private void doubleLock() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }

    private boolean canWithDrawByMoney(int money) {
        return balance >= money;
    }

    public boolean canWithDraw() {
        return balance > 0;
    }
}