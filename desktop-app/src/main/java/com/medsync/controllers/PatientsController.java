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


import com.medsync.models.Paciente;
import com.medsync.repositories.PacienteRepository;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

public class PatientsController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtEmail;

    @FXML
    private TableView<Paciente> tablePacientes;

    @FXML
    private TableColumn<Paciente, Integer> colId;

    @FXML
    private TableColumn<Paciente, String> colNombre;

    @FXML
    private TableColumn<Paciente, String> colApellido;

    @FXML
    private TableColumn<Paciente, String> colTelefono;

    @FXML
    private TableColumn<Paciente, String> colEmail;

    private final PacienteRepository repository =
            new PacienteRepository();

    private final ObservableList<Paciente> listaPacientes =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        configurarTabla();

        cargarPacientes();
    }

    public void configurarTabla() {

        colId.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre")
        );

        colApellido.setCellValueFactory(
                new PropertyValueFactory<>("apellido")
        );

        colTelefono.setCellValueFactory(
                new PropertyValueFactory<>("telefono")
        );

        colEmail.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
    }

    public void cargarPacientes() {

        listaPacientes.clear();

        listaPacientes.addAll(
                repository.obtenerPacientes()
        );
        
        System.out.println(listaPacientes.size());

        tablePacientes.setItems(listaPacientes);
    }

    @FXML
    public void guardarPaciente() {

        Paciente paciente = new Paciente(
                txtNombre.getText(),
                txtApellido.getText(),
                txtTelefono.getText(),
                txtEmail.getText()
        );

        boolean success =
                repository.guardarPaciente(paciente);

        if (success) {

            limpiarCampos();

            cargarPacientes();

            System.out.println("Paciente guardado.");
        }
    }

    public void limpiarCampos() {

        txtNombre.clear();

        txtApellido.clear();

        txtTelefono.clear();

        txtEmail.clear();
    }
}
