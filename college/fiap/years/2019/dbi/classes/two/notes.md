# Data Modeling - Association
## Weak reference
- it's about an entity that depends on another entity to exist
## Strong reference
- a self existing entity that is used as source in a association

## Cardinalty
- minimum and maximum quantity that can exist between association
### 1:1
- simple association 
### 1:N
- cardinality of the destiny-\> source association can be both _optional (0)_ or _mandatory (1)_
- when _optional_: the target entity have a **strong ref**
- when _mandatory_: the target entity have a **weak ref**
### N:N
- depends on an **associative entity** to make association between two n:n related tables
#### Associative entities
- is a **weak ref** existence
- depends on at least one of the two entities being connected to exist
