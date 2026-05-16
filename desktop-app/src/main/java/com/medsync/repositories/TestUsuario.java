/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.medsync.repositories;

import com.medsync.models.Usuario;

/**
 *
 * @author salva
 */
public class TestUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario("salvador","123456","salva@test.com",1);
        
        UsuarioRepository repository = new UsuarioRepository();
        
        repository.guardarUsuario(usuario);
    }
    
}
