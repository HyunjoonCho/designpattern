## Composite
##### Component  
- Leaf  
actual content, cannot contain other leaf or composite  
- Composite  
can contain leaf or composite  
- Component  
super object for both leaf and composite  
##### Note
- methods to implement add  
  1. impl at Entry class as an Exception  
  2. impl but does nothing at Entry class - subclass has responsibility
  3. declare as abstract method at Entry class - force subclasses to impl  
  4. impl only at Directory class - cons: must cast Entry to Directory every time you add an Entry 