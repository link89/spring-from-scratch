import com.github.link89.Application;
import com.github.link89.domain.SimpleObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ConfigurableTest {

    @Test
    public void wiredTest() {
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.autowiredAssert();
    }
}
