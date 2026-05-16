/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.medsync.controllers;

import com.medsync.repositories.UsuarioRepository;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    private final UsuarioRepository repository = new UsuarioRepository();

    @FXML
    public void handleLogin() {

        String username = txtUsername.getText();

        String password = txtPassword.getText();

        boolean success = repository.login(username, password);

        if (success) {
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
