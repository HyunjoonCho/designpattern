## Prototype

##### Component
- Prototype  
interface defining methods to copy prototype to create new instance
- ConcretePrototype  
- Client  
create new instance by calling already defined clone method
##### Note
- Why NOT new + Constructor?  
    1. too many cases to create individual classes
    2. difficult to create instance from class   
    e.g. Graphics Library
    3. separate framework package from actual clone implementation  

- Why dependency matters?  
reusable means that you don't need actual source file but only class file, even when concrete implementation is modified