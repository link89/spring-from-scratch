1. run mybatis-generator-maven-plugin

    mvn \
        -Dmybatis.generator.jdbcURL=jdbc:mysql://127.0.0.1:3306/db \
        -Dmybatis.generator.jdbcUserId=username \
        -Dmybatis.generator.jdbcPassword=password \
        mybatis-generator:generate

2. package and run
    mvn clean package
    java -Dserver.port=9000 -jar target/bsi-notify-service-{version}.jar
