# Data Base Strategies and Implementation - Rita Rodrigues
## Database fundamental theory
### Some components
- **Data**
  - the smaller unit of an information
- **Information**
  - structured data that have value according the view associated with it
- **Database**
  - where data resides
- **DBMS**
  - application usage to apply operations against the DB
- **DB System**
  - whole ecosystem involving the database data flow (from client to DB)
## Database Propeties
- **Integrated**
  - a storage isn't replicated to each smaller data sources
- **Shared**
  - creation of multiple views to access the same integrated DB according to the needs
- **Multiuser**
  - data access concurrency, already resolved by most DBMS'es

### Data Manipulation
- DDL: Data Definition Language
- DML: Data Manipulation Language
- DQL: Data Query Language
- DRS: Data Recovery (?)

### Q&A
- What's database?
  - data repository/warehouse/storage
- What's DBMS?
  - application that communicates with database
  - eg.: Orcacle, MS Sql Server, MySql, PostgreSQL
- What's DB System?
  - the big picture of the database ecosystem
  - components: application, dbms, db, clients
- Why is important to manage client accesses?
  - to filter the view for each kind of client
- What's the importance of having integrated & shared DB?
  - integrating eliminates redundancy and inconsistency between storages
  - sharing makes DB integration benefits to improve the DB usage
- How's the DB abstraction associated to final user?
  - it makes viable to user store and view the information retrieved from a DB backed service
- How's the DB abstraction associated to the developer?
  - it's more related to the business knowledge related about the modeling  
- How the data integrity and security helps the quality of stored data?
  - data inconsistency would arise provenient from bad inputs
- How developers can help to grant data integrity?
  - adds constraints to block bad inputs
