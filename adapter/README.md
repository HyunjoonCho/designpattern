## Adapter  

##### Components
- Target  
spec to fulfill given as interface or abstract class
- Adaptee  
existing class which will be adapted to implement target
- Adapter  
make use of adaptee to meet target spec  

##### Type
- Class Adapter  
implement interface by inheriting class

- Object Adapter  
has object as member since multiple inheritance is not allowed also called Instance Adapter

##### Note  
- user should not know   
  - how adaptee works behind  
  - how adapter implemented target    
- make use of well-built class as it is to achieve another goal