package Calculator.unitTest;


public class Calculator {

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
