import java.sql.*;

public class Employee {
    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String address;
    private String email;
    private String department;
    private double salary;

    public Employee(int id, int age, String firstName, String lastName, String contactNumber,
                    String address, String email, String department, double salary) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void insertEmployee(Employee emp) {
        String url = "jdbc:mysql://localhost:3306/practice"; // Change this to your database URL
        String user = "root"; // Change this to your database username
        String password = "Wankhede@99"; // Change this to your database password

        String sql = "INSERT INTO employees (id, age, first_name, last_name, contact_number, address, email, department, salary) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Wankhede@99");
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, emp.getId());
            stmt.setInt(2, emp.getAge());
            stmt.setString(3, emp.getFirstName());
            stmt.setString(4, emp.getLastName());
            stmt.setString(5, emp.getContactNumber());
            stmt.setString(6, emp.getAddress());
            stmt.setString(7, emp.getEmail());
            stmt.setString(8, emp.getDepartment());
            stmt.setDouble(9, emp.getSalary());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee record inserted successfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, 25, "John", "Doe", "1234567890",
                                    "123 Main St", "johndoe@example.com", "IT", 50000.0);

        Employee.insertEmployee(emp);
    }
}
