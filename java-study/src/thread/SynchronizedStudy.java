package thread;

import thread.obj.Task;

public class SynchronizedStudy {
    public static void main(String[] args) {
        Task task = new Task();
        Thread threadOne = new Thread(task);
        Thread threadTwo = new Thread(task);

        threadOne.setName("Thread One");
        threadTwo.setName("Thread Two");

        threadOne.start();
        threadTwo.start();
    }
}
