# Design Pattern
Java 언어로 배우는 디자인 패턴 입문 - Yuki Hiroshi  
Manage modules and test efficiently with maven  

Goal  
----
- To make code reusable  
- Easier maintenance  

Questions
----
>**Why do we use Interface, not the Class?**  

You may use APIs from Interface under various circumstances e.g. change of DB, protocol  
So, you'd better extract essential functions as API and hide details that user doesn't have to know - or should never know!  
Also, read about [The Liskov Substitution Principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle)  

