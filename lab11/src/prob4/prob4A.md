## Compilation Error

#### a: Is there a compile error in the code belowe? if so where?
    ```
    List<Integer> ints = new ArrayList<>();
    ints.add(1);
    ints.add(2);
    List<? extends Number> nums = ints;
    double dbl = sum(nums);
    nums.add(3.14);
     ```
- Yes there is a compile error on line 6 --> nums.add(3.14) because for ? extends wildcards you can not add since the exact subtype is unknown, preventing type safety.

#### b: Is there a compiler error in the following lines of code? If so, where?

    ```
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3);
        double dbl = sum(ints); ```

- Yes there is a compile error on line 6 --> double dbl = sum(ints) because List<? super Integer> cannot be passed to a method expecting Collection<? extends Number>, as it may contain non-Number objects, violating type safety.