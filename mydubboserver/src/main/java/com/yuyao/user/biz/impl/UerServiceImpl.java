package com.yuyao.user.biz.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuyao.user.User;
import com.yuyao.user.biz.UserService;


@Service
public class UerServiceImpl  implements UserService{

	public Boolean login(User user) {
		Boolean flag = false;
		
		if ("admin".equals(user.getName()) && "123456".equals(user.getPassword()))
		flag = true;
		System.out.println("》》》》》》》》》》》》我是远程服务被调用了");
		return flag;
	}

}
