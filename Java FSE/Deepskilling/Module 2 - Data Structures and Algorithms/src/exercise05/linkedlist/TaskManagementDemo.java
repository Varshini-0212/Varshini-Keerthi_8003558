package exercise05.linkedlist;

public class TaskManagementDemo {

    public static void main(String[] args) {

        TaskLinkedList taskList =
                new TaskLinkedList();

        taskList.addTask(
                101,
                "Design UI",
                "Pending");

        taskList.addTask(
                102,
                "Develop Backend",
                "In Progress");

        taskList.addTask(
                103,
                "Testing",
                "Pending");

        taskList.displayTasks();

        System.out.println(
                "\nSearch Result:");

        System.out.println(
                taskList.searchTask(102));

        taskList.deleteTask(102);

        taskList.displayTasks();
    }
}