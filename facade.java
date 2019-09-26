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


	public void doSuma(int n, int m){
		Suma.calculate(n, m);
	}

	public void doResta(int n, int m){
		Resta.calculate(n, m);
	}

	public void doMult(int n,int  m){
		Mult.calculate(n, m);
	}

	public void doDiv(int n,int  m){
		Div.calculate(n, m);
	}
}
