package InterwiewQuestion4;

import java.util.ArrayList;
import java.util.List;

public class deneme3 {
    public static void main(String[] args) {

        int arr[]= {1,23,34,45,23,3,2,1,1,1,23,5,};
        List<Integer> tekrarsizlist= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!tekrarsizlist.contains(arr[i])){
                tekrarsizlist.add(arr[i]);
            }

        }
        System.out.println(tekrarsizlist);

    }
}
