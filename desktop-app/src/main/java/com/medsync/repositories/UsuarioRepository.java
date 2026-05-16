/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medsync.repositories;

import com.medsync.database.DatabaseConnection;
import com.medsync.models.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author salva
 */
public class UsuarioRepository {

    private final Connection connection;

    public UsuarioRepository() {
        connection = DatabaseConnection.getInstance().getConnection();
    }

    public boolean guardarUsuario(Usuario usuario) {

        String sql = "INSERT INTO usuarios (username, password_hash, email, rol_id)"
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getPasswordHash());
            statement.setString(3, usuario.getEmail());
            statement.setInt(4, usuario.getRolId());

            statement.executeUpdate();

            System.out.println("Usuario guardado correctamente");

            return true;
        } catch (SQLException e) {
            System.out.println("Error al guardar el usuario");

            e.printStackTrace();

            return false;
        }
    }
}
