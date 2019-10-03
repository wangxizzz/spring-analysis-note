package circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wangxi
 * @Time 2019/10/3 19:40
 */
public class CircleBootstrap {
	public static void main(String[] args) {
		// 构造函数时的报错原因： Requested bean is currently in creation: Is there an unresolvable circular reference?
		ApplicationContext context = new ClassPathXmlApplicationContext("circle/circle.xml");
		CircleA circleA = (CircleA) context.getBean("circleA");
		circleA.a();
	}
}
