# EdwinYu
第一次开源一个电商项目，之前公司的是用spring+mybatis+ecache搭建的，现在由于微服务的流行，所以运用自己所学的知识重新构建了一个，进行开源。此项目仅仅是为了学习交流。
项目会不定时的对已经完成的功能及模块进行更新
e-paraent 此项目为父工程
e-pojo 为项目的javabean
e-common 项目的基础包
e-log 项目的日志服务
e-task 项目的任务服务
e-order-service  订单服务类
e-order-web 订单的web层
e-msg-service 项目的消息服务
e-mq-center  消费者服务
e-stocket-service 模拟的库存服务

项目整体采用springboot，zk,dubbo,mybatis,redis,activeMQ等技术来进行加工开发
其中涉及分布式的一些问题，很希望和大家一起研究讨论，我在项目中自己实现了一种利用mq实现了一种分布式事物解决方案，虽然不完美，之后慢慢进行完善

这个目前只是基础版本，个人能力和时间有限，还有很多的内容需要更新。希望大家有兴趣的一起讨论研究.
