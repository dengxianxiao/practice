package com.dk.dxx;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基础测试类，用于继承
 * 
 * @author dxx
 *
 */

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器spring-test，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)

//告诉junit  spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {

}
