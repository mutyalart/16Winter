## Intro Spark:


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

Spark:

Advantages of Spark:

100X faster than hadoop mapreduce when data can be fitted to memory  
10x fast when writing to disk   
	- Inmemory computation and less IO to disk
	- Chain tasks and lazy evaluation at application level
	- DAG: Directed Acyclic Graph	  
		- creates tasks before starting the application  
		- complex dag unlike the map and reduce only case in mr  
		
Kryo serialisation    
Tungesten    
 

Spark REPL:  

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
	- define env variables, (all caps) pyspark_driver_python=ipython , pyspark_driver_python_opts='notebook'

- RSTUDIO
	
Testing setup :   

- Check versions after typing

`
$spark-shell  
$sparkR
`

- Run inbuilt examples:







