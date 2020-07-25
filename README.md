# PageRankingAlgorithm

Algorithm utilized to rank the websitesin the search engine. Pageranking can be describe as the way of measuring the importance of website.

# Disclaimer
**This project was solely built for the learning puropse and hence does not hold any commercial value.**

**Main motivation for the creation of this project is to showcase the knowledge of Java programing language and Page Ranking Algorithm**

# Project Setup

**Requirements**

  - JDK/Eclipse
  
**Steps to run the program:**

1.) Initialize the float variables with the necessary values.
2.) Enter the Transition matrix as the value of variable "a"
3.) Enter the initial positon of the pages in matrix format as value of variable "b"
4.) Save, compile and run the program
5.) change the value of h in incremental fashion till the matrix converges and repeat step 4.

**In Eclipse**
  
    * Create new Java project copy past the package from clonned project src to new project src
    * Run the application
    
**In Terminal**

    * Change into src directory execute the command <javac com/pageranking/*.java -d ../../bin>
    * Change into bin directory exectue the command <java com/pageranking/PageRanking>
