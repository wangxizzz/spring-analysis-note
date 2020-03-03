package BeanPostProcessor接口;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author wangxi
 * @Time 2020/3/3 13:57
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean [" + beanName + "] 开始初始化");
		// 这里一定要返回 bean，不能返回 null,返回null就会跳过其他的BeanPostProcessor.
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean [" + beanName + "] 完成初始化");
		return bean;
	}

	public void display(){
		System.out.println("hello BeanPostProcessor!!!");
	}
}
