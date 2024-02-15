package pagecreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class pageUserDAO {

    // Your database connection details
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

    // SQL queries for CRUD operations
    private static final String INSERT_USER_QUERY = "INSERT INTO page (uniname, location, description, logo, image) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_USERS_QUERY = "SELECT * FROM page";
    private static final String UPDATE_USER_QUERY = "UPDATE page SET uniname=?, location=?, description=?, logo=?, image=? WHERE id=?";
    private static final String UPDATE_USER_QUERY_IMAGE = "UPDATE page SET uniname=?, location=?, description=?, image=? WHERE id=?";
    private static final String UPDATE_USER_QUERY_LOGO = "UPDATE page SET uniname=?, location=?, description=?, logo=? WHERE id=?";
    private static final String UPDATE_USER_QUERY_NOT = "UPDATE page SET uniname=?, location=?, description=? WHERE id=?";
    private static final String DELETE_USER_QUERY = "DELETE FROM page WHERE id=?";

    


    public void insertUser(pageUser user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_QUERY)) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getDesc());
            preparedStatement.setString(4, user.getLogo());
            preparedStatement.setString(5, user.getImage());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }

    public List<pageUser> getAllUsers() {
        List<pageUser> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS_QUERY);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String uniname = resultSet.getString("uniname");
                String location = resultSet.getString("location");
                String desc = resultSet.getString("description");
                String logo = resultSet.getString("logo");
                String image = resultSet.getString("image");

                pageUser user = new pageUser(id, uniname, location, desc, logo, image);
                userList.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }

        return userList;
    }

    public List<pageUser> searchUsers(String searchQuery) {
        List<pageUser> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM page WHERE uniname LIKE ? OR location LIKE ? OR description LIKE ? or logo LIKE ? OR image LIKE ?")) {

            // Use '%searchQuery%' to perform a partial match
            preparedStatement.setString(1, "%" + searchQuery + "%");
            preparedStatement.setString(2, "%" + searchQuery + "%");
            preparedStatement.setString(3, "%" + searchQuery + "%");
            preparedStatement.setString(4, "%" + searchQuery + "%");
            preparedStatement.setString(5, "%" + searchQuery + "%");
            

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String uniname = resultSet.getString("uniname");
                    String location = resultSet.getString("location");
                    String desc = resultSet.getString("description");
                    String logo = resultSet.getString("logo");
                    String image = resultSet.getString("image");

                    pageUser user = new pageUser(id, uniname, location,desc, logo ,image);
                    userList.add(user);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    
   

    
    public void updateUser(pageUser user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY)) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getDesc());
            preparedStatement.setString(4, user.getLogo());
            preparedStatement.setString(5, user.getImage());
            preparedStatement.setInt(6, user.getId());  // Assuming 'id' is the primary key

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }
    public void updateUserimage(pageUser user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY_IMAGE)) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getDesc());
            preparedStatement.setString(4, user.getImage());
            preparedStatement.setInt(5, user.getId());  // Assuming 'id' is the primary key

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }
    public void updateUserlogo(pageUser user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY_LOGO)) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getDesc());
            preparedStatement.setString(4, user.getLogo());
            preparedStatement.setInt(5, user.getId());  // Assuming 'id' is the primary key

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }
    
    public void notImage(pageUser user) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY_NOT)) {

            preparedStatement.setString(1, user.getUniname());
            preparedStatement.setString(2, user.getLocation());
            preparedStatement.setString(3, user.getDesc());
            preparedStatement.setInt(4, user.getId());  // Assuming 'id' is the primary key
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }
    
    public void deleteUser(int userId) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_QUERY)) {

            preparedStatement.setInt(1, userId);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }
    
    
    public void getDeleteAll() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM page")) {

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log, throw a custom exception, etc.)
        }
    }
    public List<pageUser> getUserByName(String name) {
        List<pageUser> userList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM page WHERE uniname = ?")) {
            preparedStatement.setString(1, name);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String uniname = resultSet.getString("uniname");
                    String location = resultSet.getString("location");
                    String desc = resultSet.getString("description");
                    String logo = resultSet.getString("logo");
                    String image = resultSet.getString("image");

                    pageUser user = new pageUser(id, uniname, location, desc, logo, image);
                    userList.add(user);
                }
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
             ResultSet resultSet = statement.executeQuery("SELECT DISTINCT uniname FROM page")) {

            while (resultSet.next()) {
                String uniName = resultSet.getString("uniname");
                distinctUniNames.add(uniName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return distinctUniNames;
    }
    

    
    
    public pageUser getUserById(int userId) {
        pageUser user = null;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM page WHERE id = ?")) {

            preparedStatement.setInt(1, userId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String uniname = resultSet.getString("uniname");
                    String location = resultSet.getString("location");
                    String desc = resultSet.getString("description");
                    String logo = resultSet.getString("logo");
                    String image = resultSet.getString("image");

                    user = new pageUser(id, uniname, location, desc, logo, image);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }


}


