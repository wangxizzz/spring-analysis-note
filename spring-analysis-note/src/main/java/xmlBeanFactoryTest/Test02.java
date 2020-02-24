package xmlBeanFactoryTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * <Description>
 *
 * @author wangxi
 */
public class Test02 {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));


		Object logInService = beanFactory.getBean("userService");

		System.out.println(logInService);
	}
}

