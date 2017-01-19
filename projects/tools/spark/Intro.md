## Intro Spark:
---

Hadoop : Open source framework

- mrv1
	- hdfs and mr
- mrv2
	- yarn
	- own sorting

- hive and pig

- yarn (mrv2)
	- own applications 
	- uses hdfs 
- map reduce: map and reduce step
	- map (x -> y transformation)
	- sort (sorting)
	- reduce (group by)

	- Disadvantages: High IO due to intermediate data commited to hard disk 
---
Spark: A computational engine which is responsible for scheduling distributing monitoring applications or a computing cluster.

It hides the complexity of distributed systems, network communication, and fault tolerance

Advantages of Spark:

100X faster than hadoop mapreduce when data can be fitted to memory  
10x fast when writing to disk   
	- Inmemory computation and less IO to disk
	- Chain tasks and lazy evaluation at application level
	- DAG: Directed Acyclic Graph	  
		- creates tasks before starting the application  
		- complex dag unlike the map and reduce only case in mr  
	- Wide range of workloads other than mapreduce, which makes us help combine different process in production cluster. Reducing maintainance.

	- very modular and extendable code base, any improvment to spark core will improve other modules [[http://ampcamp.berkeley.edu/5/exercises/img/BDAS-log.png]]			
	- Kryo serialisation    
	- Tungesten in memory database
	- less maintainance and more functionality
	- tight integration
	- good community base

## Spark Components :

Spark Core
Spark SQL
SPark streaming
MLIB
GRAPHX
Cluster managers
	- yarn
	- mesos
	- Stand alone   

### Spark Core
Core functionality of spark, task scheduling, memory management, fault recovery, interacting with storage systems.

RDDs resilient distributed datasets, collection of items that can be manipulated in parallel.

### Spark SQL

SQL + programms

### SPark streaming

Processing live data 

### MLib

Machine Learning algorithms

### GraphX

Manipulating graphs
Common graph algorithms

### Hadoop yarn manager

### Storage systems

- file systems: hdfs, hbase, cassandra, tachyon
- text files, SequenceFiles, Avro, Parquet, 

---

# Understanding Spark

## SparkContext vs SparkSession

In earlier versions of spark, spark context was entry point for Spark. As RDD was main API, it was created and manipulated using context API’s. For every other API,we needed to use different contexts.For streaming, we needed StreamingContext, for SQL sqlContext and for hive HiveContext. But as DataSet and Dataframe API’s are becoming new standard API’s we need an entry point build for them. So in Spark 2.0, we have a new entry point for DataSet and Dataframe API’s called as Spark Session.

SparkSession is essentially combination of SQLContext, HiveContext and future StreamingContext. All the API’s available on those contexts are available on spark session also. Spark session internally has a spark context for actual computation.

``` scala

val conf = new SparkConf().setAppName(appName).setMaster(master)
val sc = new SparkContext(conf)


val sparkSession = SparkSession.builder.
      master("local")
      .appName("spark session example")
      .enableHiveSupport()
      .getOrCreate()

``` 

The above is similar to creating an SparkContext with local and creating an SQLContext wrapping it. If you need to create, hive context you can use below code to create spark session with hive support.


### Spark REPL:  

- Python  
- Scala 
- R 


Libraries  

- Spark sql - all 
- Streaming - !R
- MLIB	    - all
- GraphX    - scala only

Spark Driver Program: (Queen Bee)  

An distributed program will have a driver program to control the executions, driver allocates tasks(build here 2, build there, gather there) to worker nodes (Worker Bee).  

In Spark Application sparkContext object is the driver program, it communicates to the with cluster manager for distributing the tasks.  

Cluster Manager deployment modes:  

- Spark Master (Spark Only)
- Mesos master ()
- Yarn resource manager (addres of master url picks up from hadoop configuration)
	- client to hadoop yarn
	- as yarn application master process




---
Installation:

- python download (spark can use 2.7 and 3.5)
	- install libraries
	- for multiple python versions, set env variable setting for pyspark variable
	- $SPARK_HOME/bin/pyspark `set DEFAULT_PYTHON` 
- R installation (3.3.1)
- Java 1.8 jdk
	- home env to jdk directory
- Spark (2.0.1)
	- download the zip file from spark website
	- source code built needs r libraries to be compiled
- SBT download
- apache maven install
- IDE & Notebook
	- define env variables, (all caps)   
 `pyspark_driver_python=ipython    
  pyspark_driver_python_opts='notebook'`

- RSTUDIO
	
Testing setup :   

- Check versions after typing

`
$spark-shell  
$sparkR  
`

- Run inbuilt examples:







