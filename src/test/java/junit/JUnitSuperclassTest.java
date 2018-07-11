package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class JUnitSuperclassTest {

    private static int compteurBeforeClass = 0;
    private static int compteurAfterClass = 0;
    private static int compteurBefore = 0;
    private static int compteurAfter = 0;

    @BeforeClass
    public static void theBeforeClass() throws Exception {
        System.out.println("Je suis la beforeclass - compteurBeforeClass = " + ++compteurBeforeClass);
    }

    @AfterClass
    public static void theAfterClass() throws Exception {
        System.out.println("Je suis l afterclass - compteurAfterClass = " + ++compteurAfterClass);
    }

    @Before
    public void theBefore() throws Exception {
        System.out.println("Je suis la before - compteurBefore = " + ++compteurBefore);
    }

    @After
    public void theAfter() throws Exception {
        System.out.println("Je suis l after - compteurAfter = " + ++compteurAfter);
    }

}
