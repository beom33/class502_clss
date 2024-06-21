import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] num = {21,22,30,11,99,31};
        for(int i =0; i<num.length /2; i++){
            int index = num.length -i -1;

            int n = num[i];
            num[i] = num[index];
            num[index] = n;

        }
        System.out.println(Arrays.toString(num));


    }

}
