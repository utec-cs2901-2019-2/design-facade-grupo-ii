public class resta implements calculate {
        @Override
        public void calculate(double ... args){
                double res = 0;
                for (double i: args) res -= i;

                System.out.println(res);
        }
}


