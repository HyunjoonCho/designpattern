## State  
##### Component  
- State  
define API for state-dependent actions  
- ConcreteState  
- Context  
have instance of current state - ConcreteState  
define API for users  

##### Note  
- Context as Interface - better to have State as member? concrete context may need extension of class e.g. awt.Frame  
- divide and conquer: reduction of condition check (if-else state) by implementing ConcreteState for each possible State  
- Who to manage State change - State or Context?  
  - State
    - Pros: info on when "This" State turns into another is collected  
    - Cons: must know of other states  
  - Context
    - Pros: states are independent from each other  
    - Cons: Context must know all states  
    -> may use [Mediator pattern](https://github.com/HyunjoonCho/designpattern/tree/main/mediator) or table mapping { (input and current state) > (next state) }   
- easy to add new ConcreteState, hard to modify State interface  