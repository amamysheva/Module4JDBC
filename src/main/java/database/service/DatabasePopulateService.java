package database.service;

import database.Database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    private static final String POPULATE_DB_FILE = "sql/populate_db.sql";

    public void populateDatabase() {
        Connection connection = Database.getInstance().getConnection();
        try (Statement statement = connection.createStatement()){
            String sql = Files.readString(Path.of(POPULATE_DB_FILE));
            statement.executeUpdate(sql);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
