## BNF  
- Backus-Naur Form, Backus Normal Form   
- metasyntax notation for context-free grammar  
- describe syntax of languages used in computing  
```
<symbol> ::= __expression__  
```

##### e.g. Motion of Car  
```
<program> ::= program <command list>  
<command list> ::= <command>* end
<command> ::= <repeat command> | <primitive command>
<repeat command> ::= repeat <number> <command list>  
<primitive command> ::= go | right | left  
```
- \* in L2 means that any number of <command> can come at the place  
- | (OR) in L3 and L5 means that either of them can come  
- \<primitive command\> is **terminal expression** which cannot be expressed as combination of other expressions, while all others are **nonterminal expression**


*\* is not used in actual BNF and repetition is expressed by recursive definition, i.e. above example is extended BNF*  

e.g. `program repeat 4 repeat 3 go right go left end right end end`  
can be rewritten for better readability:  
```
proram  
  repeat 
    4  
    repeat 
      3  
      go 
      right 
      go 
      left 
    end 
    right  
  end 
end
```