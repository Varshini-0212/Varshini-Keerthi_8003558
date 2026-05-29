package Assessment41;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableEx {

    public static void main(String[] args) {

        // Create Thread Pool

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        // Callable Task 1

        Callable<String> task1 = () -> {

            return "Task 1 Completed";

        };

        // Callable Task 2

        Callable<String> task2 = () -> {

            return "Task 2 Completed";

        };

        // Callable Task 3

        Callable<String> task3 = () -> {

            return "Task 3 Completed";

        };

        try {

            // Submit Tasks

            Future<String> result1 =
                    executor.submit(task1);

            Future<String> result2 =
                    executor.submit(task2);

            Future<String> result3 =
                    executor.submit(task3);

            // Get Results

            System.out.println(
                    result1.get()
            );

            System.out.println(
                    result2.get()
            );

            System.out.println(
                    result3.get()
            );

        }

        catch(Exception e) {

            System.out.println(
                    e.getMessage()
            );

        }

        // Shutdown Executor

        executor.shutdown();

    }

}
