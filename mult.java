public class mult implements calculate {

        public void calculate(double ... args){
                double mu = 0;
                for (double i: args) mu *= i;

                System.out.println(mu);
        }

}

