package Assessment40;
public class VirtualThreads {

    public static void main(String[] args) {

        // Create Virtual Thread

        Thread virtualThread =
                Thread.startVirtualThread(() -> {

                    for(int i = 1; i <= 5; i++) {

                        System.out.println(
                                "Virtual Thread Running: "
                                        + i
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

                });

        // Main Thread

        System.out.println(
                "Main Thread Executing"
        );

        try {

            virtualThread.join();

        }

        catch(InterruptedException e) {

            System.out.println(
                    "Join Interrupted"
            );

        }

        System.out.println(
                "Program Finished"
        );

    }

}