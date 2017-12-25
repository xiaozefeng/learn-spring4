# Spring高级
> Spring 依赖注入的最大特点就是你所有的Bean对Spring容器的存在时无意识的
> 你可以将你的容器换成别的容器，这个时候bean之间的耦合很低

但是实际项目中必须要用到Spring容器本身的功能资源，这时你的Bean必须意识到Spring 容器的存在 
才能调用Spring所提供的资源，这时将会和Spring容器耦合

# @Conditional 注解
> 根据不同的条件创建不同的Bean

# Enable* 注解的工作原理
> 通过源码可以看出Enable*注解中有一个@Import注解，@Import注解使用来导入配置类的
> 这也意味着这些自动开启的实现其实是导入额一些自动配置的Bean

## 三种导入方式
1. 直接导入配置类 如: @EnableScheduled
2. 根据条件选择配置类 @EnableAsync
3. 动态注册Bean @EnableAspectJAutoProxy