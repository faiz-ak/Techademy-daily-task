import java.sql.*;

public class jdbctask {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String userName = "root";
    private static final String password = "Admin@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver error: " + e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();

            // INSERTING DATA
            String query1 = "INSERT INTO STUDENTS(id, name, age, marks) VALUES(6, 'Faizan', 22, 90)";
            int rowsAffected = st.executeUpdate(query1);
            if (rowsAffected > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Data not Inserted");
            }

            // RETRIEVING DATA
            String query = "SELECT * FROM Students";
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                double marks = result.getDouble("marks");

                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
                System.out.println("AGE: " + age);
                System.out.println("MARKS: " + marks);
            }

            result.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        }
    }
}
