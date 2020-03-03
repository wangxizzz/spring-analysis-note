package applicationContextTest;

import aware接口实现.MyApplicationAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <Description>
 *
 * @author wangxi
 */
public class Test01 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		MyApplicationAware myApplicationAware = (MyApplicationAware) applicationContext.getBean("myApplicationAware");
		myApplicationAware.display();
	}
}

