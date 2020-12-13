## Interpreter  
##### Component  
- AbstractExpression  
define API for node of syntax tree  
- TerminalExpression  
terminal expression of BNF, which does not create more nodes  
- NonterminalExpression  
nonterminal expression of BNF, which may create node  
- Context  
provide information for syntax analysis to interpreter  
- Client  

##### Note  
- regex, batch processing language are other examples of small language  
- clarify which token the interpreter should be reading at that node  
e.g. ProgramNode - skipToken("program") at first, CommandListNode - skipToken("end") at last  