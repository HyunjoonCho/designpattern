## AbstractFactory  
##### Component  
- AbstractProduct  
define APIs for final output or parts of the output e.g. Link, Tray, Page here 
- AbstractFactory  
define APIs to produce AbstractProduct  
- Client  
use APIs of Abstract classes - not concrete ones - to create actual product  
- ConcreteProduct  
- ConcreteFactory  
##### Note  
- handy to modify Concrete side, hard to mod Abstract side