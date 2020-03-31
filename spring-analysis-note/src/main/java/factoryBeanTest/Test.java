package factoryBeanTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wangxi
 * @Time 2020/3/26 22:07
 * BeanFactory和FactoryBean的区别：
 *
 * 	BeanFactory和FactoryBean其实没有什么比较性的，只是两者的名称特别接近，所以有时候会拿出来比较一番，
 * 	BeanFactory是提供了OC容器最基本的形式，给具体的IOC容器的实现提供了规范，
 * 	FactoryBean可以说为IOC容器中Bean的实现提供了更加灵活的方式，
 * 	FactoryBean在IOC容器的基础上给Bean的实现加上了一个简单工厂模式和装饰模式，
 * 	我们可以在getObject()方法中灵活配置。
 *
 * 	当实现FactoryBean的类服务，被注入到其他类中时，就会调用到getObject()方法。
 *
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// 这个本质调的factoryBeanPojo的getObject()方法。和直接注入的调用结果相同
		Object school=  cpxa.getBean("factoryBeanPojo");
		// 这个获取Spring 的Bean实例
		FactoryBeanPojo factoryBeanPojo= (FactoryBeanPojo) cpxa.getBean("&factoryBeanPojo");
		System.out.println(school.getClass().getName());
		System.out.println(factoryBeanPojo.getClass().getName());

	}
}
