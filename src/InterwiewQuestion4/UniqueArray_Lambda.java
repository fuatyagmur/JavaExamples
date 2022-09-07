package InterwiewQuestion4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UniqueArray_Lambda {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 64, 64, 23, 53, 23, 23, 23, 23, 0, -1, 3));
        tekrarsizList(sayi);


    }


    public static void tekrarsizList(List<Integer> sayi) {
        sayi.stream().distinct().sorted().forEach(UniqueArray_Lambda::yazdir);
       // sayi.stream().distinct().sorted(Comparator.reverseOrder()).forEach(UniqueArray_Lambda::yazdir);


    }

    public static void yazdir(int a) {// verilen int degeri aynı satırda bosluk bırakarak yazdırma action yapan seed(tohum) method create edildi
        System.out.print(a + " ");
    }

}