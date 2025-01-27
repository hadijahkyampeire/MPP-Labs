## Question One

#### Consider the following code fragments. For each, if there is a compiler error, identify
where it occurs.
- a. First fragment:
```
    List<Integer> ints = new ArrayList<>();
    ints.add(1);
    ints.add(2);
    List<Number> nums = ints; // Error
    nums.add(3.14);
```

- Error occurs on line 4. This because List<Integer> can not be assigned to List<Number> because they are incompatible even though Integer is a subtype of number. 
The assignment violates the type safety and would break the system.


- b. Second fragment:
```
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
nums.add(3.14); // Error
```

- Error occurs on line 5. This is because, even though we use a wildcard ? which means any subtype of Number, it will accept the assignment of Integer list to Number List but because ? means the type is unknown, it will not accept adding because a double could be added which violates the type safety. 
