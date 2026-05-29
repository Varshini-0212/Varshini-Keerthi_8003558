package Assessment26;
// Thread Class

class MyThread extends Thread {

    @Override

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(
                    "Thread Running: " + i
            );

            try {

                Thread.sleep(1000);

            }

            catch(InterruptedException e) {

                System.out.println(
                        "Thread Interrupted"
                );

            }

        }

    }

}

public class ThreadCreationEx {

    public static void main(String[] args) {

        // Create Thread Object

        MyThread t1 = new MyThread();

        // Start Thread

        t1.start();

        System.out.println(
                "Main Method Executing"
        );

    }

}
