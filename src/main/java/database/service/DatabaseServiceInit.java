package database.service;

import database.Database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseServiceInit {
    private static final String initDBFile = "sql/init_db.sql";

    public void initDatabase() {
        Connection con = Database.getInstance().getConnection();
        try (Statement statement = con.createStatement()){
            String sql = Files.readString(Path.of(initDBFile));
            statement.executeUpdate(sql);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
