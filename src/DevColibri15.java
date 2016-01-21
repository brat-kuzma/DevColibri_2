
public class DevColibri15 {

        public static void main (String[] args){
            int val = calcSum(1, -1);
            System.out.println(val);
        }

        static int calcSum(int a, int b){
            int sum = a+b;
            //System.out.println(sum);
            if(sum==0){ // рекурси€, внутри метода вызываетс€ этот же метод
                sum = calcSum(1,1);            }

            return sum;
        }

    }