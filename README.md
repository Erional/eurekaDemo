# eurekaDemo

一个eureka项目的demo：包括server，provider和consumer

## 使用方法

启动eurekaDemo文件夹下的三个项目
访问[http://127.0.0.1:8761/](http://127.0.0.1:8761/)可以看到注册的两个服务。


** eureka-provider **

写了一个简单的controller，访问eureka-provider的provider的接口会返回"provider123".


访问[http://127.0.0.1:8763/provider](http://127.0.0.1:8763/provider)

** eureka-consumer **

通过eureka注册，其他项目也可以访问provider的接口。

访问[http://127.0.0.1:8765/consumer](http://127.0.0.1:8765/consumer)也可以使用provider的方法。返回"provider123"。



<br/>

<br/>

### eurekaDemo by Qing
