package com.medsync.database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author salva
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    private final String URL = "jdbc:postgresql://localhost:5432/medsync_db";

    private final String USER = "postgres";
    private final String PASSWORD = "salva123diaz";

    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Conexion exitosa a PostgreSQL.");

        } catch (SQLException e) {

            System.out.println("Error de conexion.");
            e.printStackTrace();

        }
    }
    
     public static synchronized DatabaseConnection getInstance() {

        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
     
     public Connection getConnection() {
        return connection;
    }
     
     
     
}
