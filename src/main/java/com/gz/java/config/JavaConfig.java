package com.gz.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  使用Java 注解来配置bean的依赖关系
 * @author xiaozefeng
 */
@Configuration
public class JavaConfig {


    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public UseUserService useUserService(){
        UseUserService useUserService = new UseUserService();
        useUserService.setUserService(userService());
        return useUserService;
    }

    /**
     * 作用和上面的一样的，只是不能单独的在其他bean中注入 UserService
     */
    //@Bean
    //public  UseUserService useUserService(){
    //    UseUserService useUserService = new UseUserService();
    //    useUserService.setUserService(new UserService());
    //    return useUserService;
    //}

}
