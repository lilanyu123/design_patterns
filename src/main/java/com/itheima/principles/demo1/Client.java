package com.itheima.principles.demo1;

/**
 * @Author: 李兰玉
 * @Date: 2023/6/25 15:20
 * @Email: lilanyu2022@163.com
 * @Description:
 */
public class Client {
	public static void main(String[] args) {
		// 创建搜狗输入法对象
		SougouInput input = new SougouInput();
		// 创建皮肤对象
		DefaultSkin skin = new DefaultSkin();
		// 将皮肤设置到输入法中
		input.setSkin(skin);
		// 显示皮肤
		input.display();
	}
}
