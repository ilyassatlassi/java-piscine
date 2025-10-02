enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}



public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count = 0;

    public TodoList(int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity];
    };

    public void addTask(String description) {
        // System.out.println(capacity);dd
        if (capacity > count) {
            tasks[count] = new Task(description);
            // tasks[current].setStatus(TaskStatus.NEW);
            count++;
        }

    };

    public void setStatus(int index, TaskStatus status) {
        if (this.capacity < index) {
            return;
        }
        tasks[index].setStatus(status);

    };

    public void setDescription(int index, String newDescription) {
        if (this.capacity < index) {
            return;
        }

        tasks[index].setDescription(newDescription);
    };

    public void displayTasks() {
        System.out.println("Tasks:");

        for (Task task : tasks) {
            if (task != null) {
                String formatted = String.format("%-33s | %s", task.getDescription(), task.getStatus());
                System.out.println(formatted);
            }
            // System.out.print( task.getDescription()) ;
            // System.out.println(task.getStatus());
        }
    };
}