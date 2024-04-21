
public class RectangleApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleApp.class.getResource("recApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Reading rectangles from file!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}