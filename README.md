# Spring Cloud 微服务集成
1. Spring Config (config-server)<br/>
用于同步git远程仓库的配置文件，需要配合rabbitmq消息中间件使用，默认端口：8888。
2. Eureka Server (eureka-server)<br/>
一个需要用户注册的服务注册中心，默认用户名fiveplus，默认密码zsw123，默认端口：8761。
3. Zuul Server (zuul-server)<br/>
网关出口，所有的子服务出口，默认端口：8769。
4. User Service (user-service)<br/>
一个包含了mybatis和通用mapper的Sprint-Boot套装，内置了druidSQL分析服务，默认端口：9000。
