package crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/universityguide";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM user")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String uniname = resultSet.getString("uniname");
                String location = resultSet.getString("location");
                String mark = resultSet.getString("mark");
                String link = resultSet.getString("link");

                User user = new User(id, uniname, location, mark, link);
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    public List<String> getDistinctUniNames() {
        List<String> distinctUniNames = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT DISTINCT uniname FROM user")) {

            while (resultSet.next()) {
                String uniName = resultSet.getString("uniname");
                distinctUniNames.add(uniName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return distinctUniNames;
    }


	public User getUserById(int userId) {
        User user = null;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM user WHERE id = ?")) {

            preparedStatement.setInt(1, userId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String uniname = resultSet.getString("uniname");
                    String location = resultSet.getString("location");
                    String mark = resultSet.getString("mark");
                    String link = resultSet.getString("link");

                    user = new User(id, uniname, location, mark, link);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void insertUser(User user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO user (uniname, location, mark, link) VALUES (?, ?, ?, ?)")) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getMark());
            preparedStatement.setString(4, user.getLink());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE user SET uniname = ?, location = ?, mark = ?, link = ? WHERE id = ?")) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getMark());
            preparedStatement.setString(4, user.getLink());
            preparedStatement.setInt(5, user.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM user WHERE id = ?")) {

            preparedStatement.setInt(1, userId);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<User> searchUsers(String searchQuery) {
        List<User> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM user WHERE uniname LIKE ? OR location LIKE ? OR mark LIKE ? OR link LIKE ?")) {

            // Use '%searchQuery%' to perform a partial match
            preparedStatement.setString(1, "%" + searchQuery + "%");
            preparedStatement.setString(2, "%" + searchQuery + "%");
            preparedStatement.setString(3, "%" + searchQuery + "%");
            preparedStatement.setString(4, "%" + searchQuery + "%");

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String uniname = resultSet.getString("uniname");
                    String location = resultSet.getString("location");
                    String mark = resultSet.getString("mark");
                    String link = resultSet.getString("link");

                    User user = new User(id, uniname, location, mark, link);
                    userList.add(user);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

public List<User> getUserByName(String name) {
    List<User> userList = new ArrayList<>();

    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(
                 "SELECT * FROM user WHERE uniname = ?")) {
        preparedStatement.setString(1, name);


        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String uniname = resultSet.getString("uniname");
                String location = resultSet.getString("location");
                String mark = resultSet.getString("mark");
                String link = resultSet.getString("link");

                User user = new User(id, uniname, location, mark, link);
                userList.add(user);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return userList;
}

public List<User> searchUsersWithMinMark(String minMark) {
    List<User> userList = new ArrayList<>();

    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
         PreparedStatement preparedStatement = connection.prepareStatement(
                 "SELECT * FROM user WHERE mark < ?")) {

        // Set the minimum mark condition
        preparedStatement.setString(1, minMark);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String uniname = resultSet.getString("uniname");
                String location = resultSet.getString("location");
                String mark = resultSet.getString("mark");
                String link = resultSet.getString("link");

                User user = new User(id, uniname, location, mark, link);
                userList.add(user);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return userList;
}

}


