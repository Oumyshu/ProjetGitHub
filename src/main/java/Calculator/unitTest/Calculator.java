package Calculator.unitTest;


public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int Min(int a, int b) {
        if(a<b)
            return a;
        else
            return b;
    }
    public int Minimum(int a, int b) {
        return Math.min(a,b);
    }
    public int Maximum(int a, int b) {
        return Math.max(a,b);
    }
    public int Max(int a, int b) {
        if(a<b)
            return b;
        else
            return a;
    }
    public int minElement(int[] list) {
        int min = list[0];
        int i;
        for ( i = 0; i < list.length; i++){
            if (list[i] < min){
                min = list[i];
            }
        }
        return min;
    }



    public int MaxElement( int [] list){
        int max = list[0];
        int i;
        for ( i = 0; i < list.length; i++){
            if (list[i] > max){
                max = list[i];
            }
        }
        return max;
    }

}
