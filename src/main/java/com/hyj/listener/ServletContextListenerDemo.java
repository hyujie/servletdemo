package com.hyj.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 16:12 2019/3/21
 */
public class ServletContextListenerDemo implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context销毁");
    }

    public static void main(String[] args) {

    }
}
