package demo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
@SpringBootTest(classes=Application.class)
//@SpringBootTest
//@WebAppConfiguration
public class ApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}

}
