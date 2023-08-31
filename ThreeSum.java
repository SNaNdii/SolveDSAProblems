import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {4,3,6,1};
        int n = arr.length;
        int t = 10;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0,j=i+1; i<n&&j<n; i++,j++){
                if(map.containsKey(t-arr[i]-arr[j])){
                    System.out.println(arr[i]+" "+arr[j]+" "+(t-arr[i]-arr[j]));
                    return;
                }
            map.put(arr[i], i);
        }
        System.out.println("No such values...");
        
    }
}
