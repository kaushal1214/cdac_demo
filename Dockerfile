FROM openjdk
COPY src app
WORKDIR app
RUN mkdir -p bin
RUN javac -d bin ./cdacDemo/CdacDemo.java
WORKDIR bin
CMD ["java","cdacDemo.CdacDemo"]