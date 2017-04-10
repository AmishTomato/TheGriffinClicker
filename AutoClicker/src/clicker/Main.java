package clicker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Menu file = new Menu("File");
    private MenuBar menuBar = new MenuBar();
    private MenuItem run = new MenuItem("Run");
    private MenuItem close = new MenuItem("Close");
    private Scene scene;
    private BorderPane pane = new BorderPane();


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Clicker.fxml"));
        primaryStage.setTitle("Clicker");
        scene = new Scene(pane, 500,500);

        primaryStage.setTitle("Clicker");

        menuBar.getMenus().addAll(file);
        file.getItems().addAll(run, close);
        run.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AutoClicker.MainFunction();
            }
        });

        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        pane.setTop(menuBar);


    }


    public static void main(String[] args) {
        launch(args);
    }
}
