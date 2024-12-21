package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    private boolean write = true;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if(write) {
            drawingAreaPane.getChildren().add(new Circle(event.getX(), event.getY(), 4, Color.BLACK));
        } else {
            drawingAreaPane.getChildren().add(new Circle(event.getX(), event.getY(), 4, Color.WHITE));
        }
    }

    @FXML
    void eraseTool(ActionEvent event) {
        write = false;
    }

    @FXML
    void penTool(ActionEvent event) {
        write = true;
    }
}
