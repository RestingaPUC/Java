import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DB.getConnection();

            ps = conn.prepareStatement(
                    "DELETE FROM seller "
                    + "WHERE "
                    + "Id = ?");

            ps.setInt(1, 11);

            int rowsAffected = ps.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
            
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

    }
}
