#构建好的用于ocr识别的镜像
FROM lengcz/tesseract-ocr-environment:1.4
EXPOSE 8080
ADD target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]spring