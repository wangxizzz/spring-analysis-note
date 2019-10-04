package circle;

/**
 * @Author wangxi
 * @Time 2019/10/3 19:40
 */
public class CircleA {
	private CircleB circleB;

	// 测试构造方法循环依赖
	public CircleA(CircleB circleB) {
		this.circleB = circleB;
	}
	/**
	 * 设定一个函数，调用 B 类的方法
	 */
	public void a() {
		System.out.println("A");
		circleB.b();
	}

	public CircleB getCircleB() {
		return circleB;
	}

	public void setCircleB(CircleB circleB) {
		this.circleB = circleB;
	}
}
