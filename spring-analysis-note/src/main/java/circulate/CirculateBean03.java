package circulate;

/**
 * @Author wangxi
 * @Time 2020/3/1 15:06
 */
public class CirculateBean03 {
	private CirculateBean04 bean04;

	// 通过构造函数注入
	public CirculateBean03(CirculateBean04 bean04) {
		this.bean04 = bean04;
	}
}
