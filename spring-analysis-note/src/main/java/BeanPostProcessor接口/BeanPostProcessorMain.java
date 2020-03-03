package BeanPostProcessor接口;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author wangxi
 * @Time 2020/3/3 13:58
 */
public class BeanPostProcessorMain {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		BeanPostProcessorTest beanPostProcessorTest = new BeanPostProcessorTest();
		factory.addBeanPostProcessor(beanPostProcessorTest);

		BeanPostProcessorTest test = (BeanPostProcessorTest) factory.getBean("beanPostProcessorTest");

		test.display();
	}
}
