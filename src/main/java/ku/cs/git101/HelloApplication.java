package ku.cs.git101;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import ku.cs.services.FXRouter;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "git-101");
        configRoute();

        FXRouter.goTo("hello-view");
    }

    private void configRoute() {
        final String VIEW_PATH = "ku/cs/views/";
        FXRouter.when("hello-view", VIEW_PATH + "hello-view.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}