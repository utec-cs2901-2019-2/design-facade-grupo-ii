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


	public void doSuma(double ... args){
		Suma.calculate(args);
	}

	public void doResta(double ... args){
		Resta.calculate(args);
	}

	public void doMult(double ... args){
		Mult.calculate(args);
	}

	public void doDiv(double ... args){
		Div.calculate(args);
	}
}
