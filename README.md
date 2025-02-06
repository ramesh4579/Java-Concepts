# Java Fundamentals

## 4 Pillars of OOP

1. **Data Abstraction** - Hiding the implementation and exposing only required details.
E.g. Car brakes

2. **Data Encapsulation** - Bundle data and code working on it in a single unit.
E.g. Medicine capsule

3. **Inheritance** - Inheriting data and behaviors.

4. **Polymorphism** - Multiple behaviors.


## Relationships
<ol>
<li> <strong> IS-A </strong>: Inheritance </li>
<li> <strong> HAS-A </strong>: When one class has the reference(object) of the other class. Can be One-2-One, One-2-Many and Many-2-Many. </li>
<strong> HAS-A </strong> relationship can be of two types: 
<ol>
<li> <strong>Aggregation </strong>: Weak relationship: destroying one doesn’t affect another. </li>
<li> <strong>Composition: </strong> Strong relationship: destroying one destroys the other too. </li>
</ol>
</ol>

<ul>
<li> Java is a platform independent high level and Object-Oriented Programming language. </li>
<li> <strong> WORA </strong> : Write Once Run Anywhere. </li>
</ul>

## Three important components of JAVA
![java-components](https://github.com/ramesh4579/Java-Concepts/blob/main/temp1.png)

## Three specification of Java libraries
<ol>
<li> <strong> JSE </strong>: Java Standard Edition (Core Java)</li>
<li> <strong> JEE </strong>: Jakarta Enterprise Edition</li>
<li> <strong> JME </strong>: Java Mobile Edition</li>
</ol>

**Interview Question**
1. Why we can have only 1 public class in a java file and name of the class and filename matches.
This is because JVM needs to call public main method of a public class to execute java program, if suppose there can be
multiple public java classes within the same file JVM will need to scan all those files to get to main file, therefore java put
this restriction to have only 1 public class in a java file.

## Data types
Four types of primitive data types
<ol>
<li> Integral Numbers</li>
<ol>
<li>byte</li>
<li>short</li>
<li>int</li>
<li>long</li>
</ol>
<li> Decimal Numbers</li>
<ol>
<li> float </li>
<li> double </li>
</ol>
<li> char </li>
<li> boolean </li>
</ol>

<ul>
<li> Widening (Implicit, Automatic) conversions </li>
<li> Narrowing (Explicit) conversion </li>
<li> Compound assignment operator does implicit conversion </li>
<li> Increment operator has higher precedence than any operator</li>
</ul>

## Bitwise Operators
<ul>
<li> Bitwise operators can be applied to byte, short, int and long data types </li>
</ul>

<ol>
<li> And operator (&) </li>
<li> Or operator (|) </li>
<li> Xor operator (^) </li>
<li> Not operator (~) </li>
<li> Left Shift operator (<<) </li>
<li> Right Shift operator (>>) </li>
<li> Unsigned Right Shift operator (>>>): replaces left most bit with zeros </li>
</ol>

<ul>
<li> <strong> Jagged Array:  </strong>  Array of array of different lengths.</li>
</ul>

<ul>
<li> <strong> Upcasting:  </strong>  Lower hierarchy object is referenced by upper hierarchy object reference.</li>
  <li> <strong> Downcasting:  </strong>  You can do excplicity.</li>
</ul>

<ul>
<li> Class can have only public or default access modifier.</li>
</ul>

| Context/Access Modifier | private | default (no modifier) | protected | public |
| --- | --- | --- | --- | ---| 
| Same class | Yes | Yes | Yes | Yes |
| Same Package | No | Yes | Yes | Yes |
| Subclass (same package) | No | Yes | Yes | Yes |
| Subclass (different package) | No | No | Yes | Yes |
| Different Package (non-subclass) | No | No | No | Yes |

## Static Keyword

<ul>
<li> It can be applied to variables, methods, blocks and nested classes. </li>
<li> Used for memory management. </li>
<li> Non static references cannot be called directly inside static. </li>
<li> this and super cannot be used inside static. </li>
<li> Static variables are initialized before object instances. </li>
<li> Static blocks are executed first after class loading. Used for static initialization. </li>
</ul>

<ul>
<li> Constructors cannot be final or overidden. </li>
</ul>

## Interfaces
<ul>
<li> Starting Java8 Interfaces can have static and default methods. </li>
<li> If all methods of a class are static we can define as interface. Can be used to provide some info. </li>
<li> Default implementation of a function can be done using default method. You can add it to interface without breaking multiple implementation classes. </li>
<li> this can be accessed inside default method, can be accessed using implementation class reference. </li>
</ul>

## Inner Classes

<ol>
<li> Member Inner Class</li>
<li> Static Nested Class</li>
<li> Local Inner Class</li>
<li> Anonymous Inner Class</li>
</ol>

<ul>
<li>Anonymous inner class is used when we want to implement an interface or subclass a parent class on the fly without creating a separate class</li>
</ul>

## Java Enums

<ul>
<li> At compile time, Enums become final public class. Each member of the enum is the instance of the enum itself.</li>
<li> Enums can have members and constructors and functions also.</li>
<li> Enums inside class are inherently static.</li>
</ul>

## Java Exceptions

<ul>
<li> try with resources will close classes automatically that are implementing Autocloseable interface.</li>
</ul>

## Java Multithreading

<ul>
<li> Five states of a thread: NEW, RUNNABLE, RUNNING, BLOCKED/WAITING, TERMINATED</li>
<li> Thread.yield method is used to request JVM scheduler to give chances to other threads also.  </li>
<li> Daemon threads run in background, JVM will not wait for its execution if other threads terminates daemon thread will also terminate. </li>  
</ul>

## Syncronization
<ul>
<li>  <strong> Mutual exclusion: </strong> Only 1 thread is accessing the shared resource or critical code. </li>
<li> 2 types of locks: Intrinsic and Explicit  </li>
<li> <strong> Intrinsic:  </strong> These are built into every object in Java. When using synchronized you are using automatic locks. </li>
<li> <strong> Explicit:  </strong> Advanced locks, can be accessed uisng Lock class. </li>
<li> <strong> ReentrantLock: </strong>   You can re enter the lock again.</li>
<li> Fair lock you will get resources in the order you requested.</li>
<li> Disadvantages of synchronization: No fairness guranteed, Idefinate blocking, No interruptability functionality, no read/write segregation.</li>
<li> ReentrantReadWriteLock will not lock read operations if no other thread is writing. </li>
</ul>

## DeadLock
<ul>
<li>  Threads are waiting idefinately on each other . </li>

## Thread Communication
<ul>
<li> Wait, notify and notifyAll</li>
<li> can be called within a synchronized context.</li>
</ul>

<ul>
  <li><strong> Functional interface: </strong> Interfaces with single abstract method. </li>
  <li><strong>Lambda expression: </strong> Anonymous function. </li>
</ul>

## Thread Pool
<ul>
  <li>Collection of pre-intialized threads.</li>
  <li>Better resource management</li>
  <li>Response time</li>
  <li>Control over thread count</li>
</ul>

<ul>
  <li><strong> Volatile: </strong> No local thread cache, will be fetched from the main memory. </li>
</ul>

<ul>
  <li><strong>CountDownLatch</strong> is used when we want to wait one or more threads to finsih execution. It cannot be reused.</li>
  <li><strong>CyclicBarrier</strong> can be reused.</li>
  <li><strong>CompletableFuture</strong> to perform async tasks.</li>
</ul>

## Java Generics
<ul>
  <li>Genric types allow you to define a class, interface or method with placeholders (type parametetrs) for the data type they will work. </li>
  <li> Java does not support generic exceptions due to type erasure. </li>
</ul>

<ul>
  <li>StringBuffer is threadsafe but StringBuilder is not.</li>
</ul>
