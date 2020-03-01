package circulate;

/**
 * @Author wangxi
 * @Time 2020/3/1 14:32
 */
public class CirculateBean01 {
	private CirculateBean02 bean02;

	// 通过属性注入依赖bean02
	public CirculateBean02 getBean02() {
		return bean02;
	}

	public void setBean02(CirculateBean02 bean02) {
		this.bean02 = bean02;
	}
}
