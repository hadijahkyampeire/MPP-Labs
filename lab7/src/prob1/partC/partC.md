## PART C
- What's wrong with this solution?

```
The solution does not override the hashCode, 
therefore in the method to removeDups, checking if an Object is in the HashMap will always return false and then add the same Object with a different hashCode.

When using a HashMap, we should always ensure that the equals and hashCode are overridden and compare the same attributes.
```