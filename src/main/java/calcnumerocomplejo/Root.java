package calcnumerocomplejo;

import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Separator;

public class Root extends HBox {

	private ComboBox cb_operator;
	private TextField tf_a1;
	private TextField tf_b1;
	private TextField tf_a2;
	private TextField tf_b2;
	private TextField tf_ar;
	private TextField tf_br;
	private Text t_p1;
	private Text t_p2;
	private Text t_pr;
	private Text t_i1;
	private Text t_i2;
	private Text t_ir;
	private Separator s_separator;
	private VBox v_select_operator;
	private VBox v_operation;
	private HBox h_c1;
	private HBox h_c2;
	private HBox h_cr;
	
	
	public Root() {
		super();
		cb_operator.getItems().addAll("+", "-", "*", "/");
		this.getChildren().add(cb_operator);
		// TODO Auto-generated constructor stub
	}

	public Root(double spacing) {
		super(spacing);
		// TODO Auto-generated constructor stub
	}

	public Root(Node... children) {
		super(children);
		// TODO Auto-generated constructor stub
	}

	public Root(double spacing, Node... children) {
		super(spacing, children);
		// TODO Auto-generated constructor stub
	}

}
