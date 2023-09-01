
//coded by 137943


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SchoolManagementApp extends Application {
    private TextField nameField;
    private TextField ageField;
    private Button addButton;
    private TableView<Student> studentTable;
    private DatabaseManager databaseManager;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        databaseManager = new DatabaseManager();

        // Create GUI components and layout (replace with your JavaFX code)
        // ...

        addButton = new Button("Add Student");
        addButton.getStyleClass().add("my-button");
        // ...

        // Set up the layout, add components (replace with your JavaFX code)
        // ...

        // Load the style.css file
        String css = getClass().getResource("/resources/style.css").toExternalForm();
        scene.getStylesheets().add(css);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("School Management System");
        primaryStage.show();
    }

    private void addStudent() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());

        Student newStudent = new Student(name, age);
        databaseManager.addStudent(newStudent);
        // Update studentTable
        // ...
    }
}
