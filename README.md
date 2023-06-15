# 接口飞鸟

## 项目介绍

接口飞鸟平台是一个API开放调用平台，该平台的目的是为开发者提供便捷、实用的API调用体验，提高开发者开发效率。
我们可以为用户提供各种类型的接口服务，使他们能够更高效地完成需求。
本项包括网站前台 + 管理员后台。
前端使用Ant Design Pro 框架+ Ant Design组件库，使用现成组件库快速开发项目。
后端采用SpringBoot + 微服务架构开发，解耦业务模块。

## 项目意义

本项目的意义是开发一些常用的接口方便供开发者调用（例如进制转换，邮箱正则表达式），
这些功能的实现本身体可能难度不大，但是用到时又要花费不少时间去查找，本项目可以节省开发者这部分时间。
目前大多API网站存在的问题包括：
1. 接入安全问题
2. 接口质量差、调用性能不佳
3. 收费贵，需要额外操作（关注公众号）

本项目采用accesskey/secretkey来保证安全性。在平台在注册后，只需找到需要的接口，
使用我们提供的SDK配置密钥后就可以方便地调用内部接口服务。
采用Spring Gateway座位网关。实现统一鉴权，黑白名单，路由转发等功能。
采用Dubbo实现内部服务之间的调用，nacos作为注册中心，保证安全和调用性能。
项目开发了管理员界面，管理员可以方便上线、下线接口，修改接口信息，测试接口性能，保证接口的质量。
项目中包括了一个接口调用次数top3统计页面，方便及时根据不同接口的情况调配资源。

## 技术栈

### 前端技术栈

- 开发框架：React、Umi
- 脚手架：Ant Design Pro
- 组件库：Ant Design、Ant Design Components
- 语法扩展：TypeScript、Less
- 打包工具：Webpack
- 代码规范：ESLint、StyleLint、Prettier

### 后端技术栈

* 主语言：Java
* 框架：SpringBoot 2.7.0、Mybatis-plus、Spring Cloud
* 数据库：Mysql8.0、Redis
* 注册中心：Nacos
* 服务调用：Dubbo
* 网关：Spring Cloud  Gateway
* 负载均衡：Spring cloud Loadbalancer



## 项目模块介绍
项目包括五个阔快
* yuapi-backend: 后端代码，基础增删改查。用户登录注册，接口发布下线，接口调用次数统计，用户鉴权。
* yuapi-client-sdk: 提供给开发者的开箱即用的spring-boot-starter，封装了一个简单的http请求。
* yuapi-common: 定义公共方法，实体类，远程调用接口。可以减少代码重复编写。
* yuapi-gateway: 网关处理，包括鉴权，统一业务处理，路由转发等功能。
* yuapi-interface: 模拟接口，进行模拟调用。



| 服务              | 端口      | 说明      |  
|-----------------|---------|---------|
| yuapi-backend   | 7529    | 后端      |
| yuapi-client-sdk | 部署maven | starter |
| yuapi-common    | 部署maven | 公共服务    |
| yuapi-gateway   | 8090    | 网关      |
| yuapi-interface | 8123    | 第三方接口   |
| nacos           | 8848    | nacos   |



## 系统架构

![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605210325.png)

## 项目展示

* 登陆/注册
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230606103401.png)
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230606103406.png)

* 主页
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194007.png)

* 接口详情/调用接口/调用次数限制
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605204721.png)

* 开发者接入（导入依赖，配置密钥）
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605204441.png)

* 查看个人密钥/更改密钥
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194025.png)
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194102.png)

* 接口商店/购买接口
  ![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194115.png)
* 接口管理页（发布/修改/上线/下线接口）

![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194209.png)
![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194233.png)

* 接口调用次数统计分析

![](https://raw.githubusercontent.com/jackyrwj/picb/master/20230605194247.png)


## Quick Start

1. 配置Nacos注册中心

2. 修改各模块配置中的端口、密码

2. 启动Nacos、Mysql以及各项服务
服务启动顺序参考：
   1. yuapi-backend
   2. yuapi-interface
   3. yuapi-gateway

## Todo
* 实现单点登录，分布式session
* 对统计出来top3调用次数的接口做redis缓存，提高查询性能。
* 接入真实接口（天气查询API、微博热榜API）





## 同类型产品
[夏柔API](https://api.aa1.cn/)\
[搏天API](https://api.btstu.cn/)\
[阿里云openapi](https://next.api.aliyun.com/home?spm=a2c6h.12908639.J_1395090.1.1f496886GWW6iC)
