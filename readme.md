# 设计模式学习
极客时间-设计模式之美
## 软件设计原则 (SOLID)

- 开闭原则（Open Closed Principle，OCP）
- 单一职责原则（Single Responsibility Principle, SRP）
- 里氏代换原则（Liskov Substitution Principle，LSP）
- 依赖倒转原则（Dependency Inversion Principle，DIP）
- 接口隔离原则（Interface Segregation Principle，ISP）
- 合成/聚合复用原则（Composite/Aggregate Reuse Principle，CARP）
- 最少知识原则（Least Knowledge Principle，LKP）或者迪米特法则（Law of Demeter，LOD）
- DRY原则（dont do it repeat）
- KISS原则(Keep It Simple,Stupid)
- YAGNI原则
- LOD法则

## 设计模式
23种设计模式，分为创建型，结构型，行为型
### 1.创建型
- 常用的有：单例模式，工厂模式，建造者模式
- 不常用的有：原型模式
### 2.结构型
- 常用的有：代理模式，桥接模式，装饰者模式，适配器模式
- 不常用的有：门面模式，组合模式，享元模式
### 3.行为型
- 常用的有：观察者模式，模版模式，策略模式，职责链模式，迭代器模式，状态模式
- 不常用的有：访问者模式，备忘录模式，命令模式，解释器模式，中介模式

![avatar](https://static001.geekbang.org/resource/image/f3/d3/f3262ef8152517d3b11bfc3f2d2b12d3.png)

## 单例模式

实现关注点：

- 构造函数需要是 private，这样才能避免外部通过 new 创建实例
- 考虑创建时的线程安全问题
- 考虑是否支持延迟加载
- 考虑该getInstance 性能是否高

实现方式：
- 饿汉式 ： 在类加载时，实例已经创建好了，所以是线程安全的，缺点是不支持延迟加载。
- 懒汉式 ：懒汉式相对于饿汉式的优势是支持延迟加载，缺点是在每次获取实例的时候都会获取锁，并法度很低
- 双重检测 ：此方式支持延迟加载，只要instance被创建之后都会不再进入加锁逻辑。并法度很高。
- 内部类 ：这种方式是在调用时才会加载 SingletonHolder 类，实例的唯一性，创建安全性都有JVM来保证。
- 枚举 : 最简单的实现

如何破坏单例模式：

- 通过反射破坏单例，获取构造方法，设置权限，再实例化一个实例。防止被破坏的话就是在构造方法中加一个判断。
- 通过序列化反序列化来破坏单例，因为反序列化过程中，在反序列化执行过程中会执行到ObjectInputStream#readOrdinaryObject方法，
这个方法会判断对象是否包含readResolve方法，如果包含的话会直接调用这个方法获得对象实例。
反序列化也是调用构造函数来创建对象，但是反序列化和序列化调用的不是同一个，防止被破坏的方法就是重写readResolve方法

- 工厂模式


