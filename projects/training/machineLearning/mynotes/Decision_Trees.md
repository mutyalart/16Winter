## Decision Trees


class sklearn.tree.DecisionTreeClassifier

- criterion='gini' 
	- _gini_ : measure of how often a randomly chosen element from the set would be incorrectly labeled if it was randomly labeled.
		Gini impurity can be computed by summing the probability {\displaystyle f_{i}} f_{i} of an item with label {\displaystyle i} i being chosen times the probability {\displaystyle 1-f_{i}} 1-f_{i} of a mistake in categorizing that item 
	- _entropy_ : for information gain, simple short trees, with important and correct branches at starting
- splitter='best'
	- strategy to split data, _best_ or _random_
- max_depth=None
- min_samples_split=2
	- If int, then consider max_features features at each split.
	- If float, then max_features is a percentage and int(max_features * n_features) features are considered at each split.
	- If “auto”, then max_features=sqrt(n_features).
	- If “sqrt”, then max_features=sqrt(n_features).
	- If “log2”, then max_features=log2(n_features).
	- If None, then max_features=n_features.
- min_samples_leaf=1
- min_weight_fraction_leaf=0.0
- max_features=None
	- If int, then consider max_features features at each split.
	- If float, then max_features is a percentage and int(max_features * n_features) features are considered at each split.
	- If “auto”, then max_features=sqrt(n_features).
	- If “sqrt”, then max_features=sqrt(n_features).
	- If “log2”, then max_features=log2(n_features).
	- If None, then max_features=n_features.
- random_state=None
- max_leaf_nodes=None
	- Grow a tree with max_leaf_nodes in best-first fashion. Best nodes are defined as relative reduction in impurity. If None then unlimited number of leaf nodes.
- min_impurity_split=1e-07
- class_weight=None
- presort=False
	- Whether to presort the data to speed up the finding of best splits in fitting. For the default settings of a decision tree on large datasets, setting this to true may slow down the training process. When using either a smaller dataset or a restricted depth, this may speed up the training.

