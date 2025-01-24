## PART B
- What's wrong with the solution?

```aiignore
The equals method in the Employee can is an overload rather than an override.
So even though it can be used to remove duplicates, it won't be used to compare Object equality.
When the .contains is called, it uses the equal method from the Object and since the solution doesn't provide an override for the equals, 
it uses the default one which compares references for the object, hence the false.
```