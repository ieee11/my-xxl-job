package com.yx.xxljob.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MyXxlJobAdminApplication
 * @Description http://localhost:8081/xxl-job-admin
 * 用户名：admin
 * 密码：123456
 * @Author Yanxu
 * @Date 2021/1/7 14:24
 * @Version 1.0
 **/
@Slf4j
@SpringBootApplication
public class MyXxlJobAdminApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyXxlJobAdminApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("服务启动成功！");
    }

}