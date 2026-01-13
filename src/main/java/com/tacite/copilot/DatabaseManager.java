package com.tacite.copilot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DatabaseManager handles SQLite database connection for the Tacite Copilot application.
 * 
 * Requirements:
 * - SQLite JDBC driver (org.xerial:sqlite-jdbc) must be included in the classpath
 * - The database file (tacite.db) will be created in the application working directory
 * - SQLite creates the database file automatically on first connection if it doesn't exist
 */
public class DatabaseManager {
    
    private static final String DATABASE_URL = "jdbc:sqlite:tacite.db";
    private static Connection connection;
    
    /**
     * Initialize the database connection.
     * Creates or opens the tacite.db database file in the application working directory.
     * The file is created automatically by SQLite JDBC driver if it doesn't exist.
     * If a connection already exists and is valid, this method does nothing to avoid resource leaks.
     */
    public static void init() {
        try {
            // Prevent resource leaks by not creating a new connection if one already exists and is valid
            if (connection != null && !connection.isClosed()) {
                System.out.println("Database connection already initialized.");
                return;
            }
            
            // Connect to the database (creates tacite.db if it doesn't exist)
            connection = DriverManager.getConnection(DATABASE_URL);
            System.out.println("Database connection established successfully.");
            System.out.println("Database file: tacite.db");
        } catch (SQLException e) {
            System.err.println("Failed to initialize database connection to: " + DATABASE_URL);
            e.printStackTrace();
        }
    }
    
    /**
     * Get the current database connection.
     * Validates the connection before returning to ensure it's still usable.
     * @return The active database connection, or null if not initialized or connection is closed
     */
    public static Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {
            System.err.println("Error validating database connection status:");
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Close the database connection.
     */
    public static void close() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;  // Clear the reference after closing
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing database connection:");
                e.printStackTrace();
            }
        }
    }
}
