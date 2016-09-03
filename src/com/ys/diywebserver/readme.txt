我们想要自己的Webserver有以下几步
1.我们需要定义一个接口
2.实现刚才我们定义的接口并在这个实现类之上加上@WebServer的注解
3.在main方法中使用Endpoint.publish("http://127.0.0.1:12345/meserver", new DIYWebServer());加载这个server
4.在浏览器中输入http://127.0.0.1:12345/meserver?wsdl，其中"?wsdl"是必须的
5.在命令行中使用wsimport -p 生成包名 -s（编译class也含有java文件） http://127.0.0.1:12345/meserver?wsdl 就可以得到WSDL的包
6.将得到的包复制在需要使用Server的项目下，其中我们的处理服务的“类名+Service”的类中有一个方法是“get+DIYWebServer+port”的方法可以得到“DIYWebServer”类型,就可以调用里面的服务方法了。




什么是WebService：
WebService即web服务，因为互联网二产生，发布web服务后可以将资源共享，通过定义的webService调用资源信息
WebService是一种跨平台语言和跨平台操作的远程调用技术
采用了标准SOAP（Simple Object Access Protocol）协议传输，soap属于w3c标准，基于http传输xml 即soap=http+xml
采用wsdl作为描述语言说明，wsdl也属于w3c标准
xml和XSD（XML Schema DataTypes）是WebService跨平台的基础

WebService三要素：
SOAP：（Simple Object Access Protocol）简单对象访问协议 主要使用1.1和1.2
WSDL：基于xml的用于描述webService即函数、参数和返回值的说明。
UDDI：是一种目录服务，通过他，企业可注册和搜索Web Service从而达到共享和推广。但是知道了Web Service地址就可以进行调用。


WebService应用场景：
1.集成应用程序
2.软件重用
3.跨防火墙访问 （使用的都是http协议，能被访问的网站都是希望别人访问的，所以我们再把端口设置为80，那就和访问网站没有区别了）

以下情况不应用WebService
1.单个计算机之间的程序的通信。
2.同构程序间通信（同构指的是相同语言的程序之间的通信）java可以使用RMI技术了通信，比WebService简单

