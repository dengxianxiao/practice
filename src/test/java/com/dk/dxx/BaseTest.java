package com.dk.dxx;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ���Ի����࣬���в����඼Ҫ�̳�
 * @author dxx
 *
 */

// ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
@RunWith(SpringJUnit4ClassRunner.class)

//����junit spring�����ļ�
@ContextConfiguration({"classpath:spring-context.xml"})

public class BaseTest {
	
}