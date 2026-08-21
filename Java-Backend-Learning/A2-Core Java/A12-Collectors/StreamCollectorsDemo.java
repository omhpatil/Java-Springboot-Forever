package CORE_JAVA.Collectors;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
}

public class StreamCollectorsDemo {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(1, "Om", "IT", 50000), new Employee(2, "Ravi", "HR", 40000), new Employee(3, "Priya", "IT", 60000), new Employee(4, "Asha", "Finance", 70000), new Employee(5, "Amit", "HR", 45000));

        // 1️⃣ toList()
        List<String> names = employees.stream().map(e -> e.name).collect(Collectors.toList());
        System.out.println("toList(): " + names);

        // 2️⃣ toSet()
        Set<String> departments = employees.stream().map(e -> e.department).collect(Collectors.toSet());
        System.out.println("toSet(): " + departments);

        // 3️⃣ toMap()
        Map<Integer, String> idNameMap = employees.stream().collect(Collectors.toMap(e -> e.id, e -> e.name));
        System.out.println("toMap(): " + idNameMap);

        // 4️⃣ joining()
        String joinedNames = employees.stream().map(e -> e.name).collect(Collectors.joining(", "));
        System.out.println("joining(): " + joinedNames);

        // 5️⃣ groupingBy()
        Map<String, List<Employee>> groupByDept = employees.stream().collect(Collectors.groupingBy(e -> e.department));
        System.out.println("groupingBy(): " + groupByDept);

        // 6️⃣ partitioningBy()
        Map<Boolean, List<Employee>> partitionedBySalary = employees.stream().collect(Collectors.partitioningBy(e -> e.salary > 50000));
        System.out.println("partitioningBy(): " + partitionedBySalary);

        // 7️⃣ counting()
        long count = employees.stream().collect(Collectors.counting());
        System.out.println("counting(): " + count);

        // 8️⃣ summarizingInt()
        IntSummaryStatistics salaryStats = employees.stream().collect(Collectors.summarizingInt(e -> e.salary));
        System.out.println("summarizingInt(): " + salaryStats);
    }
}

