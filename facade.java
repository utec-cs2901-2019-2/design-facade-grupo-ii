public class facade{
	public calculate Suma;
	public calculate Resta;
	public calculate Mult;
	public calculate Div;

	public facade(){
		Suma = new suma();
		Resta = new resta();
		Mult = new mult();
		Div = new div();
	}

	public void doSuma(){
		Suma.calculate();
	}

	public void doResta(){
		Resta.calculate();
	}

	public void doMult(){
		Mult.calculate();
	}

	public void doDiv(){
		Div.calculate();
	}
}
