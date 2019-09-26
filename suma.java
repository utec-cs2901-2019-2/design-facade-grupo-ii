public class suma implements calculate {
        @Override
        public void calculate(double ... args){
		double sum = 0;
		for (double i: args) sum += i;

                System.out.println(sum);
        }

}

