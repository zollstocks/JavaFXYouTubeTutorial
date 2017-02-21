import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene myScene1, myScene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("It's meeee");

        // workstuff
        Insets myInsets = new Insets(10, 10, 10, 10);

        // Menu
        // #File Menu
        Menu fileMenu = new Menu("File");

        fileMenu.getItems().add(new MenuItem("Neues Projekt..."));
        fileMenu.getItems().add(new MenuItem("Neues Modul..."));
        fileMenu.getItems().add(new SeparatorMenuItem());

        MenuItem importProject = new MenuItem("Importiere Projekt...");
        importProject.setOnAction(e -> System.out.println("Yep"));
        importProject.setDisable(true);
        fileMenu.getItems().add(importProject);

        fileMenu.getItems().add(new MenuItem("Importiere Modul..."));

        // #MainMenuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);
        menuBar.setUseSystemMenuBar(true);

        // Scene1
        // #bottomMenu
        HBox bottomMenu = new HBox();
        Button myButtonA = new Button("Button A");
        Button myButtonB = new Button("Button B");
        Button myButtonC = new Button("Button C");
        Button myButtonD = new Button("Button D");

        // TODO: 20.02.17 CLEAN UP!
        bottomMenu.getChildren().addAll(myButtonA, myButtonB, myButtonC, myButtonD);
        bottomMenu.setSpacing(5);

        myButtonA.setOnAction(e -> window.setScene(myScene2));

        // #leftMenu
        VBox leftMenu = new VBox();
        Button myButtonE = new Button("Button E");
        Button myButtonF = new Button("Button F");
        Button myButtonG = new Button("Button G");
        Button myButtonH = new Button("Button H");



        // TODO: 20.02.17 CLEAN UP!
        leftMenu.getChildren().addAll(myButtonE, myButtonF, myButtonG, myButtonH);
        leftMenu.setSpacing(5);

        // #centerMenu
        TextField myInput = new TextField();
        myInput.setPromptText("Schreib was rein!");
        VBox centerBox = new VBox(10, myInput);

        myButtonE.setOnAction(e -> System.out.println(myInput.getText()) );

        // BorderPane
        BorderPane myBorderPane = new BorderPane(centerBox, menuBar, null, bottomMenu, leftMenu);

        BorderPane.setMargin(bottomMenu, myInsets);
        BorderPane.setMargin(leftMenu, myInsets);
        BorderPane.setMargin(centerBox, myInsets);

        myScene1 = new Scene(myBorderPane, 1080, 720);

        // Scene2
        Button secondButton = new Button("Bring me back");
        secondButton.setOnAction(e -> window.setScene(myScene1));

        Button thirdButton = new Button("Nummer 3");
        CheckBox myBox = new CheckBox("MyCheckBox");

        VBox secondVBox = new VBox(secondButton, myBox, thirdButton);
        secondVBox.setPadding(myInsets);
        myScene2 = new Scene(secondVBox, 300, 300);


        // Window
        window.setScene(myScene1);
        window.show();
    }
}
