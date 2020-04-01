package aop;

/**
 * @Author wangxi
 * @Time 2020/3/31 10:16
 */
public class DaoImpl implements Dao{
	@Override
	public void select() {
		System.out.println("Enter DaoImpl.select()");
	}
}
