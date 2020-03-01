package circulate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wangxi
 * @Time 2020/3/1 14:32
 */
public class CirculateTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("circulate.xml");

		// 通过属性注入
//		CirculateBean01 bean01 = (CirculateBean01) applicationContext.getBean("circulateBean01");
//		CirculateBean02 bean02 = (CirculateBean02) applicationContext.getBean("circulateBean02");

		// 通过构造函数注入
		CirculateBean03 bean03 = (CirculateBean03) applicationContext.getBean("circulateBean03");
		CirculateBean04 bean04 = (CirculateBean04) applicationContext.getBean("circulateBean04");
	}
}
