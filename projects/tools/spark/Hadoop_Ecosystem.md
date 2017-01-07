# Hadoop Ecosystem


# Distribute parallel computing

Storage using HDFS in a firewalled system, edge nodes are the master nodes , like name node and secondary namenode (Spark Master in case of stand alone spark)  

- Yarn cluster:  



	- What are the edge nodes used for ?  

	- These edge nodes will also run the applications like hue,hive,flume, kafka, sqoop, titan, hbase, mysql etc  

	- What are the data nodes used for ?  

- Spark Architecture:

Local
Stand alone
Yarn
Mesos

	- What is the difference between yarn and mesos ?  
 

	- Advantages of mesos ?  

	- Advantages of docker and mesos vs yarn cluster ?  

	- Advantages of being on aws cloud ? (Todo: compare EC2 vs 16core 64 gb server 48 gb memory)  
		- cost of server per hour micro,small/2,medium/2 large/2 =0.14 (911$/server) july 2015  
		- cost of bandwidth of internet: 100gb - 11$  
		- cost of inhouse : servers : 33k + 3k hadoop /node/year including cloudera costs (https://blogs.oracle.com/datawarehousing/entry/updated_price_comparison_for_big)  
		- cost of inhouse : electricity: 731$ (us 2013) http://www.eia.gov/  
		- cost of downtime: (small: 4k/hour large: 70k/hour)(2011)http://betanews.com/2013/11/04/comparing-cloud-vs-on-premise-six-hidden-costs-people-always-forget-about/  
		- total of ownership: cooling, farm rent, people cost etc.,  
		- security, bandwidth, retraining of staff etc should also be taken care of   

## CDH virtual box  

## Hadoop Admin 101  
CDH installation : 
spark tuning : http://spark.apache.org/docs/1.3.1/tuning.html  

## Installation 101  

## Linux admin 101  
