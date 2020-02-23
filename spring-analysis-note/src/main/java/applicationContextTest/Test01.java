package applicationContextTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <Description>
 *
 * @author wangxi
 */
public class Test01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
}

