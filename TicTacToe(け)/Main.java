package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("     TicTacToe");
        primaryStage.setScene(new Scene(root, 383, 400));
        primaryStage.setX(130);
        primaryStage.setY(70);
        primaryStage.show();
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("gic.png")));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
