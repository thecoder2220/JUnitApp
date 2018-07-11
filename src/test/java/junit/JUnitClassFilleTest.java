package junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JUnitClassFilleTest extends JUnitSuperclassTest {

    @BeforeClass
    public static void theBeforeFilleClass() throws Exception {
        System.out.println("Je suis la BeforeFilleClass - compteurBeforeFilleClass = " );
    }

    @AfterClass
    public static void theAfterFilleClass() throws Exception {
        System.out.println("Je suis la FilleAfterClass  - compteurFilleAfterClass = " );
    }

    @Test
    public void testA() {
        System.out.println("testA" );
    }
    @Test
    public void testB() {
        System.out.println("testB");
    }

    @Test
    public void testC() {
        System.out.println("testC");
    }

}
