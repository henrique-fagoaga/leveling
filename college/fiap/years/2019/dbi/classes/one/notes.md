# Data Models
- **Data Models**
  - concept{
  		> DBMS not required
  - logical{
  - relational (DBMS required)
- **Entity**
  - storage needed
  - name | meaning | attributes( length >= 2)
- **Attributes**
  - described details of an entity
  - types of attributes:
    - simple: ony one value(name, lvl)
    - compound: sum of many values(stick + charcoal = torch or number + zipcode = address)
    - multivalued: many variations of the same attribute(tel:home, tel:office)
    - determinant: unique value(rg, rm, cpf)

##Variation(Cardinality)
	              / min=0 -> optional attribute
	     minimum |
	   /          \ min=1 -> primary attribute(required)
- variation
	   \          / max=1 -> one value
	     maximum |
	              \ max=N -> multi values
### Q&A
- What can be an entity?
  - real objects (sword, staff, ...)
  - classes (mage, knight, ...)
  - incidents (accident, travel, ...)
  - interaction (war, marriage, ...)
