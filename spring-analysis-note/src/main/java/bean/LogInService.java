package bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author wangxi
 * @Time 2020/2/23 16:37
 */
@Component("logInService")
public class LogInService {
	@Resource
	private UserService userService;
}
