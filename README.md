# javaEssentials

Basics - Class,Methods,Variables,Construcot,Strings,Constants,Erums,etc.

Control Structures - Switch,For,If..Else,For Each

OOP Concepts - Inheritance,Abstraction,Interface,Polymorphism,etc.

Access Modifiers - Private,Public ect.

Exception Handling

Part1 Basics - Package,Class,Method,Data types : Primitive and Reference,Initializing variables,Constructor (with arguements),static Keyword (Shared between all objects),"final" Keyword (assign value only once),Constants,Enum (An enum is a special "class" that represents a group of constants,"return" keyword,"this" keyword (Return class object),Strings,Data type conversions.

**Encapsulation:** 
-------------

Wrapping up of data under a single unit! The data is protected!

How?
-By making class attribute (or variables) private
-By making methods as private

Advantages:

-Data hiding
-Flexibilty to use variable as read only or write only
-Reusability

Polymorphism
------------
Ability of an object to take many forms

How? By Overriding or Overloading methods.

Method Overriding :

- Allows a subclass to provide a specific implementation of a method that is already provided by its superclass
- Method in subclass should have the same name, same signature, and same return type(or sub-type) as the method in its superclass

Method OVerloading :

- Allows different methods to have the same name,but different signatures where the signature can differ by the number of input parameters or type of input parameters or both

Polymorphism Types :

-Runtime polymorphism or Dynamic method dispatch : call resolved at runtime based on type of the object being referred to at the time the call occurs
E.g. Method Overriding
-Compile time polymorphism: Call resolved at compile time
E.g. Method Overloading

Notes:
-final methods cannot be overridden
-static methods cannot be overridden (method hiding)

Abstraction:
============
Hide details and show only essential information

abstract Class:
-provides partial abstraction
-Abstract method is declared with out implementation
-Abstract class can not be directly instantiated
-Subclass can access abstract class using extend keyword
-Subclass must implement all abstract methods i.e. overriding is compulsory
-Abstract class can have parameterized constructor

Adv :
Reduces complexity by hiding implementation
Better viewing
Avoid code duplication and promotes reusability
Increases security by providing only important details to the user

E.g.
Shapes: Abstract
Triangle: Subclass1
Square: Subclass2