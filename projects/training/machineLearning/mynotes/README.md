# Machine Learning notes

Learn the best hypothisis given data and some domain knowledge


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

A perceptron classifier is a simple model of a neuron. It has different inputs (x1...xn) with different weights (w1...wn).
  
The weighted sum s of these inputs is then passed through a step function f (usually a Heaviside step function).

f(s)={1 if s≥0 
      0	otherwise

* Can only be used on neural sets
* will find the result in finite sets
  
Ways for finding the weights:
  
- Perceptron rule (Tresholded outputs: above 0)
- Gradient Descent (unThresholded outputs: )

```python
from random import choice
from numpy import array, dot, random

unit_step = lambda x: 0 if x < 0 else 1

training_data = [
    (array([0,0,1]), 0),
    (array([0,1,1]), 1),
    (array([1,0,1]), 1),
    (array([1,1,1]), 1),
]

w = random.rand(3)
errors = []
eta = 0.2
n = 100

for i in xrange(n):
    x, expected = choice(training_data)
    result = dot(w, x)
    error = expected - unit_step(result)
    errors.append(error)
    w += eta * error * x

for x, _ in training_data:
    result = dot(x, w)
    print("{}: {} -> {}".format(x[:2], result, unit_step(result)))
```

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

---


## Support vector machines

Intro: For finding the best line between the linearly seperable classifications which have less data points and less features. Kernel trick can also be used for finding the nonlinear lines. SVM are machines which find optimised solutions with the help of support vectors, by maximising the distance between support vectors and possible line, 
- using kernel trick is powerfull in finding the nonlinear classifications.  
- The performance is O(n^3) with no of data points.
- No of points can be decreased by using montecarlo simulations and than



__Y__classification = W^T(X) + b

distance between tho hyperplances is
W^T[X1] + b = -1
W^T[X2] + b = 1

Note we are talking about linear planes only
 (W^T/||W||)(x1-x2) =  2/||W||

maximise 2/||W||


## Instance based learning

Saves all the data to databases

Advantages

- Remembers all the data
- fast
- simple 
- realtime update

Disadvantages:
- No generalisation
- Noise
- Overfitting

Tips:

Use geolocation saving format(quadtrees) for multiple features  
Might be possible to use neaer duplicate detection algorithms for finding the featureLazy learner, saves time untill necessary, memory intensive.

### Easy to learn and time taking to query on sorted data

Advantages : Knn is very good in finding the distances

### Preference Bias:

Data localaity, near points should have same values,
Smoothness, we are looking at smooth function, rather than discrete functions
All features are matter equally


## Naive Bayes

Learn the most probable H given data t domain knowledge.

probabilit(h/D) where h belongs to H

Chainrule: Pr(h/D) = Pr(D/h)Pr(h)/Pr(D)

D -> Training data (labels)
Pr(D)  -> probability of seeing our data
Pr(h)  -> 
Pr(D/h)-> data given the hypothesis


Best hypothesis for given data is proportional to
 - probability of Data for a given hypothesis
 - probability of test hypothesis (near distance are more similar)
 - prior d is normalisation term
Read more on this

## [Ensemble Learning](http://cs.nju.edu.cn/zhouzh/zhouzh.files/publication/springerEBR09.pdf)

Enmsemble are wonderful tools in machine learning paradigm,

multiple learners are trained to solve the same problem. In contrast to onrdianry machine learning approaches which try to learn one hypothesis from training data, ensemble methods try to consturct a set of hyportheses and combine them to use.

Advantages,

- even base weak learners are used to make strong generalisations
- neural network desicion trees or other kinds can be used as base learners

first base learners are produced which can be generated in a prallel style or series. Base learners are combined to use.

- weighted averaging for regression
- majority voting for classification

### Preference bias:
For higher accuracy the base learners are to be as accurate as possible.
The data should be diverse, like in the example of capturing the data in complex shape we used diverse cicles are modeled the data inside the circles.
- subsampling the training data
- manipulating the attributes 
- manipulating the output
- injecting randomness into learning algorithms

### Assembly

- boosting
- bagging
- stacking


Boosting: Ada boost,
