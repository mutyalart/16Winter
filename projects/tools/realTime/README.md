# Realtime Tools 

- Kafka
- flume 
- Storm


##  Kafka: Installation on Ubuntu

https://www.safaribooksonline.com/library/view/kafka-the-definitive/9781491936153/ch02.html

### Step 1 install Zookeeper:
tar -zxf zookeeper-3.4.6.tar.gz
mv zookeeper-3.4.6 /usr/local/zookeeper
mkdir -p /var/lib/zookeeper
cat > /usr/local/zookeeper/conf/zoo.cfg << EOF
- tickTime=2000
- dataDir=/var/lib/zookeeper
- clientPort=2181
- EOF

(for extending to ensemble add below lines to above config file after installation: 
initLimit=20
syncLimit=5
server.1=zoo1.example.com:2888:3888
server.2=zoo2.example.com:2888:3888
server.3=zoo3.example.com:2888:3888)

export JAVA_HOME=/usr/java/jdk1.8.0_51
/usr/local/zookeeper/bin/zkServer.sh start


### Step 2 install Kafka broker

tar -zxf kafka_2.11-0.9.0.1.tgz
mv kafka_2.11-0.9.0.1 /usr/local/kafka
mkdir /tmp/kafka-logs# export 
JAVA_HOME=/usr/java/jdk1.8.0_51
/usr/local/kafka/bin/kafka-server-start.sh -daemon/usr/local/kafka/config/server.properties

/usr/local/kafka/bin/kafka-topics.sh --create --zookeeper localhost:2181--replication-factor 1 --partitions 1 --topic test


