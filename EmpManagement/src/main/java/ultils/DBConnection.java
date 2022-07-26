package ultils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private  String driver;
    private  String host;
    private  String port;
    private  String db;
    private  String user;
    private  String pass;
    private Connection conn;



    public DBConnection() {
        super();
        this.driver = "mysql";
        this.host = "localhost";
        this.port = "3306";
        this.db = "employeemanagement";
        this.user = "root";
        this.pass = "multi2022!";
        this.conn = null;
    }
   public void connectDB(){
        try {

            String dbUrl = "jdbc:" + this.driver + "://" + this.host + ":" + this.port+ "/" + this.db;
            this.conn = DriverManager.getConnection(dbUrl, this.user, this.pass);
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void disconnectDB(){
        try {
            this.conn.close();
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
