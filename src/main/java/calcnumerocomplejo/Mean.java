package calcnumerocomplejo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Separator;
import javafx.scene.control.Button;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.util.converter.NumberStringConverter;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage s)
	{
		s.setTitle("Calculadora de números complejos");
		HBox root = new HBox();
		Scene sc = new Scene(root, 400, 200);
		VBox v_operator = new VBox();
		VBox v_complexnumberfields = new VBox();
		VBox v_equal = new VBox();
		Text t_c1plus = new Text("+");
		Text t_c2plus = new Text("+");
		Text t_crplus = new Text("+");
		Text t_c1inumber = new Text("i");
		Text t_c2inumber = new Text("i");
		Text t_crinumber = new Text("i");
		TextField tf_c1a = new TextField();
		TextField tf_c1b = new TextField();
		TextField tf_c2a = new TextField();
		TextField tf_c2b = new TextField();
		TextField tf_cra = new TextField();
		TextField tf_crb = new TextField();
		DoubleProperty dp_a1 = new SimpleDoubleProperty();
		DoubleProperty dp_a2 = new SimpleDoubleProperty();
		DoubleProperty dp_ar = new SimpleDoubleProperty();
		DoubleProperty dp_b1 = new SimpleDoubleProperty();
		DoubleProperty dp_b2 = new SimpleDoubleProperty();
		DoubleProperty dp_br = new SimpleDoubleProperty();
		Separator s_separator = new Separator();
		Button b_equal = new Button();
		b_equal.setText("=");
		
		tf_cra.setEditable(false);
		tf_cra.setDisable(false);
		tf_crb.setEditable(false);
		tf_crb.setDisable(false);
		
		ComboBox<String> cb_operator = new ComboBox<String>();
		
		cb_operator.getItems().addAll("+", "-", "*", "/");
		v_operator.getChildren().add(cb_operator);
		
		HBox h_c1 = new HBox();
		h_c1.getChildren().add(tf_c1a);
		h_c1.getChildren().add(t_c1plus);
		h_c1.getChildren().add(tf_c1b);
		h_c1.getChildren().add(t_c1inumber);
		
		HBox h_c2 = new HBox();
		h_c2.getChildren().add(tf_c2a);
		h_c2.getChildren().add(t_c2plus);
		h_c2.getChildren().add(tf_c2b);
		h_c2.getChildren().add(t_c2inumber);
		
		HBox h_cr = new HBox();
		h_cr.getChildren().add(tf_cra);
		h_cr.getChildren().add(t_crplus);
		h_cr.getChildren().add(tf_crb);
		h_cr.getChildren().add(t_crinumber);
		
		
		v_complexnumberfields.getChildren().add(h_c1);
		v_complexnumberfields.getChildren().add(h_c2);
		v_complexnumberfields.getChildren().add(s_separator);
		v_complexnumberfields.getChildren().add(h_cr);
	
		v_equal.getChildren().add(b_equal);
		
		root.getChildren().add(v_operator);
		root.getChildren().add(v_complexnumberfields);
		root.getChildren().add(v_equal);
		
		tf_c1a.textProperty().bind(dp_a1);
		tf_c1b.textProperty().bind(dp_b1);
		tf_c2a.textProperty().bind(dp_a2);
		tf_c2b.textProperty().bind(dp_b2);
		/*
		tf_c1b.textProperty().addListener((o, ov, nv) -> {
			dp_b1.set(Double.parseDouble(nv));
		});
		tf_c2a.textProperty().addListener((o, ov, nv) -> {
			dp_b2.set(Double.parseDouble(nv));
		});
		tf_c2b.textProperty().addListener((o, ov, nv) -> {
			dp_b2.set(Double.parseDouble(nv));
		});
		*/
		tf_cra.textProperty().addListener((o, ov, nv) -> {
			dp_ar.set(Double.parseDouble(nv));
		});
		tf_crb.textProperty().addListener((o, ov, nv) -> {
			dp_br.set(Double.parseDouble(nv));
		});
		
		cb_operator.valueProperty().addListener((o, ov, nv) -> {
			switch (nv)
			{
			case "+":
				dp_ar.equals(dp_a1.add(dp_a2));
				dp_br.equals(dp_b1.add(dp_b2));
				break;
			case "-":
				dp_ar.equals(dp_a1.subtract(dp_a2));
				dp_br.equals(dp_b1.subtract(dp_b2));
				break;
			case "*":
				dp_ar.equals(dp_a1.multiply(dp_a2).subtract(dp_b1.multiply(dp_b2)))
				break;
			case "/":
				break;
			}
		});
	
		s.setScene(sc);
		s.show();
	}
}
