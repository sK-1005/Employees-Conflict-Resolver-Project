# Employees-Conflict-Resolver Project
Java. It is a service to help a client quickly find a manager who can resolve the conflict between two employees. When there is a conflict between two employees, the closest common manager should help resolve the conflict. 


The developers plan to test the service by providing an example reporting hierarchy to enable the identification of the closest common manager for two employees. To keep things simple, they just use a single relationship "isManagerOf" between any two employees. For example, consider a reporting structure represented as a set of triples: 

Tom isManagerOf Mary 
Mary isManagerOf Bob 
Mary isManagerOf Sam 
Bob isManagerOf John 
Sam isManagerOf Pete 
Sam isManagerOf Katie 

The manager who should resolve the conflict between Bob and Mary is Tom(Mary's manager). The manager who should resolve the conflict between Pete and Katie is Sam(both employees' manager). The manager who should resolve the conflict between Bob and Pete is Mary(Bob's manager and Pete's manager's manager). 

Assumptions: 
There will be at least one isManagerOf relationship. 
There can be a maximum of 15 team member to a single manager 
No cross management would exist i.e., a person can have only one manager 
There can be a maximum of 100 levels of manager relationships in the corporation 
