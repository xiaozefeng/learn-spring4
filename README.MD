# Spring 框架本身四大原则
1. 使用POJO进行轻量级和最小侵入式开发
2. 通过依赖注入和基于接口编程实现轻松耦合
3. 通过AOP和默认习惯进行声明式编程
4. 使用AOP和模板减少模式化代码

# 注解
> 无论是xml 配置、注解配置还是Java配置，统称为配置元数据,所谓元数据就是描述数据的数据


# Java配置

```java
@org.springframework.context.annotation.Configuration 声明当前类是一个配置类，相当于一个Spring 配置的xml文件
@org.springframework.context.annotation.Bean 注解方法上，声明当前方法的返回值是一个Bean
@Inject 、@Resource 、 @Autowired 的是等效的，都是注入bean
```