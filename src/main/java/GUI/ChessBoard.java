package GUI;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class ChessBoard extends GridPane {
    public ChessBoard(int size) {
        //assets..
        var cream = Color.web("#ebebd3");
        var green= Color.web("#749454");
        var blackQueenImg = new ImagePattern(new Image("/blackqueen.png"));
        int squareSize = 50;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Rectangle bg = new Rectangle(squareSize , squareSize );
                Rectangle square = new Rectangle(squareSize -4, squareSize -4);
                square.setFill(blackQueenImg);
                bg.setFill((i + j) % 2 == 0 ? cream : green);
                StackPane pane = new StackPane(bg, square);
                add(pane, i, j);
            }
        }
    }
}
//class ChessBoard extends GridPane {
//    public ChessBoard(int size) {
//
//        int squareSize = 50;
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                Rectangle square = new Rectangle(squareSize, squareSize);
//                square.setFill((i + j) % 2 == 0 ? Color.WHITE : Color.BLACK);
//                add(square, i, j);
//            }
//        }
//    }
//}
