import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class C3p0Database {
    private static ComboPooledDataSource dataSource;
    static {
        dataSource = new ComboPooledDataSource();
    }
    public static Connection getConn() {
        try {
            return dataSource.getConnection();
        }
        catch (SQLException exc) {
            exc.printStackTrace();
        }
        return null;
    }
    public static void closeConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        }
        catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
    public static void closePrepStmt(PreparedStatement prepStmt) {
        try {
            if (prepStmt != null) {
                prepStmt.close();
            }
        }
        catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
    public static void closeRetSet(ResultSet retSet) {
        try {
            if (retSet != null) {
                retSet.close();
            }
        }
        catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Connection conn = C3p0Database.getConn();
        System.out.println(conn);
    }
}