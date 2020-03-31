package factoryBeanTest;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author wangxi
 * @Time 2020/3/26 22:05
 */
@Data
public class FactoryBeanPojo implements FactoryBean {

	private boolean flag = true;

	@Override
	public Object getObject() throws Exception {
		if (flag) {
			return Integer.valueOf(100);
		}
		return "对bean的逻辑适配";
	}

	@Override
	public Class<?> getObjectType() {
		return String.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
