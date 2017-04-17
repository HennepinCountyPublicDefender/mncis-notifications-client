package us.hennepin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import us.mn.state.courts.courtxml._3.AttorneyRemovedReasonType;

public class AttorneyRemovedReasonTypeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
        AttorneyRemovedReasonType removedReasonText = AttorneyRemovedReasonType.class.getEnumConstants()[0];
        assertNotNull(removedReasonText);
	}

}
