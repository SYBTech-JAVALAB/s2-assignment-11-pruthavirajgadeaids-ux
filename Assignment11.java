import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TrafficLightFX extends Application {

    @Override
    public void start(Stage stage) {

       
        Label messageLabel = new Label("");
        messageLabel.setFont(new Font("Arial", 24));

        
        RadioButton redBtn = new RadioButton("Red");
        RadioButton yellowBtn = new RadioButton("Yellow");
        RadioButton greenBtn = new RadioButton("Green");

        
        ToggleGroup group = new ToggleGroup();
        redBtn.setToggleGroup(group);
        yellowBtn.setToggleGroup(group);
        greenBtn.setToggleGroup(group);

      
        redBtn.setOnAction(e -> {
            messageLabel.setText("STOP");
            messageLabel.setTextFill(Color.RED);
        });

        yellowBtn.setOnAction(e -> {
            messageLabel.setText("READY");
            messageLabel.setTextFill(Color.GOLD);
        });

        greenBtn.setOnAction(e -> {
            messageLabel.setText("GO");
            messageLabel.setTextFill(Color.GREEN);
        });

       
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(messageLabel, redBtn, yellowBtn, greenBtn);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Traffic Light Simulator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
