## Memento
##### Component 
- Originator  
save and undo by using Memento  
- Memento  
save internal info of Originator  
  - wide interface: provide all info required for restoration, thus, only called by Originator  
  - narrow interface: opened to external Caretaker  

  proper distinction of two interfaces prevent encapsulation being broken      
- Caretaker  
notify Originator to create Memento and keep the instance  
can only use narrow interface of Memento

##### Note
- wide and narrow refer to Authority i.e. how much operation you can make on Memento  
- how many Mementos will you store? how long will you keep them in memory?  
- Caretaker determines when to save and when to restore  