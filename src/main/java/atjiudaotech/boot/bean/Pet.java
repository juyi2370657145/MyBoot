package atjiudaotech.boot.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @see AllArgsConstructor 创建全field构造器
 * @see NoArgsConstructor 创建空构造器
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

