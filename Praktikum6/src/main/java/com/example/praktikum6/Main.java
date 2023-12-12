package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mahasiswa Keren");
        TableView tableduzz = new TableView();
        TableColumn<Mahasiswa, String>kolomNim = new
                TableColumn<>("NIM");
        kolomNim.setCellValueFactory(
                new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolomNama = new
                TableColumn<>("Nama");
        kolomNama.setCellValueFactory(
                new PropertyValueFactory<>("nim"));
        tableduzz.getColumns().add(kolomNim);
        tableduzz.getColumns().add(kolomNama);
        tableduzz.getItems().add(
                new Mahasiswa( "M. Izzuddin Abdis Salam","2210817110005"));
        tableduzz.getItems().add(
                new Mahasiswa( "Mahatma Gandhi","2210817110001"));
        tableduzz.getItems().add(
                new Mahasiswa( "Nikolas Tesla",  "2210817110002"));
        tableduzz.getItems().add(
                new Mahasiswa("Bill Gates",  "2210817110003"));
        tableduzz.getItems().add(
                new Mahasiswa( "Stephen Hawking", "2210817110004"));
        tableduzz.getItems().add(
                new Mahasiswa( "Steve Jobs", "2210817110006"));
        tableduzz.getItems().add(
                new Mahasiswa( "Wayne Rooney", "2210817110007"));
        tableduzz.getItems().add(
                new Mahasiswa( "Tiger Woods","2210817110008"));
        tableduzz.getItems().add(
                new Mahasiswa( "Max Verstappen","2210817110009"));
        tableduzz.getItems().add(
                new Mahasiswa( "Marcus Ericsson", "2210817110010"));
        VBox box = new VBox(tableduzz);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}