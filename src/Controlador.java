import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controlador {

    @FXML
    Pane principal;

    public void initialize() {
        Rectangle rectangulo = new Rectangle();
        rectangulo.setX(275);
        rectangulo.setY(180);
        rectangulo.setWidth(50);
        rectangulo.setHeight(40);
        rectangulo.setFill(Color.RED);

        principal.getChildren().add(rectangulo);
    }

    public void rotar() {
        Rectangle rectangulo = (Rectangle) principal.getChildren().getLast();
        RotateTransition rotar = new RotateTransition(Duration.seconds(5), rectangulo);
        rotar.setFromAngle(0);
        rotar.setToAngle(360);
        rotar.setInterpolator(Interpolator.LINEAR);
        rotar.setCycleCount(Timeline.INDEFINITE);
        rotar.play();
        
        //ParallelTransition paralelo = new ParallelTransition(rectangulo, rotar, mover, difuminar);
        //paralelo.play();
    }

    public void mover() {
        Rectangle rectangulo = (Rectangle) principal.getChildren().getLast();
        TranslateTransition mover = new TranslateTransition(Duration.seconds(5), rectangulo);
        mover.setToX(500);
        mover.setToY(350);
        mover.setInterpolator(Interpolator.LINEAR);
        mover.setAutoReverse(true);
        mover.setCycleCount(Timeline.INDEFINITE);
        mover.play();
    }

    public void difuminar() {
        Rectangle rectangulo = (Rectangle) principal.getChildren().getLast();
        FadeTransition difuminar = new FadeTransition(Duration.seconds(5), rectangulo);
        difuminar.setFromValue(1.0);
        difuminar.setToValue(0.1);
        difuminar.setInterpolator(Interpolator.LINEAR);
        difuminar.setAutoReverse(true);
        difuminar.setCycleCount(Timeline.INDEFINITE);
        difuminar.play();
    }
}
