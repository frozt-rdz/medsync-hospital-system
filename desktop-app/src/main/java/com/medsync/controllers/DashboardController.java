/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.medsync.controllers;

/**
 * FXML Controller class
 *
 * @author salva
 */
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class DashboardController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    public void initialize() {
        loadView("home.fxml");
    }

    @FXML
    public void showHome() {
        loadView("home.fxml");
    }

    @FXML
    public void showPatients() {
        loadView("patients.fxml");
    }

    @FXML
    public void showAppointments() {
        loadView("appointments.fxml");
    }

    @FXML
    public void showDoctors() {
        loadView("doctors.fxml");
    }

    @FXML
    public void showInventory() {
        loadView("inventory.fxml");
    }

    @FXML
    public void showUsers() {
        loadView("users.fxml");
    }

    public void loadView(String fxml) {

        try {
            
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/com/medsync/desktop/app/views/" + fxml
                    )
            );
            
            AnchorPane view = loader.load();

            contentPane.getChildren().setAll(view);

        } catch (IOException e) {

            System.out.println("Error cargando vista.");

            e.printStackTrace();
        }
    }
}
