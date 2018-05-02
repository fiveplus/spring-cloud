# Spring Cloud 微服务集成
## Spring Config (config-server)
> 用于同步git远程仓库的配置文件，需要配合rabbitmq消息中间件使用，默认端口：8888。

下面是关于配置文件的介绍：
```properties
# 远程仓库地址
spring.cloud.config.server.git.uri=https://gitee.com/fiveplus/biohub-config/
# 查找仓库目录
spring.cloud.config.server.git.search-paths=respo
# 分支
spring.cloud.config.label=master
# 账号
spring.cloud.config.server.git.username=<your username>
# 密码
spring.cloud.config.server.git.password=<your password>
```

远程仓库配置文件命名方式： `{application-name}-{profile}.properties`

service-zuul-dev.properties
```properties
zuul.routes.user.path=/user-service/**
zuul.routes.user.service-id=user-service
```
## Eureka Server (eureka-server)

> 一个需要用户注册的服务注册中心，默认用户名fiveplus，默认密码zsw123，默认端口：8761。

## Zuul Server (zuul-server)

> 网关出口，所有的子服务出口，默认端口：8769。

bootstrap.properties文件中指定Config Server地址：
```properties
# 项目名称
spring.application.name=service-zuul
# 对应分支
spring.cloud.config.label=master
# 对应远程仓库profile
spring.cloud.config.profile=dev
# 本地Config Server地址
spring.cloud.config.uri= http://localhost:8888/
```

## User Service (user-service)

> 一个包含了mybatis和通用mapper的Sprint-Boot套装，内置了druidSQL分析服务，默认端口：9000，druid的默认账号为admin,默认密码为admin。

