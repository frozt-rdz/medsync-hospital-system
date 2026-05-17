/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medsync.utils;

/**
 *
 * @author salva
 */
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    public static void switchScene(Stage stage, String fxmlFile) {
        
        try {
             FXMLLoader loader = new FXMLLoader(
                    SceneManager.class.getResource(
                            "/com/medsync/desktop/app/" + fxmlFile));
             
             Parent root = loader.load();
             
             stage.setScene(new Scene(root));
             
             stage.show();
        } catch (Exception e) {
            System.out.println("Error al cambiar escena");
            e.printStackTrace();
        }
    }
}
