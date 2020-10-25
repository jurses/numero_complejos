package calcnumerocomplejo;

import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Complex extends DoubleProperty {
	private DoubleProperty dp_a;
	private DoubleProperty dp_b;
	
	public Complex(DoubleProperty dp_a, DoubleProperty dp_b)
	{
		this.dp_a = dp_a;
		this.dp_b = dp_b;
	}
	
	
	

	@Override
	public void bind(ObservableValue<? extends Number> observable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBound() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return dp_a.getValue() + "+" + dp_b.getValue() + "i";
	}

	@Override
	public void addListener(ChangeListener<? super Number> listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(ChangeListener<? super Number> listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(double value) {
		// TODO Auto-generated method stub
		
	}
}
