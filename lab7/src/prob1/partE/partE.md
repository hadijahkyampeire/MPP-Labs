## PART D
- Diamond problem and how Java 8 now supports multiple inheritance;

a. When the type D is a class and A, B, C are interfaces.

```aiignore
- Java resolves the diamond conflict by requiring D to explicitly override 
the conflicting method by providing its own implementation OR specifying which implementation to call using the super keyword.
```

b. When the type D is an interface also

```
- When D is an interface, Java 8 allows D to declare a default method to resolve the conflict.
If D doesn't resolve it, then it must be implemented by its implementating classes.
```