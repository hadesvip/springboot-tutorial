## springboot启动原理
1. jdwp(java 调试协议)调试
    ```
    java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5555 -jar springboot-tutorial-0.0.1-SNAPSHOT.jar
    ```