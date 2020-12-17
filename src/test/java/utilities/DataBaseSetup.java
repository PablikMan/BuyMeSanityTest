package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseSetup {

    public static final String USER_NAME = "qCS151YQiG";
    public static final String DATABASE_NAME = "qCS151YQiG";
    public static final String PASSWORD = "Wh3N8WiYcb";
    public static final String PORT = "3306";
    public static final String SERVER = "remotemysql.com";
    public static Connection con;
    public static String url;
    public static String browserType;

    public static Connection getConnection(){
        try{
            if (con == null){
                con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT, USER_NAME, PASSWORD);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  con;
    }

    public static void createConfigTable(Connection con){
        try{
            String statementToExecute = "CREATE TABLE " + DATABASE_NAME + ".`config`(`config_id` INT NOT NULL, `config_name` VARCHAR(45) NOT NULL, `config_data` VARCHAR(100) NOT NULL, PRIMARY KEY(`config_id`));";
            con.createStatement().execute(statementToExecute);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static String getConfigTableURL(Connection con){
        try {
            String statementToExecute = "SELECT * FROM " + DATABASE_NAME + ".config;";
            ResultSet resultSet = con.createStatement().executeQuery(statementToExecute);
            while (resultSet.next()){
                int id = resultSet.getInt("config_id");
                String name = resultSet.getString("config_name");
                if(name.equals("URL")){
                    url = resultSet.getString("config_data");
                }
            }
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return url;
    }

    public static String getConfigTableBrowser(Connection con){
        try {
            String statementToExecute = "SELECT * FROM " + DATABASE_NAME + ".config;";
            ResultSet resultSet = con.createStatement().executeQuery(statementToExecute);
            while (resultSet.next()){
                int id = resultSet.getInt("config_id");
                String name = resultSet.getString("config_name");
                if(name.equals("browser")){
                    browserType = resultSet.getString("config_data");
                }
            }
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return browserType;
    }

    public static void createResultsTable(Connection con){
        try {
            String statementToExecute = "CREATE TABLE " + DATABASE_NAME + ".`result`(`test_id` INT NOT NULL, `test_date` VARCHAR(50) NOT NULL, PRIMARY KEY(`test_id`));";
            con.createStatement().execute(statementToExecute);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void insertIntoResultTable(Connection con, int id, String date){
        try {
            String statementToExecute = "INSERT INTO " + DATABASE_NAME + ".result (`test_id`, `test_date`) VALUES ('" + id + "', '" + date + "');";
            con.createStatement().execute(statementToExecute);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
