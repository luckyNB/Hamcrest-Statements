import com.harmcrest.TODO;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HarmcrestTest {

    @Test
    public void coreMachersTest() {
        Assert.assertThat(Long.valueOf(1), CoreMatchers.instanceOf(Long.class));
        Assert.assertThat(Long.valueOf(1), CoreMatchers.isA(Long.class));
    }

    @Test
    public void listMachersTest() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        MatcherAssert.assertThat(list, Matchers.hasSize(3));
        MatcherAssert.assertThat(list, Matchers.contains(5, 2, 4));
        MatcherAssert.assertThat(list, Matchers.containsInAnyOrder(2, 4, 5));
        MatcherAssert.assertThat(list, Matchers.everyItem(Matchers.greaterThan(1)));
    }

    @Test
    public void anyMatchersTest() {

        Integer[] ints = new Integer[]{7, 5, 12, 16};
        MatcherAssert.assertThat(ints, Matchers.arrayWithSize(4));
        MatcherAssert.assertThat(ints, Matchers.arrayContaining(7, 5, 12, 16));

    }

    @Test
    public void objectMatchersTest() {
        TODO todo = new TODO(1, "Learn Hamcrest", "Important");
        TODO todo2 = new TODO(1, "Learn Hamcrest", "Important");
        MatcherAssert.assertThat(todo, Matchers.hasProperty("summary"));
        MatcherAssert.assertThat(todo, Matchers.hasProperty("summary", Matchers.equalTo("Learn Hamcrest")));
        MatcherAssert.assertThat(todo, Matchers.samePropertyValuesAs(todo2));
    }
}
