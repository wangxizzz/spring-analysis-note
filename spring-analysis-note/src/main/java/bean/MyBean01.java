package bean;


import lombok.Data;

/**
 * <Description>
 *
 * @author wangxi
 */
@Data
public class MyBean01 {
	private Bean02 bean02;
	private Bean03 bean03;
	public void sayHello() {
		System.out.println("Bean01");
	}
}

