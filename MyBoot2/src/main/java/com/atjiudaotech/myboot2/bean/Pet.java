package com.atjiudaotech.myboot2.bean;

import lombok.Data;

/**
 * @see org.springframework.boot.context.properties.ConfigurationProperties 还要@Compent注解绑定前缀获取配置文件中的配置
 */

@Data
public class Pet {
	private String name;
	private double weight;
}
