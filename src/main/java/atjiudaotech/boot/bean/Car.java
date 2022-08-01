package atjiudaotech.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

/**
 * 只有在容器中的组件，才能拥有springBoot提供的功能
 * Data 自动生成field对应get/set方法，重写equals/hashCode,添加canEquals方法，重写toString方法
 * ToString 自动生成toString方法
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
	private String brand;

	private Integer price;
}
