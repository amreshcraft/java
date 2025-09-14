

# **Java Stream API – 25 Assignment Questions**

### 🔹 Stream Creation & Basics

1. Create a `Stream` of integers from an array, find their squares, and collect into a list.
2. Create a `Stream` using `Stream.iterate()` to generate first 10 even numbers.
3. Create an **infinite random number stream** using `Stream.generate()` and print the first 5 values.
4. Read lines from a text file using `Files.lines()` and print only the first 3 lines.

---

### 🔹 Intermediate Operations

5. Given a list of strings, remove all duplicates using `distinct()` and sort them in reverse order.
6. Convert a list of names into uppercase using `map()` and print them.
7. Given a list of sentences, split each sentence into words and flatten them into a single list using `flatMap()`.
8. Given a list of numbers, skip the first 3 elements and print the next 5.

---

### 🔹 Terminal Operations

9. From a list of integers, use `reduce()` to find their product.
10. From a list of employees, find the employee with the **highest salary** using `max()`.
11. From a list of employees, find the **total salary sum** using `mapToDouble().sum()`.
12. Check if any employee’s name starts with `"A"` using `anyMatch()`.

---

### 🔹 Collectors

13. Group employees by department using `Collectors.groupingBy()`.
14. Partition a list of integers into **even** and **odd** using `Collectors.partitioningBy()`.
15. Count how many employees earn more than `50000` using `Collectors.counting()`.
16. Convert a list of strings into a **comma-separated single string** using `Collectors.joining(", ")`.

---

### 🔹 Null & Edge Cases

17. Create a stream with `Stream.ofNullable()` and test it with both a `null` and non-null value.
18. What happens if you use `Stream.of(null)`? Write code to prove and handle it.
19. Demonstrate why **stream cannot be reused** after a terminal operation. Show the exception.
20. Use an **infinite stream** without `limit()` and show why it hangs. Then fix it.

---

### 🔹 Real-world Style

21. Given a list of `Orders (id, status, amount)` → Find total revenue of orders with status `"COMPLETED"`.
22. From a list of `Employee` objects, get the **second highest salary**.
23. From a map of `city -> population`, find the top 3 most populated cities using streams.
24. From a list of `Transaction (id, userId, amount)`, group by userId and find total spent per user.
25. Given a list of nested lists of integers (`List<List<Integer>>`), flatten them into a single list and sort ascending.



---

