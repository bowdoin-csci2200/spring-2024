---
layout: default 
title: Detailed schedule
nav_order: 3
---


## Detailed schedule (SPRING 2024)


### Week 1: Warmup (bubble sort, insertion sort, selection sort) and analysis.


Objectives: 
  *  Review searching (linear search, binary search) and simple sorting (bubble sort, selection sort, insertion sort) and their analysis
  *  Basics of algorithm analysis, big-Oh notation,  best-case and worst-case analysis

__Resources:__     
  * __Notes:__ [LN-warmup.pdf](../docs/LN-warmup.pdf)     
  *  __Lab:__   [Lab 1](../docs/lab1.pdf), [python-warmup.ipynb](../docs/python-warmup.ipynb), [python-insertionSort.ipynb](../docs/python-insertionSort.ipynb)
  
 ***
 
 
 
### Week 2: Asymptotic Notation and Summations


Objectives:
* Relevance of analysis in practice, as well as its assumptions and limitations
* Definitions of O(), Ω(), Θ()
* Rate of growth of common functions
* Finding the rate of growth of a function
* Comparing the order of growth of  arbitrary functions 
* Analyzing basic algorithm running times using O(), Ω(), Θ() 
* Arithmetic and geometric summations and their Θ() bounds 
* Recognizing arithmetic and geometric summations in different forms


__Resources:__    
  * __Notes:__ [LN-asymptoticNotation.pdf](../docs/LN-asymptoticNotation.pdf),  [LN-summations.pdf](../docs/LN-summations.pdf), [quiz2-practice.pdf](../docs/quiz2-practice.pdf)
  * __Lab:__   [Lab2](../docs/lab2.pdf) 
  
***
      
   
### Week 3: Mergesort and Recurrences

Objectives: 
* Mergesort: how it works, why it works, and its running time analysis
* Express the running time of recursive algorithms using recurrences
* Solve recurrences by repeated iteration
* Recognize broadly classes of recurrences ( logarithmic, linear, Θ(n lg n), exponential)

__Resources:__    
  * __Notes:__ [LN-recurrences.pdf](../docs/LN-recurrences.pdf), [quiz3-practice.pdf](../docs/quiz3-practice.pdf)
   * __Lab:__   [Lab3](../docs/lab3.pdf) 
   
 ***

### Week 4: Quicksort and Heapsort 

Objectives:
* Lomuto partition, Quicksort, Randomized-Quicksort and analysis
* Min/max-binary heap  and operations   (deleteMin/Max, insert, heapifyDown, buildheap) along with  analysis 
* Heapsort  in place 
* Using the heap as a tool to solve new problems 

__Resources:__     
* __Notes:__ [LN-heapsort.pdf](../docs/LN-heapsort.pdf), [LN-quicksort.pdf](../docs/LN-quicksort.pdf)  
* __Lab:__   [Lab4](../docs/lab4.pdf)   

 ***
  
  
### Week 5: Sorting lower bound. Sorting without comparisons. 

Objectives: 
* Can a sorting algorithm do better than Θ(n lg n) in the worst-case? Understand the comparison-based sorting lower bound, when it applies and what assumptions it makes
* Non-comparison sorting: Understand BucketSort and CountingSort,  their analysis and assumptions

__Resources:__     
  * __Notes:__ [LN-linsort.pdf](../docs/LN-linsort.pdf)
 * __Lab:__  [Lab5](../docs/lab5.pdf),  [python-mergeSort.ipynb](../docs/python-mergesort.ipynb), [python-quickSort.ipynb](../docs/python-quicksort.ipynb)
          
 ***

   * Exam1 in class
   * Resources: [Exam1 review](../docs/exam1-studyGuide.pdf) and some practice problems 

 ***


### Week 6: Selection. 

__Objectives:__ 
* The selection problem
* Quick-Select in expected O(n) time 
* An elegant and ingenious algorithm that runs in O(n) worst-case.

__Resources:__
  * __Notes:__  [LN-selection.pdf](../docs/LN-selection.pdf) 
  * __Lab:__   [Lab6](../docs/lab6.pdf) 

***
 

What do you do when you want to solve a problem and you don't know where to start? Although there are no recipes, there are some general techniques that come up frequently: divide-and-conquer, dynamic programming and greedy.  

### Week 7: Divide-and-conquer


Objectives: 
* The divide-and-conquer technique 
* Karatsuba's integer multiplication algorithm
* Strassen's  matrix multiplication  
* Using D&C to solve new problems

__Resources:__
  * __Notes:__ [LN-divideAndConquer.pdf](../docs/LN-divideAndConquer.pdf)
   * __Lab:__   [Lab7](../docs/lab7.pdf), [karatsuba.ipynb](../docs/python-Karatsuba.ipynb)
          
***
 

### Week 8, 9: Dynamic Programming 


Objectives:
* The dynamic programming  technique
* Examples: Fibonacci, board game, rod cutting and knapsack
* Justification of correctness via optimal substructure, and analysis
* Using the DP paradigm to solve **new** problems 

__Resources:__
* __Lecture notes:__ [LN-dynprog.pdf](../docs/LN-dynprog.pdf), [LN-board.pdf](../docs/LN-board.pdf), [LN-rod.pdf](../docs/LN-rod.pdf), [rod-summary.pdf](../docs/summary-rod.pdf), [LN-knapsack.pdf](../docs/LN-knapsack.pdf), [knapsack-summary.pdf](../docs/summary-knapsack.pdf)
* In class problems: [knapsack](../docs/week10-problem1.pdf), [pharmacist](../docs/week10-problem2.pdf)
* __Lab:__   [Lab8](../docs/lab8.pdf) ,  [Lab9](../docs/lab9.pdf)
*  Code: [Fibonacci.ipynb](../docs/python-Fibonacci.ipynb), [Fib.java](../docs/Fib.java), [fib.py](../docs/fib.py), [board.py](../docs/board.py), [houserobber.py](../docs/houserobber.py), [houserobber.ipynb](../docs/python-houserobber.ipynb), [rodcutting.ipynb](../docs/python-RodCutting.ipynb)
*  Optional: The longest-common-subsequence  problem:  [LN-lcs.pdf](../docs/LN-lcs.pdf),  [lcs.ipynb](../docs/python-LCS.ipynb), [summary-lcs.pdf](../docs/summary-lcs.pdf)

  
 ***
 
 
 
### Week 10:The Greedy technique.  


Objectives:
* The greedy technique  via the activity selection, including the correctness justification
* Using the greedy technique to solve new problems
  
__Resources:__
* __Lecture notes:__ [LN-greedy.pdf](../docs/LN-greedy.pdf)
* __Lab:__   [Lab10](../docs/lab10.pdf) 


***

* Exam 2 in class
* __Resources:__ [exam2-review](../docs/LN-techniques-review.pdf) and some (more) practice problems 


***
 
 
 
### Week 11, 12:    Graphs Basics. BFS and DFS and their applications.  Topological order. Dynamic programming on DAGs. 


Objectives:
* Graph representation:  adjacency list and adjacency matrix 
* Basic concepts: sparse, complete, dense, trees, paths, connectivity, connected components, reachability, strongly connected components 
* Breadth-first and depth-first traversals, their complexity,  and their properties 
* Topological order and  two algorithms for computing a topological order
* Dynamic programming on DAGs

__Resources:__
*  __Lecture notes__: [LN-graphBasics.pdf](../docs/LN-basics.pdf), [LN-bfsdfs.pdf](../docs/LN-bfsdfs.pdf), [LN-topsort.pdf](../docs/LN-topsort.pdf) 
*  __Lab:__   [Lab11](../docs/lab11.pdf),   [Lab12](../docs/lab12.pdf)
  
 ***

  
### Week  13:  Shortest paths on DAGs,  Dijkstra and  Bellman-Ford. 

We discuss shortest paths on graphs and see some of the nicest
algorithms in computer science: Dijkstra's and Bellman-Ford's
algorithms. While describing them we try to understand some common
principles that guided their design. We'll see that Bellman-Ford's
algorithm uses dynamic programming and Dijkstra's is a greedy
algorithm, making these nice applications of the techniques we studied
earlier in the semester.


Objectives:
* Shortest paths (SP) on DAgs via dynamic programming
* Dijkstra's SP algorithm on graphs without negative weights
* Bellman Ford's SP algorithm on general graphs
* Correctness and analysis
* Finding negative cycles 

__Resources:__
*  __Lecture notes__:  [LN-shpaths.pdf](../docs/LN-shpaths.pdf)
*  __Lab:__   [Lab13](../docs/lab13.pdf)
  
 ***

 
### Week 14: The Minimum Spanning Tree (MST) 

Another fundamental problem on graphs is computing a MST. We discuss
some properties of MSTs which will get us intuition for how to
compute an MST efficiently. We'll glance at two well-known algorithms,
Prim's and Kruskal's, which are both greedy algorithms much in the
spirit of Dijkstra.  Their correctness follows from a neat result
called The Cut Theorem.

Objectives:
* MST (minimum spaninng tree)  and properties
* Kruskal's and Prim's algorithms, and the Cut Theorem which captures their correctness

__Resources:__
*  __Lecture notes__:  [LN-mst.pdf](../docs/LN-mst.pdf), [LN-mst-summary.pdf](../docs/LN-mst-summary.pdf)
*  __Lab:__    [Lab14](../docs/lab14.pdf) 
* Also, a quick review and some extra fun problems!  [LN-review.pdf](../docs/LN-review.pdf)

 
***

### Exam 3

[final exam slot as posted in Polaris]


