package pl.threads;

public class Main {

    public static void main(String[] args) {
        Thread thread = new MyThread(10);
        thread.run();
    }
}
