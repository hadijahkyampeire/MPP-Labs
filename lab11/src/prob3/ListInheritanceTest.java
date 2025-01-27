package prob3;

import java.util.List;
import java.util.ArrayList;

public class ListInheritanceTest {
    public static void main(String[] args) {
        // === Concrete List Instances ===
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        // === Wildcard List Instances ===
        List<? extends Integer> extendsIntegerList = integerList;
        List<? extends Number> extendsNumberList = integerList; // Allowed: Integer extends Number
        extendsNumberList = numberList; // Allowed: Number extends Number
        // extendsNumberList = objectList; // ❌ Not Allowed: Object does not extend Number

        List<? super Integer> superIntegerList = integerList;
        superIntegerList = numberList; // Allowed: Number is a supertype of Integer
        superIntegerList = objectList; // Allowed: Object is a supertype of Integer

        List<? super Number> superNumberList = numberList;
        superNumberList = objectList; // Allowed: Object is a supertype of Number
        // superNumberList = integerList; // ❌ Not Allowed: Integer is not a supertype of Number

        List<?> wildcardList = integerList;
        wildcardList = numberList;      // Allowed: Any List type can be assigned to List<?>
        wildcardList = objectList;
        wildcardList = extendsIntegerList;
        wildcardList = extendsNumberList;
        wildcardList = superIntegerList;
        wildcardList = superNumberList;

        // === Assignments Demonstrating Assignability ===
        // 1. Assigning concrete lists to wildcard lists
        wildcardList = integerList;     // Allowed
        wildcardList = numberList;      // Allowed
        wildcardList = objectList;      // Allowed

        // 2. Assigning concrete lists to bounded wildcard lists
        extendsNumberList = integerList;    // Allowed
        extendsNumberList = numberList;     // Allowed
        // extendsNumberList = objectList;    // ❌ Not Allowed

        superIntegerList = integerList;      // Allowed
        superIntegerList = numberList;       // Allowed
        superIntegerList = objectList;       // Allowed

        superNumberList = numberList;        // Allowed
        superNumberList = objectList;        // Allowed
        // superNumberList = integerList;     // ❌ Not Allowed

        // 3. Assigning wildcard lists to wildcard lists
        // This is generally not allowed due to invariance, but compatible assignments are shown
        wildcardList = extendsIntegerList;   // Allowed
        wildcardList = extendsNumberList;    // Allowed
        wildcardList = superIntegerList;     // Allowed
        wildcardList = superNumberList;      // Allowed

        // === Assignments That Should NOT Compile ===
        // Uncommenting any of the following lines will cause compilation errors

        // 1. Incompatible concrete types
        // integerList = numberList;         // ❌ Not Allowed: List<Number> is not a subtype of List<Integer>
        // integerList = objectList;         // ❌ Not Allowed: List<Object> is not a subtype of List<Integer>
        // numberList = integerList;         // ❌ Not Allowed: List<Integer> is not a subtype of List<Number>

        // 2. Incompatible wildcard types
        // extendsIntegerList = numberList;  // ❌ Not Allowed: List<Number> is not a subtype of List<? extends Integer>
        // extendsNumberList = objectList;   // ❌ Not Allowed: List<Object> is not a subtype of List<? extends Number>

        // superIntegerList = extendsNumberList; // ❌ Not Allowed
        // superNumberList = extendsIntegerList;  // ❌ Not Allowed

        // 3. Assigning to bounded wildcards with incompatible bounds
        // extendsNumberList = superNumberList;   // ❌ Not Allowed
        // superIntegerList = extendsIntegerList; // ❌ Not Allowed

        // === Demonstrating Method Assignments ===
        // The following method accepts a List<?> and can take any List type
        assignToWildcard(integerList);
        assignToWildcard(numberList);
        assignToWildcard(objectList);
        assignToWildcard(extendsIntegerList);
        assignToWildcard(extendsNumberList);
        assignToWildcard(superIntegerList);
        assignToWildcard(superNumberList);

        // The following methods demonstrate specific bounds
        assignToExtendsNumber(extendsNumberList);
        assignToSuperNumber(superNumberList);
    }

    // Method accepting List<?> (any List type)
    public static void assignToWildcard(List<?> list) {
        System.out.println("Assigned to List<?>: " + list.getClass().getSimpleName());
    }

    // Method accepting List<? extends Number>
    public static void assignToExtendsNumber(List<? extends Number> list) {
        System.out.println("Assigned to List<? extends Number>: " + list.getClass().getSimpleName());
    }

    // Method accepting List<? super Number>
    public static void assignToSuperNumber(List<? super Number> list) {
        System.out.println("Assigned to List<? super Number>: " + list.getClass().getSimpleName());
    }
}

