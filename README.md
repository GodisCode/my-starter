#### 项目说明
自定义starter的简单例子。

#### 模块说明
- hello-spring-boot-autoconfiguration：自动配置模块。自动配置的相关类在此模块编写。
- hello-spring-boot-starter：starter模块。只有一个pom文件，主要功能是进行依赖管理。
依赖自动配置模块，有额外的依赖也是在此模块进行管理。如果仅仅只是包装自动配置模块的话，二者
也可以合二为一，只写starter模块。
- hello-starter-test：测试模块。引入starter模块进行测试。