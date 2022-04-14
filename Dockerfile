#构建好的用于ocr识别的镜像

#使用dockerhub上的ocr环境镜像(国内较慢)
#FROM lengcz/tesseract-ocr-environment:1.0
#使用阿里云上的ocr容器镜像(国内快)
FROM registry.cn-guangzhou.aliyuncs.com/lengcz/tesseract-ocr-environment:1.0

EXPOSE 8080
ADD target/*.jar /app.jar
ENTRYPOINT ["java","-Dfile.encoding=utf-8","-jar", "app.jar"]
