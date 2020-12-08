## Command  
##### Component  
- Command  
define APIs for command  
- ConcreteCommand  
- Receiver  
get commands from Command and do something  
- Client  
create ConcreteCommand and allocate Receiver to listen to follow commands  
- Invoker  
initiate commands - call APIs of Command  

##### Note  
- Command may store various info based on its purpose  
e.g. DrawCommand has Drawable as a member so that it works well with multiple Receivers  
- may replace implementation of MouseMotionLister interface with creation of anonymous MouseMotionAdapter instance - or maybe lambda expression  

