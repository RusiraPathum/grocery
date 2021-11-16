package pos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class posController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to First JavaFX Application!");
    }

}
