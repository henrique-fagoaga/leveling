# Constructor overloading
Just like overloading Java methods, class constructors can behave just like it to improve code cohesion and dx.

When reusing constructors inside another constructor:
- the `this()` constructor inside the another one should be the first instruction of the code block
- only **one** `this()` can be used inside another constructor
