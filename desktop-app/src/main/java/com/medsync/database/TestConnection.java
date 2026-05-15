/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.medsync.database;

import com.medsync.database.DatabaseConnection;

/**
 *
 * @author salva
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConnection db
                = DatabaseConnection.getInstance();

        if (db.getConnection() != null) {

            System.out.println(
                    "Conexion establecida correctamente."
            );

        } else {

            System.out.println(
                    "No se pudo conectar."
            );

        }
    }

}
