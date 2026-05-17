/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medsync.repositories;

import com.medsync.database.DatabaseConnection;
import com.medsync.models.Paciente;

/**
 *
 * @author salva
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {

    private final Connection connection;

    public PacienteRepository() {
        connection = DatabaseConnection.getInstance().getConnection();
    }

    public boolean guardarPaciente(Paciente paciente) {

        String sql = "INSERT INTO pacientes(nombre, apellido, telefono, email"
                + ") VALUES (?, ?, ?, ?)";
        try {

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, paciente.getNombre());
            statement.setString(2, paciente.getApellido());
            statement.setString(3, paciente.getTelefono());
            statement.setString(4, paciente.getEmail());

            statement.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Paciente> obtenerPacientes() {
        
        List<Paciente> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM pacientes";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()) {
                Paciente paciente = new Paciente();
                
                paciente.setId(result.getInt("id"));
                paciente.setNombre(result.getString("nombre"));
                paciente.setApellido(result.getString("apellido"));
                paciente.setTelefono(result.getString("telefono"));
                paciente.setEmail(result.getString("email"));
                
                lista.add(paciente);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }
}
