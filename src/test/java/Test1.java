import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    @Test

    public void arr() {
        Integer[] arr = {1, -1, 2, 5, 10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));


        Assertions.assertEquals(18, Main.stream(list2));


    }

    @Test
    public void minus() {
        Integer[] arr = {-1, -1, -2, -5, -10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));


        Assertions.assertEquals(0, Main.stream(list2));


    }
}
