# eurekaDemo

一个eureka项目的demo：包括server，provider和consumer

## 使用方法

启动eurekaDemo文件夹下的三个项目
访问[http://127.0.0.1:8761/](http://127.0.0.1:8761/)可以看到注册的两个服务。

![截图](attachment:270055e3b99bbf17fd78549e068f4d1c)

** eureka-provider 

写了一个简单的controller，访问eureka-provider的provider的接口会返回"provider123".

![截图](attachment:33c2887a778447c7bb9bb8914a8565d1)

访问[http://127.0.0.1:8763/provider](http://127.0.0.1:8763/provider)
![截图](attachment:a75c48221d1f6f56fc18bbdb70c8ff7d)

** eureka-consumer

通过eureka注册，其他项目也可以访问provider的接口。
![截图](attachment:aa2a21d13b870f574cc695d8d54673d4)

访问[http://127.0.0.1:8765/consumer](http://127.0.0.1:8765/consumer)也可以使用provider的方法。返回"provider123"。

![截图](attachment:215b9dd373c9edd9cc6cb6ec8aa4d0e9)

<br/>

<br/>

### eurekaDemo by Qing