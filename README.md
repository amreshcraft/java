

# 🔥 Interface Mastery Assignments (Java)

## **1. Comparable**

👉 Assignment:

* Create a `Student` class (id, name, marks).
* Implement `Comparable<Student>` to sort by `marks`.
* Store students in an `ArrayList`, sort using `Collections.sort()`, and print.

✔️ Expected Learning: Natural ordering, `compareTo()`, sorting with `Comparable`.

---

## **2. Comparator**

👉 Assignment:

* Extend previous `Student` example.
* Write 3 `Comparator`s:

  1. Sort by `name`
  2. Sort by `id`
  3. Sort by `marks` descending
* Use `Collections.sort(list, comparator)` and test all.

✔️ Learning: Multiple sorting strategies.

---

## **3. Cloneable**

👉 Assignment:

* Create a `Book` class (title, author, price).
* Implement `Cloneable` and override `clone()`.
* Perform **shallow copy** and show how changes affect both.
* Then implement **deep copy** (if `Book` contains another object like `Publisher`).

✔️ Learning: Shallow vs Deep cloning.

---

## **4. Serializable**

👉 Assignment:

* Create `Employee` class (id, name, salary).
* Serialize object → save to file.
* Deserialize it back → read from file.
* Show what happens when you mark a field `transient`.

✔️ Learning: Object persistence, transient keyword.

---

## **5. Runnable**

👉 Assignment:

* Create a `PrintTask` class that implements `Runnable`.
* Thread should print numbers from 1–10 with sleep.
* Start multiple threads concurrently.

✔️ Learning: Multithreading basics.

---

## **6. Callable**

👉 Assignment:

* Create a `FactorialTask` class implementing `Callable<Long>`.
* Use `ExecutorService` with `Future` to calculate factorial.
* Submit multiple tasks and print results.

✔️ Learning: Callable vs Runnable, return values from thread.

---

## **7. Iterable & Iterator**

👉 Assignment:

* Create a custom `MyArray<T>` collection.
* Implement `Iterable<T>`.
* Write your own `Iterator` to traverse elements.
* Test with `for-each` loop.

✔️ Learning: Custom collections, iteration mechanics.

---

## **8. Collection Interfaces (`List`, `Set`, `Map`, `Queue`)**

👉 Assignment:

* Take `List<Student>` → demonstrate duplicates allowed + ordering.
* Convert to `Set<Student>` → remove duplicates.
* Use `Map<Integer, String>` for student rollNo → name mapping.
* Use `Queue<String>` for ticket booking system simulation.

✔️ Learning: Collection framework fundamentals.

---

## **9. AutoCloseable & Closeable**

👉 Assignment:

* Create a class `MyResource` implementing `AutoCloseable`.
* Inside `close()`, print `"Resource Closed"`.
* Use it inside **try-with-resources** block.

✔️ Learning: Resource management.

---

## **10. Remote (RMI)**

👉 Assignment:

* Create a simple RMI project:

  * Interface `Calculator` (extends `Remote`) with `add`, `sub` methods.
  * Implement it on server side.
  * Call from client.

✔️ Learning: Remote Method Invocation basics.

---

## **11. EventListener**

👉 Assignment:

* Create a custom `ButtonClickListener` interface extending `EventListener`.
* Class `Button` should register listeners & notify them on click.
* Test by adding multiple listeners.

✔️ Learning: Event-driven programming.

---

## **12. Stream**

👉 Assignment:

* Create a `List<Employee>`.
* Use Stream API to:

  1. Filter employees with salary > 50k.
  2. Convert names to uppercase.
  3. Sort by salary.
  4. Collect into a new List.

✔️ Learning: Fluent API + Stream operations.

---

# 🚀 Final Real-World Project Assignment

👉 Build a **Mini E-commerce System** using interfaces:

* `Product` interface → classes `Book`, `Electronics`.
* `Payment` interface → classes `CreditCardPayment`, `UPIPayment`.
* `Discount` interface → different discount strategies.
* Use `Comparable` for sorting products by price.
* Use `Serializable` to save cart state.
* Use `Runnable` for sending confirmation emails in background.

---

