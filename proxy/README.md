## Proxy  
##### Component  
- Subject  
define APIs to make Proxy and RealSubject indistinguishable  
- Proxy  
handle request from Client as much as it can. if the request is out of it's coverage, instantiate RealSubject and toss it   
- RealSubject  
handle jobs that Proxy can not deal with  
- Client  
use Subject  
##### Note  
- kind of lazy evaluation: postpone heavy jobs till it's inevitable  
- separation of Proxy and RealSubject enables  
  - easier change of Proxy's coverage  
  - convenient selection - whether to use Proxy or not  
- e.g. Caching of HTTP Proxy  