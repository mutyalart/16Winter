## Machine Learning notes
---
---









# Decision Trees
---
---

_Algorithm_
---
- loop of all features : (life)   
		* light -> plant -> size  
		* 	-> animal -> selfconsiousness  
- select best attribute (photo synthesis)
- Assign A as decision attribue for node (light)
- Each value of attribute create a descendent of node (plants, animals)
- sort training data to leaves 
- iterate till all data is sorted into leaves

_Entropy_
---
- Information gain is a measure of decrease in randomness  
- Entropy gain = total entropy - sum of entropy of each value of attribute( proportionality of data * entropy of training set for this value)

_Bias_ (Preference)  
---

Two type of Bias 

- restrictive bias
	- preference is restricted to decision trees
- inductive bias preference for natural and good practices
	* good splits at top divides data well
	* correct / incorrect of decision trees
	* shorter trees 
