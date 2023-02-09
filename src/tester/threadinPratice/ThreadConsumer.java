package tester.threadinPratice;

public class ThreadConsumer extends Thread {

        ThreadCompany c;

        ThreadConsumer(ThreadCompany c) {
            this.c = c;
        }

        public void run() {
            while (true) {
                try {
                    this.c.consume_item();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        }
    }

