package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(App.take(numbers1, 2)); // => [1, 2]
        assertThat(numbers1.get(0)).isEqualTo(1);
        assertThat(numbers1.get(1)).isEqualTo(2);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        System.out.println(App.take(numbers2, 8)); // => [7, 3, 10]
        assertThat(numbers2.get(0)).isEqualTo(7);
        assertThat(numbers2.get(1)).isEqualTo(3);
        assertThat(numbers2.get(2)).isEqualTo(10);
    }
}
