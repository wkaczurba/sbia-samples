package readinglist;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import readinglist.ReadingListApplication;

@RunWith(SpringRunner.class) //@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={ReadingListApplication.class}) //@SpringApplicationConfiguration(classes = ReadingListApplication.class)
//@WebAppConfiguration
public class ReadingListApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}

}
