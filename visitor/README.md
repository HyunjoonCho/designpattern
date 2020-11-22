## Visitor  
##### Component  
- Visitor  
declare visit methods for each element of data structure  
- ConcreteVisitor  
- Element  
declare accept method which gets Visitor as an argument  
- ConcreteElement
- ObjectStructure  
contain set of Element instances, implement API for a visitor to visit every element in the set

##### Note  
- double dispatch  
element.accept(Visitor) <---> visitor.visit(element)  
  - Why?  
  separation of visitor's work and data structure by concentrating logical work to visitor, not to individual element   
- Open-Closed Principle: be open to extension, but closed to modification  
request for a role of class may change time to time, i.e. users want extension but those extensions should never break fully-tested logic  
- handy to add ConcreteVisitor, cumbersome to add ConcreteElement  
- Element should expose proper amount of information to Visitor  
