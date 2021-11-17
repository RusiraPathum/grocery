package auth;

import com.example.grocery.main;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class authController implements Initializable {

    @FXML
    private Circle c1;

    @FXML
    private AnchorPane content_area;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setRotate(c1, true, 360, 8);
    }

    private void setRotate (Circle c1, boolean reverse, int angle, int duration){

        RotateTransition rt = new RotateTransition(Duration.seconds(duration), c1);

        rt.setAutoReverse(reverse);

        rt.setByAngle(angle);
        rt.setDelay(Duration.millis(duration));
        rt.setRate(1);
        rt.setCycleCount(200);
        rt.play();

    }

    @FXML
    private void signUp(MouseEvent event) throws IOException {

        Parent fxml = FXMLLoader.load(getClass().getResource("register.fxml"));
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
    }

    @FXML
    private void signIn(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        main.stage.getScene().setRoot(root);
    }

}
