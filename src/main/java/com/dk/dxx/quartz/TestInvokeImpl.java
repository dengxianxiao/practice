package com.dk.dxx.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestInvokeImpl {

	public void testInvoke() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(new Date());
		System.out.println("��ǰʱ���ǣ�" + now);
	}

	
}
