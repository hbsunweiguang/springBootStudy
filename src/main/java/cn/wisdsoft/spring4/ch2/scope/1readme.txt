该包下为Bean的Scope作用域内容
    Singleton：单例模式：一个Spring容器只会创建一个Bean实例
    Prototype：原型模式：每次调用都会新建一个Bean实例
    Request：Web项目中，给每个http request新建一个Bean实例
    Session：Web项目中，给每个http session新建一个Bean实例
    GlobalSession：只在portal应用中使用，给每一个global http session新建一个Bean实例

    另外，在Spring Batch 中还有一个Scope是使用@StepScope，在讲解批处理一节详细介绍。