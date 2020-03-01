package circulate;

/**
 * @Author wangxi
 * @Time 2020/3/1 14:32
 */
public class CirculateBean02 {

	private CirculateBean01 bean01;

	public CirculateBean01 getBean01() {
		return bean01;
	}
	// 通过属性注入依赖bean01
	public void setBean01(CirculateBean01 bean01) {
		this.bean01 = bean01;
	}

}
