import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class user_interface extends Application {
    Button distanceButton;
    Button massButton;
    Button volumeButton;
    Button toDistanceButton;
    Button toMassButton;
    Button toVolumeButton;
    Button calculateButton;
    Button exitButton;

    static Label fromUnitPrompt;
    static Label quantityPrompt;
    static Label toUnitPrompt;
    static Label output;

    TextField fromUnit;
    TextField quantity;
    TextField toUnit;

    String validUnits;
    String unitType;
    double value;
    String unitFrom;
    String unitTo;

    double convertVal;

    public static void setPrompts(String validUnits) {
        fromUnitPrompt.setText("Enter one of these units to convert form: " + validUnits);
        toUnitPrompt.setText("Enter one of these units to convert to: " + validUnits);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        distanceButton = new Button("DISTANCE");
        massButton = new Button("MASS");
        volumeButton = new Button("VOLUME");

        calculateButton = new Button("CALCULATE");
        exitButton = new Button("EXIT");

        fromUnitPrompt = new Label("Enter one of these units to convert form: " + validUnits);
        fromUnit = new TextField();
        quantityPrompt = new Label("Enter a quantity: ");
        quantity = new TextField();
        toUnitPrompt = new Label("Enter one of these units to convert to: " + validUnits);
        toUnit = new TextField();

        output = new Label();
        
        exitButton.setOnAction(event -> {
            System.out.println("Thank you for using the converter!");
        });

        distanceButton.setOnAction(event -> {
            unitType = "DISTANCE";
            validUnits = "mm, cm, m, km, in, ft, yd, mi";
            setPrompts(validUnits);
        });

        massButton.setOnAction(event -> {
            unitType = "MASS";
            validUnits = "mg, g, kg, t, oz, lb, tn";
            setPrompts(validUnits);
        });

        volumeButton.setOnAction(event -> {
            unitType = "VOLUME";
            validUnits = "mL, L, tsp, Tbsp, floz, cp, pt, qt, gal";
            setPrompts(validUnits);
        });

        calculateButton.setOnAction(event -> {
            unitFrom = fromUnit.getText();
            unitTo = toUnit.getText();
            value = Double.parseDouble(quantity.getText());

            if (unitType.equals("DISTANCE")) {
                convertVal = unit_converter.converter_distance(unitFrom, unitTo, value);
            } else if (unitType.equals("MASS")) {
                convertVal = unit_converter.converter_mass(unitFrom, unitTo, value);
            } else if (unitType.equals("VOLUME")) {
                convertVal = unit_converter.converter_volume(unitFrom, unitTo, value);
            }

            output.setText(String.format("%.4f", value) + " " + unitFrom + " is equivalent to about " + String.format("%.4f", convertVal) + " " + unitTo + "!");
        });

        VBox screen = new VBox(5);
        
        HBox typeButtons = new HBox(5);
        typeButtons.getChildren().addAll(distanceButton, massButton, volumeButton);

        VBox inputFields = new VBox(5);
        inputFields.getChildren().addAll(fromUnitPrompt, fromUnit, quantityPrompt, quantity, toUnitPrompt, toUnit);

        HBox finalOptionButtons = new HBox(5);
        finalOptionButtons.getChildren().addAll(calculateButton, exitButton);

        VBox outputField = new VBox(5);
        outputField.getChildren().add(output);

        screen.getChildren().addAll(typeButtons, inputFields, finalOptionButtons, outputField);
        StackPane layout = new StackPane();
        layout.getChildren().add(screen);

        primaryStage.setTitle("Unit Converter");
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);

        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }
}
