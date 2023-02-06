import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
public class DruidDatabase {
    private static final String DRUID_PROP = "./src/druid.properties";
    private static DataSource dataSource;
    static {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(DRUID_PROP));
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
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
}