## Chain of Responsibility  
##### Component  
- Handler 
define API to handle request - contain next Handler and toss if current cannot handle the issue  
- ConcreteHandler  
- Client  
##### Note  
- flexible connection of Client and Handlers  
if it's not the case, information about the chain must be stored somewhere - can even be Client  
- dynamic change of chain  
- each Handler can focus on specific job  