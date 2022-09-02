#Kafka Demo application for producing and consuming topics

- First download kafka: https://kafka.apache.org/downloads

Starting Apache kafka locally:
------------------------------------
1. Untar the download
    
    #tar -xvf <kafka.tar>
2. Build the project
    
    #./gradlew jar -PscalaVersion=<version-details>
2. Start zoopkeeper
    
    # bin/zookeeper config/zookeeper.properties
3. Start broker
    Here I am creating 2 brokers (I have copied server.properties to 1 & 2)
    
    #bin/kafka-server-start.sh config/server1.properties
    #bin/kafka-server-start.sh config/server2.properties
4. Creating topics
    
    #bin/kafka-topics.sh --create --bootstrap-server localhost:9093 --partitions=2 --replication-factor 2 --toipc <topic-name>
5. Start spring boot application
   
    #mvn clean install -Ppersonal-repo -s <path to your settings.xml>

