---
layout: default 
title: Syllabus
nav_order: 2
---

# Algorithms (csci 2200, Spring 2024): Syllabus 

|:---------------------|:--------------------|    
|__Instructor:__ | Laura Toma, office: Searles 219 |
| __Class time:__  | MW  10:05-11:30, L1 Fri 10:05-11:30, L2 Fri 11:40-1:05|
|__Classroom:__   | MW in Searles 223, F in VAC North 304 |

**Prerequisites:** csci 2101 (Data Structures)

Algorithms are the backbone of computer science. Everywhere computer
sciences reaches, there is an algorithm.  This class is an
introduction to critical thinking and problem solving through the
design and analysis of algorithms.  Throughout the course we will
consider fundamental computational problems and their algorithmic
solutions. We'll illustrate the process of coming up with algorithms,
analysing their theoretical complexity, and arguing that they work
correctly. Overall we'll see that  the "...subject of
algorithms represents a powerful lens through which to view the field
of computer science in general" [Kleinberg & Tardos]


**Learning goals:** After taking this class you will be able to: 

  1. Demonstrate understanding of fundamental computational problems and the algorithms proposed to solve them
      1. Illustrate how these algorithms work
      2. Analyze their theoretical complexity 
      3. Use them as building blocks in other  algorithms 
  2. Demonstrate understanding of fundamental algorithmic design techniques (recursion, divide-and-conquer, greedy, dynamic programming)
  3. Demonstrate the ability to design efficient algorithms for _new_ problems 
      1. Come up with ideas
      2. Argue whether they are correct (justify correctness) or incorrect (come up with counter-examples)
      3. Analyze their theoretical complexity and compare them
      4. Consider the question: Can the solution be improved?
  
Put simply, the class has two goals: to deeply understand a set of fundamental algorithms, and to develop critical thinking so that you can find efficient solutions to new problems, computational or not.  A strong algorithmic backgound will improve your analytical and
abstraction abilities and will be a big advantage to your career path, whatever it might be. 

  
### Schedule at a glance

|:---------------------|:--------------------|                
| Week 1, 2, 3    |  Introduction and review (bubble sort, insertion sort, selection sort, best case and worst cases analysis). Analysis tools (asymptotic notation, summations, recurrences). |                
| Week 4, 5, 6    | Efficient sorting (mergesort, heapsort,  quicksort, randomized quicksort). Sorting lower bound, bucket sort and counting sort. Selection with quick-select) and in O(n) worst-case. |                      
| Week 7, 8, 9, 10  | Techniques (divide-and-conquer, dynamic programming and greedy).  |                           
| Week 11, 12, 13, 14| Graphs basics, shortest paths on DAGs, Dijkstra's  and Bellman-Ford SSSP algorithms, and minimum spanning trees with Kruskal's and Prim's algorithms.|




### How will this class work? 

* We'll meet three times a week (3 x 85 minutes)

* Each week, before coming to class, read the lecture notes so that
that you understand the big ideas and results ahead of the class.
This will make class time more effective and will allow more time for
questions and problems.

* Every week we have a set of problems (the lab) focused on the topics
discussed that week. Lab problems are __not graded__ and they are meant to be solved in class.  It is
important that you strive to work through all problems, formulate
questions, discuss with your group and get your questions answered. We will ocasionally go
over solutions to some lab problems as a class and if you find that
useful (or not) be sure to let me know how you feel so that we can
adjust.

* Practice quizzes: In Canvas you will find a set of online quizzes. These are autograded and you can see  your results right away. You can take them as many times as you want. They are optional, and are meant to guide your learning. 

* There will be 8-10 assignments which  will be released in Gradescope. 
The assignments will generally be hard and will consist of _new_ problems for which you will have to come up with solutions. 
We expect everyone to do well on the homework, and to take the time to
write your work carefully.


### Work and Grading Policy

- __Assignments: 40%__ 

- __Exams: 60%__ There will be 3 in-class exams: the first one in in
  week 6, the second one in week 10 and the last one at the end of the
  semester (check Polaris for the final exam slot for this class).
  The exams are non-cumulative, to the extent that it's possible. Each exam weighs 20%.
  
- __Class engagement:__ This means attending class, working with your
  group in the lab, asking questions, engaging in discussions,
  volunteering answers, participating on Slack, attending office hours
  and striving to turn in good work. Overall engagement will be used
  as a tie breaker when your score is between two grades.




### Time Commitment

This is a core CS class and will demand a significant time commitment
in order to achieve the learning goals. The time you will spend on this class will vary from
week to week as some topics (esp towards the middle of the semester)
will be harder and may take more hours. It will also vary based on your background and interests.
If you find that you struggle with discrete math
(e.g. logarithms, exponents, etc) you will need to allocate more time
to practice these concepts --- hang in there, and practice; it will get easier. If you finish faster, use the time to work on the challenge problems provided with each lab, and check out resources online such as algorithms classes at other institutions, and sites like LeetCode or similar.


### What you can expect from me

My goal is to teach a class which is similar to algorithms classes at
peer institutions. Many of the problems in labs and assignments come from  Stanford,Berkeley,  MIT, UIUC, etc.  

My teaching style is to create a friendly, open atmosphere where
everyone feels comfortable and motivated to learn. The more questions you ask, the more that helps me and the class  ----questions are a sign that you want to engage and will help me keep the class interactive. The most effective learning happens when YOU all work well together.  Open collaboration in the lab is  highly
encouraged. All assignments are pair-optional, although everyone is highly
encouraged to find a partner.  To support everyone's learning at their
own pace I have created detailed lecture notes and an ample set of
supporting study questions, practice problems and quizzes. Please help
me make this class great by staying engaged and by giving me feedback
(even if I don't ask for it)! Feedback is always welcome.

I know there are circumstances in our lives that we can't control. If
you have any (significant) circumstances that make learning hard, just
talk to me, and we will figure something out.


### How is this class different than other CS classes? 

Coming up with algorithms is both an art and a science: there is no systematic way to have an idea, and problems that
seem very similar, may have very different solutions.



### 2200 vs 2101

Unlike csci 2101, the material in this class is theoretical and spans many levels of
abstractions. Working on an algorithms assignment will seem easier than working on a programming assignment in Data Structures (remember that debugging...). 

* 2101: When you write code, the process of getting your code to work forces you to correct your logic until the program does what it's supposed to do.   

* 2200: When you write pseudocode for an algorithm, you have to rely on yourself to think through all its details carefully; you need to figure out if it has bugs without implementing it. __Thinking through your idea and all the cases that might happen --- it all happens in your head.__ There is no computer to tell you that you have bugs, that your logic has holes,  _YOU_ need to do that. In this class it will be easy to come up with algorithms that are in the right direction.  The hard part will be coming up with an algorithm that _actually works_, and justifying that it works. And doing so on paper, without implementing it. That's the beauty of theory.


### Tips for doing well 

* Budget your time  and give yourself plenty of time to read the materials and work on the assignments each week. Take the labs seriously. Plan on at least 10 hours a week, and make a schedule which you follow every week. 

* Be pro-active about things that are not clear. There's a lot of
  helpful free resources out there. Just search on the Internet
  (really, that's ~~allowed~~ encouraged). BUT: don't search for the assignment problems (because that violates the honor code and  you won't learn much). 

* Self-reflection: Try to formulate questions, and try to answer them yourself.

* Find a group of peers to work with. Explain your ideas, and listen
  to theirs. Try to argue why an idea is correct, or try to prove it
  wrong by finding an instance where it does not work.

* Go to the study groups and office hours and talk to myself and the
TAs; Listen to your peers' questions and get your questions answered.
Solve all problems that are assigned, even those that are optional.

* If you are Math-CS double major, you probably wish the class was
  more rigorous. Check out the lecture notes or a textbook for
  proofs. Many correctness justifications rely on induction, so if
  you've seen that, use this opportunity to come up with those proofs
  yourself (we'll skip them in class).

* Don't be harsh on yourself if you are not doing as well as you
  expected. It takes time to learn, and often we learn (more) from
  mistakes.

