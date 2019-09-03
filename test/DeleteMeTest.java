

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteMeTest {
    
    @Test(timeout=250)
    public void test() {
        DeleteMe dm = new DeleteMe();
        fail("This is a test that fails"); 
    }
}
