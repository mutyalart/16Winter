# Machine Learning notes
---
---









## Decision Trees
---
---

### _Algorithm_
---
- loop of all features : (life)   
		* light -> plant -> size  
		* 	-> animal -> selfconsiousness  
- select best attribute (photo synthesis)
- Assign A as decision attribue for node (light)
- Each value of attribute create a descendent of node (plants, animals)
- sort training data to leaves 
- iterate till all data is sorted into leaves

### _Entropy_ (Degree of randomness)
---
- Information gain is a measure of decrease in randomness  
- Entropy gain = total entropy - sum of entropy of each value of attribute( proportionality of data * entropy of training set for this value)

Splitting on entropy


### _Restrictive bias_
	- preference is restricted to decision trees
### _Preference or inductive bias_ 
	preference for natural and good practices
	* good splits at top divides data well
	* correct / incorrect of decision trees
	* shorter trees 
 
Descision trees can also be used for continous variables by having range on attributes. We can also use different ranges of the attributes in the decision trees

- we stop the iteration when data is classified, 
- no more attributes to classify
- no overfitting,  pruning of leaves should be done for overfitting

### _Summary:_

## Neural Networks

### Types:
* Feedforward networks
* recurrent neural networks

### _Intro:_  
  
Perptron Neuron:
	inputs vector of x1,x2,x3 are given, and outputs are given. Neural nets algorithms are used to find the weights w1,w2,w3.
* Can only be used on neural sets
* will find the result in finite sets
  
Ways for finding the weights:
  
- Perceptron rule (Tresholded outputs: above 0)
- Gradient Descent (unThresholded outputs: )

### restrictive bias
_meaning_ Restricting our view 

* Boolean Functions   - network of threshold units
* Continuos Fnctions   - hidden layer 
* Arbitrary Functions  - two hidden layers

Cross validation for parmater optimization and restricting the nodes,hidden layers and weights or error 
  
### Preference bias
_meaning_ preference of one over another model

* Small random values
* Preffer simple and correct model
* Occams razor: unnecessarily multiplying, if the increase in hidden layer is not improving the error decrease the no of hidden layers
* 


Summary: 

* __perceptron neuron__: definitely find the result if the model is linear. But it is difficult to know the model is linear
* networks can produce any boolean function
* sigmodial functions can be use instead of boolean function for differentiable neural networks
* differentiable neural networks help in feedback back of error
* Boolean, continuos, arbitrary functions can be modeled using neural networks
* Small random values for instialisation and decreasing no of intermediate steps will help in overfitting of model
* Other typical problems of the back-propagation algorithm are the speed of convergence and the possibility of ending up in a local minimum of the error function
* Today there are practical methods that make back-propagation in multi-layer perceptrons the tool of choice for many machine learning tasks.



