package client;

import bean.MyBean01;
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
		MyBean01 bean01 = (MyBean01) beanFactory.getBean("mybean01");
		bean01.sayHello();
	}
}

