package exemplespring;

public class TaskService {
    private TaskDao taskDao;

    public TaskService() {
        this.taskDao = new TaskDao();
    }

    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }

    public void addTask(Task task) {
        taskDao.addTask(task);
    }

    public void deleteTask(int id) {
        taskDao.deleteTask(id);
    }
}
