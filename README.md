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
<li> <strong> WORA </strong> : Work Once Run Anywhere. </li>
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
