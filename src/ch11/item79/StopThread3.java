package ch11.item79;

import java.util.concurrent.TimeUnit;


// volatile : 배타적 수행 (x) / 스래드 간 통신 (o)
public class StopThread3 {
    private static volatile boolean stopRequested;

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
