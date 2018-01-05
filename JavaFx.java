
package MyJavaFX;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;



public class JavaFx extends Application {
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	
 
    
		BorderPane bp = new BorderPane();
		
		// radio buttons creation starts here
		// after three buttons created then solve for alignment and box type border at Top center position
		ToggleGroup group = new ToggleGroup();
		
		RadioButton btn1 = new RadioButton("Flag 1");
		btn1.setToggleGroup(group);
		btn1.setSelected(true);

		RadioButton btn2 = new RadioButton("Flag 2");
		btn2.setToggleGroup(group);

		RadioButton btn3 = new RadioButton("Flag 3");
		btn3.setToggleGroup(group);
		
		HBox hb = new HBox(15, btn1, btn2, btn3);
		// grid pane used because only this pane contains grid line visible option 
		GridPane gb = new GridPane();
		gb.add(hb, 2,2);
		gb.setGridLinesVisible(true);
		gb.setPadding(new Insets (20) );
		gb.setScaleShape(true);
		// referred from friend
		gb.setStyle("-fx-alignment:top-center");
		bp.setTop(gb);
		
		
		// buttons are created here at bottom right
		AnchorPane ap = new AnchorPane();
	
		Button bHelp = new Button ("Help");
		Button bCancel = new Button ("Cancel");
		Button bOk = new Button ("OK");
		
		HBox hb1 = new HBox(22, bHelp, bCancel, bOk);
		
		ap.getChildren().addAll(hb1);
		ap.setRightAnchor(hb1, 20d);
		ap.setBottomAnchor(hb1, 20d);
		bp.setBottom(ap);
		
		
		// Body parts starts here left, right and center.
		//
		GridPane gp1 = new GridPane();
		//create text fields
		TextField text1 = new TextField ("Display Line 1");
		TextField text2 = new TextField ("Display Line 2");
		TextField text3 = new TextField ("Display Line 3");
		TextField text4 = new TextField ("Display Line 4");
		TextField text5 = new TextField ("Display Line 5");
		TextField text6 = new TextField ("Display Line 6");
		TextField text7 = new TextField ("Display Line 7");
		TextField text8 = new TextField ("Display Line 8");
		TextField text9 = new TextField ("Display Line 9");
		// aligning text fields in colum and row
		gp1.add(text1, 0, 2);
		gp1.add(text2, 0, 3);
		gp1.add(text3, 0, 4);
		gp1.add(text4, 0, 5);
		gp1.add(text5, 0, 6);
		gp1.add(text6, 0, 7);
		gp1.add(text7, 0, 8);
		gp1.add(text8, 0, 9);
		gp1.add(text9, 0, 10);
		// now give style to textfields
		
		text1.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text1.setPrefColumnCount(40);
		text1.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");
		
		text2.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text2.setPrefColumnCount(40);
		text2.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text3.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text3.setPrefColumnCount(40);
		text3.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text4.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text4.setPrefColumnCount(40);
		text4.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text5.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text5.setPrefColumnCount(40);
		text5.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text6.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text6.setPrefColumnCount(40);
		text6.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text7.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text7.setPrefColumnCount(40);
		text7.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text8.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text8.setPrefColumnCount(40);
		text8.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");

		text9.setFont(Font.font("San Serif", FontWeight.BOLD, FontPosture.ITALIC, 24));
		text9.setPrefColumnCount(40);
		text9.setStyle("-fx-control-inner-background: Yellow; -fx-text-inner-color: blue;");
		
		gp1.setStyle("-fx-alignment: Center");
		gp1.setHgap(2);
		gp1.setVgap(2);
		bp.setCenter(gp1);
	
		
		GridPane gpLeft = new GridPane();
		Image img1 = new Image(getClass().getResourceAsStream("/image/flagIcon0.gif"));
		Label city1 = new Label("Denmark");
		city1.setGraphic(new ImageView(img1));
		
		Image img2 = new Image(getClass().getResourceAsStream("/image/flagIcon1.gif"));
		Label city2 = new Label("Germany");
		city2.setGraphic(new ImageView(img2));

		Image img3 = new Image(getClass().getResourceAsStream("/image/flagIcon2.gif"));
		Label city3 = new Label("China");
		city3.setGraphic(new ImageView(img3));
		
		gpLeft.add(city1, 0, 0);
		gpLeft.add(city2, 0, 3);
		gpLeft.add(city3, 0, 6);
		
		gpLeft.setHgap(10);
		gpLeft.setVgap(65);
		gpLeft.setStyle("-fx-alignment: Center-left;-fx-font-size: 15; -fx-font-weight: bold;");
		bp.setLeft(gpLeft);
		
		// right side part
		GridPane gpRight = new GridPane();
		Image img4 = new Image(getClass().getResourceAsStream("/image/flagIcon3.gif"));
		Label city4 = new Label("India");
		city4.setGraphic(new ImageView(img4));
		
		Image img5 = new Image(getClass().getResourceAsStream("/image/flagIcon4.gif"));
		Label city5 = new Label("Norway");
		city5.setGraphic(new ImageView(img5));

		Image img6 = new Image(getClass().getResourceAsStream("/image/flagIcon5.gif"));
		Label city6 = new Label("United Kingdom");
		city6.setGraphic(new ImageView(img6));
		
		gpRight.add(city4, 0, 0);
		gpRight.add(city5, 0, 3);
		gpRight.add(city6, 0, 6);
		
		gpRight.setHgap(10);
		gpRight.setVgap(65);
		gpRight.setStyle("-fx-alignment: Center-Right; -fx-font-weight: bold; -fx-font-size: 15;");
		GridPane.setHalignment(city4, HPos.RIGHT);
		GridPane.setHalignment(city5, HPos.RIGHT);
		GridPane.setHalignment(city6, HPos.RIGHT);
		bp.setRight(gpRight);
		
		// colour is not working 
		Scene scene = new Scene(bp, 1100, 650, Color.DARKGRAY);
		primaryStage.setTitle("Assignment 5");
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    
    public static void main(String [] args) {
        Application.launch(args);
    }
    
}
