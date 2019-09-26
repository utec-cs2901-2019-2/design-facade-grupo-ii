public class div implements calculate {
        @Override
        public void calculate(double ... args){
                double di = 0;
                for (double i: args) di /= i;

                System.out.println(di);
        }


}

