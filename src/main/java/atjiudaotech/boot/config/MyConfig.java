package atjiudaotech.boot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import atjiudaotech.boot.bean.Car;
import atjiudaotech.boot.bean.Pet;
import atjiudaotech.boot.bean.User;
import ch.qos.logback.core.db.DBHelper;

/**
 * proxyBeanMethods = true 默认是启用代理
 * 使用
 *
 *
 * 给容器中导入这俩个组件 @Import({User.class, DBHelper.class})
 *
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
@ImportResource("classpath:beans.xml")
//开启属性配置
//把这个Car组件自动注册到容器中
@EnableConfigurationProperties(Car.class)
public class MyConfig {

	@Bean//以方法名来作为组件id，返回类型就是组件类型，返回的值就是组件在容器中的实例
	public User user01() {
		User zhangsan = new User("zhangsan", 16);
		zhangsan.setPet(tomcatPet());
		return zhangsan;
	}

	//@Bean("tom")
	public Pet tomcatPet() {
		return new Pet("tomcat");
	}
}
