##spring
###ICO（主要就是用setter注入值）
@Component：代替<bean .../>
@Value：代替<property .../>
    （当setter基本数据类型、字符串）
@Scope("prototype/默认singleton")：代替bean的scope属性

@Autowired：自动装配：byType
    @Qualified：配合@Autowired用的：byName
@Resource：自动装配：byName
    所以：代替手动装配<property .../>
    （当setter引用对象）

@Component、@Repository、@Controller、@Service
    ：功能一样，都是组件的意思，使交由spring管理，实现自动装配
###AOP
静态代理：代理的是一个类
动态代理：代理的是一个接口，可以代理实现它的多个类

##springMVC
    url：http://localhost:8080/website/controller
        拆分成三部分：域名（端口）/项目名/映射到控制器方法的名字
用户请求 ->映射到controller方法 ->做业务、返回数据/返回视图名字 ->返回完整视图
前后端分离：
    后端部署后端：提供接口、提供数据（所以返回json数据，不返回页面）
        json：一种数据交换格式
    前端独立部署：负责渲染后端的数据（所以只接收json数据就好了）
    （用@RestController、@ResponseBody不走视图解析器，请求响应返回的是字符串（json格式对象数据））

##springboot原理：自动装配
resources:
    public:一般放些公共资源，比如js
    resources:一般放些upload上传的文件
    static:一般放些静态资源，比如图片
    thymeleaf:一般放些html
        只有通过controller才可以访问到（使用thymeleaf要导入依赖）
thymeleaf：
    "th:" 使html元素交由thymeleaf接管
    所有页面的静态资源要给thymeleaf接管，用 @{url}
国际化：
分布式：Dubbo（RPC）+zookeeper
swagger：接口文档
任务调度
spring security（AOP思想）（shiro也可以）

##springcloud
Restful接口
Eureka注册中心
Ribbon。。。