/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZacharyMollenhour;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import View_Controller.MainScreenController;

/**
 *
 * @author Zachary Mollenhour
 */
public class ZacharyMollenhour extends Application {
    Stage window;
    private AnchorPane MainScreenView;

    public void initMainScreen() throws IOException{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ZacharyMollenhour.class.getResource("/View_Controller/MainScreen.fxml"));
        AnchorPane MainScreenView = (AnchorPane) loader.load();
    
        Scene scene = new Scene(MainScreenView);
        
        window.setScene(scene);
        window.show();
    }
    
    public void showMainScreen() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ZacharyMollenhour.class.getResource("/View_Controller/MainScreen.fxml"));
        AnchorPane MainScreenView = (AnchorPane) loader.load();
        
        MainScreenController controller = loader.getController();
        controller.setMainApp(this);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Inventory Management System");
        initMainScreen();
        showMainScreen();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
