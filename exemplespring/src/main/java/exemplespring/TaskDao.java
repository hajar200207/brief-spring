package exemplespring;

public class TaskDao {
    private JdbcTemplate jdbcTemplate;

    public TaskDao() {
        this.jdbcTemplate = new JdbcTemplate(getDataSource());
    }

    private DataSource getDataSource() {
        // Configurer la source de données (DataSource) pour H2 Database
    }

    public List<Task> getAllTasks() {
        String sql = "SELECT * FROM tasks";
        return jdbcTemplate.query(sql, new TaskRowMapper());
    }

    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (description) VALUES (?)";
        jdbcTemplate.update(sql, task.getDescription());
    }

    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
