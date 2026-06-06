// import java.sql.Array;
import java.util.Arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        int missing;

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                missing=i;
                System.out.println(missing+" ");
            }
        }
    }
}
