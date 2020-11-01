## Factory  

##### Component   
- Framework  
    - Product  
    product of factory pattern, define common function of product as API  
    - Creator  
    creation of product does not require specific product name,  
    but one call of method is enough  
    
- Concrete   
    - ConcreteProduct
    - ConcreteFactory  
    
##### Note  
- Framework side does not depend on Concrete implementation  
- createProduct can be written in three ways
    - abstract class - abstract method  
    - class - default creator  
    - class - error thrower  
- setting ConcreteProduct constructor as default not public,  
force use of factory 
    
