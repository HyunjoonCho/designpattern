## Observer  
##### Component  
- Subject  
to be observed, support addition/deletion of Observer and acquisition of current state  
- ConcreteSubject  
- Observer  
to be notified of Subject's state change  
- ConcreteObserver  
##### Note  
- if Observer changes state of Subject, make sure it does not fall into infinite noti-n-update cycle  
for that, add a flag on whether it is getting notified or not  
- proper level of hint should be handed to Observer with Subject instance; time interval or all the updated info - which may not work in case of observing multiple Subjects  
- also called Publish - Subscribe pattern  e.g. MVC, Kafka  
