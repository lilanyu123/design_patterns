package com.itheima.principles.demo1;

/**
 * @Author: 李兰玉
 * @Date: 2023/6/25 15:18
 * @Email: lilanyu2022@163.com
 * @Description:
 */
public class SougouInput {
	private AbstractSkin skin;

	public void setSkin(AbstractSkin skin) {
		this.skin = skin;
	}

	public void display() {
		skin.disPlay();
	}
}
