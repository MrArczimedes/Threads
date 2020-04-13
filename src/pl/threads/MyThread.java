package pl.threads;

public class MyThread extends Thread {
    private final int children;

    public MyThread(int children) {
        this.children = children;
    }

    @Override
    public void run() {
        if(children>0) {
            MyThread childThread = new MyThread(children - 1);
            childThread.start();
            try {
                childThread.join();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName());
        }

    }
}
