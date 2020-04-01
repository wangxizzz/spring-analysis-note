package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wangxi
 * @Time 2020/3/31 10:18
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");

		Dao dao = (Dao)ac.getBean("daoImpl");
		dao.select();
	}
}
