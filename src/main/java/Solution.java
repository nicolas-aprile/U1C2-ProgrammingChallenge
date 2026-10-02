public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        double x = (t1 + t2 + t3 + t4) / 4.0;
        return x;
    }

    public int roundAverage(double average) {
        int x;
        x = (int) (average + 0.5);
        return x;
    }

    public boolean isPassing(int roundedAverage) {
        boolean x;
        if (roundedAverage < 65){
            x = false;
        }else{
            x = true;
        }
        return x;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return ((double) shares * price);
    }


    public int roundValueChange(double totalStock) {
        int x;
        if (totalStock < 0){
            x = (int) (totalStock - 0.5);
        }else{
            x = (int) (totalStock + 0.5);
        }
        return x;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        userDouble = (int) (userDouble * 100);
        int x = (int) userDouble;
        if (userDouble % 10 != 9){
            x += 1;
        }else{
            x -= 9;
        }
        if (userDouble % 100 != 90){
            x += 10;
        }else{
            x -= 90;
        }
        if (userDouble % 1000 != 900){
            x += 100;
        }else{
            x -= 900;
        }
        if (userDouble % 10000 != 9000){
            x += 1000;
        }else{
            x -= 9000;
        }
        userDouble = (double) x / 100;
        return userDouble;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
