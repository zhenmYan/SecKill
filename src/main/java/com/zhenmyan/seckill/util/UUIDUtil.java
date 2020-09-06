package com.zhenmyan.seckill.util;

import java.util.UUID;

//生成随机的UUID
public class UUIDUtil {
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
