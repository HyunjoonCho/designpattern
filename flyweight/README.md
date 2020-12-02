## Flyweight
##### Component  
- Flyweight  
heavy object which will be shared, not created repetitively  
- FlyweightFactory  
create single Flyweight instance for sharing  
- Client  
use FlyweightFactory to get Flyweight instances  
##### Note
- change on shared instance impact all the Clients  
  - intrinsic: information should be shared  
  - extrinsic: information from external source which should not be shared  
  