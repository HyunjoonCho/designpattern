# Design Pattern
Java 언어로 배우는 디자인 패턴 입문 - Yuki Hiroshi  
Manage modules and test efficiently with maven  

### Goal  
----
- To make code reusable  
- Easier maintenance  

### Questions
----
**Q. Why do we use Interface, not the Class?**  
A. You may use APIs from Inteface under various circumstances e.g. change of DB, protocol  
So, you'd better extract essential functions as API and hide details that user doesn't have to know - or should never know! 
