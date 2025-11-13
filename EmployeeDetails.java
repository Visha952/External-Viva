import java.sql.*;

public class EmployeeDetails {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root"; // your MySQL username
        String password = "your_password"; // your MySQL password

        try {
            // Step 1: Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection using DriverManager
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Create statement
            Statement stmt = con.createStatement();

            // Step 4: Execute SQL query
            String query = "SELECT EmpID, Name, Salary FROM Employee";
            ResultSet rs = stmt.executeQuery(query);

            // Step 5: Display employee details in tabular form
            System.out.println("EmpID\tName\t\tSalary");
            System.out.println("-----------------------------------");
            while (rs.next()) {
                int id = rs.getInt("EmpID");
                String name = rs.getString("Name");
                double salary = rs.getDouble("Salary");

                System.out.println(id + "\t" + name + "\t\t" + salary);
            }

            // Step 6: Close all connections
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}
