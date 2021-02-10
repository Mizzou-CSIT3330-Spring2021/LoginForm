/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public class LoginForm extends Application {
    
    private String title = "My JavaFX Login";
    private int width = 600; 
    private int height = 400; 
    
    private String loginTitle = "Welcome Please Login";
    private String fontStyle = "Comic Sans MS"; 
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane(); 
        root.setAlignment(Pos.CENTER);
        root.setHgap(20); 
        root.setVgap(20);
        root.setPadding(new Insets(25, 25, 25, 25)); 
        
        Text sceneTitle = new Text(loginTitle); 
        sceneTitle.setFont(Font.font(fontStyle, FontWeight.BOLD, 26));
        root.add(sceneTitle, 0, 0);
        
        Label userNameLabel = new Label("Username: "); 
        userNameLabel.setFont(Font.font(fontStyle, FontWeight.NORMAL, 18)); 
        root.add(userNameLabel, 0, 1); 
        
        
        
        Scene scene = new Scene(root, width, height); 
        
        primaryStage.setScene(scene);
        primaryStage.setTitle(title);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
