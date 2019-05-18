/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.control.ContentDisplay.CENTER;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Erick
 */
public class HolaMundo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene(grid, 300, 250);
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        
        Label etiqueta = new Label("Numero");
        grid.add(etiqueta, 0, 1);
        TextField numero = new TextField();
        grid.add(numero, 1, 1);
        //etiqueta.setAlignment(Pos.CENTER);
        //etiqueta.setText("Numero");
        Button factorial = new Button("Factorial");
        grid.add(factorial, 1, 2);
        Label resultado = new Label();
        factorial.setOnAction(new EventHandler<ActionEvent>()
        {
        @Override
        public void handle(ActionEvent event){
        String numeroString = numero.getText();
        int numInt = Integer.parseInt(numeroString);
        int factorialR=1;
        for(int x=numInt;x>1;x--){
            factorialR*=x;
        }
        String resultadoString= Integer.toString(factorialR);
        resultado.setText(resultadoString);
        }
        });
        
        
        grid.add(resultado,2,1);
        //primaryStage.setTitle("Hello World!");
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
