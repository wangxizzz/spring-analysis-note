package circle;

/**
 * @Author wangxi
 * @Time 2019/10/3 19:40
 */
public class CircleB {
	private CircleA circleA;

	// 测试构造方法循环依赖
//	public CircleB(CircleA circleA) {
//		this.circleA = circleA;
//	}

	/**
	 * 设定一个方法，调用 A 类的方法，这两个方法互相调用
	 */
	public void b() {
		System.out.println("B");
		circleA.a();
	}

	public CircleA getCircleA() {
		return circleA;
	}

	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
}
