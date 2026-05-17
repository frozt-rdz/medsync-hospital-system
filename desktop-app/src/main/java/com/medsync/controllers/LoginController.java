/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.medsync.controllers;

import com.medsync.repositories.UsuarioRepository;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

            try {

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource(
                                "/com/medsync/desktop/app/dashboard.fxml"
                        )
                );

                Parent root = loader.load();

                Stage stage = (Stage) txtUsername.getScene().getWindow();

                stage.setScene(new Scene(root));

                stage.show();

                System.out.println("Dashboard abierto.");

            } catch (Exception e) {

                System.out.println("Error al abrir dashboard");

                e.printStackTrace();
            }

        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");

            alert.setHeaderText(null);

            alert.setContentText("Usuario o contraseña incorrectos.");

            alert.showAndWait();
        }
    }
}
