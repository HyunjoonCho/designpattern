## Builder  
##### Component  
- Builder  
provide API to set members of instance  
- ConcreteBuilder  
- Director  
use API of Builder - not ConcreteBuilder - to build instance  
- Client  
get instance from builder  
##### Note  
- "Who knows What"  
Director only knows Builder, you may change ConcreteBuilder freely  
- 