# Docker image for springboot file run
# VERSION 0.0.1
# 作者
# Author: yanxu
# 基础镜像使用java
FROM java:8
MAINTAINER yanxu <919939799@qq.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为app.jar
ADD ./xxl-job-admin-1.0.0.jar app.jar
# 运行jar包
# RUN bash -c 'touch /app.jar'
# EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]