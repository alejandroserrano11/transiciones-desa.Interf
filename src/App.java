import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage escenario) throws IOException {

        Parent escena = FXMLLoader.load(getClass().getResource("vista.fxml"));
        /* 
        Rectangle rectangulo = new Rectangle();
        rectangulo.setX(275);
        rectangulo.setY(180);
        rectangulo.setWidth(50);
        rectangulo.setHeight(40);
        rectangulo.setFill(Color.RED);

        RotateTransition rotar = new RotateTransition(Duration.seconds(5));
        rotar.setFromAngle(0);
        rotar.setToAngle(360);
        rotar.setInterpolator(Interpolator.LINEAR);
        rotar.setCycleCount(Timeline.INDEFINITE);

        TranslateTransition mover = new TranslateTransition(Duration.seconds(5));
        mover.setToX(500);
        mover.setToY(350);
        mover.setInterpolator(Interpolator.LINEAR);
        mover.setAutoReverse(true);
        mover.setCycleCount(Timeline.INDEFINITE);

        FadeTransition difuminar = new FadeTransition(Duration.seconds(5));
        difuminar.setFromValue(1.0);
        difuminar.setToValue(0.1);
        difuminar.setInterpolator(Interpolator.LINEAR);
        mover.setAutoReverse(true);
        mover.setCycleCount(Timeline.INDEFINITE);

        ParallelTransition paralelo = new ParallelTransition(rectangulo, rotar, mover, difuminar);
        paralelo.play();
*/
        
        escenario.setScene(new Scene(escena, 600, 400));
        escenario.show();
    }
}
