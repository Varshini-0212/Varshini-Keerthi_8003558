package exercise05.linkedlist;

public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(int id,
                        String name,
                        String status) {

        Task newTask =
                new Task(id, name, status);

        if(head == null) {

            head = newTask;
        }
        else {

            Task current = head;

            while(current.next != null) {

                current = current.next;
            }

            current.next = newTask;
        }

        System.out.println(
                "Task Added Successfully");
    }

    // Search Task
    public Task searchTask(int id) {

        Task current = head;

        while(current != null) {

            if(current.taskId == id) {

                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Traverse Tasks
    public void displayTasks() {

        Task current = head;

        System.out.println("\nTask List:");

        while(current != null) {

            System.out.println(current);

            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if(head == null) {

            System.out.println("Task List Empty");
            return;
        }

        if(head.taskId == id) {

            head = head.next;

            System.out.println(
                    "Task Deleted Successfully");

            return;
        }

        Task current = head;

        while(current.next != null &&
                current.next.taskId != id) {

            current = current.next;
        }

        if(current.next != null) {

            current.next = current.next.next;

            System.out.println(
                    "Task Deleted Successfully");
        }
        else {

            System.out.println(
                    "Task Not Found");
        }
    }
}