## PART C
- What's wrong with the solution?

```
The equals and hashcode override methods in Employee compare name, salary and visited attribute. 
In the remove duplicate method, it checks if an object is already in the HashMap, so the frist Richar(Employee("Richard", 55000, visited=false) will be added.
The second time it gets the same Richard with the same salary, it updates the Object in the HashMap with visited=true, therefore when it meets the third Richard with the same salary but visited false, 
the hashKeys are seen differently and the Objects are no longer equal, so it adds him to the Hashmap and noDupList causing duplicates.
```