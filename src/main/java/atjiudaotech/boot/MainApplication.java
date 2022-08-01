package atjiudaotech.boot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.ConfigurableApplicationContext;

import atjiudaotech.boot.bean.Pet;
import atjiudaotech.boot.bean.User;
import atjiudaotech.boot.config.MyConfig;
import ch.qos.logback.core.db.DBHelper;

/**
 * 注解标注这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		//ioc容器
		ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

		//查看容器里面的组件
		/*String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for (String name :
				beanDefinitionNames) {
			System.out.println(name);
		}*/

/*		Pet tom1 = run.getBean("tom", Pet.class);
		Pet tom2 = run.getBean("tom", Pet.class);
		System.out.println("单例：" + (tom1 == tom2));

		//如果proxyBeanMethods = true 使用代理对象来调用方法，反之，调用方法会获取新对象。
		MyConfig bean = run.getBean(MyConfig.class);
		System.out.println(bean);

		User user01 = bean.user01();
		User user02 = bean.user01();
		System.out.println("myconfig(user):" + (user01 == user02));


		//获取组件
		String[] beanNamesForType = run.getBeanNamesForType(User.class);
		System.out.println(Arrays.toString(beanNamesForType));
		DBHelper bean1 = run.getBean(DBHelper.class);
		System.out.println(bean1);*/

/*		User user01 = run.getBean("user01", User.class);
		System.out.println(user01);

		System.out.println(run.containsBean("haha"));
		System.out.println(run.containsBean("hehe"));*/

		String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
		System.out.println(Arrays.toString(beanNamesForType));

	}
}
