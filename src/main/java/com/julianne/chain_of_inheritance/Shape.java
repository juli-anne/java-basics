package com.julianne.chain_of_inheritance;

import com.julianne.objects.Rectangle;

// defining a sealed class - this is the super
// it permits direct inheritance to Rectangle and Circle
//public sealed class Shape permits Rectangle, Circle {}

// in Rectangle.java defining a sealed class that inherits from Shape and allows inheritance to Square (from Rectangle)
// permitted subclasses must be sealed, non-sealed or final
// public sealed class Rectangle extends Shape permits Square {}
// public class Circle extends Shape {}

// non-sealed means it's open to be extended by any other class
// those who inherit from Circle do not have to label themselves as non-sealed etc.
// use non-sealed when there is no more need to continue the permission list
// "I inherited from a sealed class, but I want to be an open class", brake the chain
// public non-sealed class Circle extends Shape {}

// final means the class can't have any subclasses - be inherited from
// public final class Square extends Rectangle {}


// about inheritance
// constructors and privates are not inherited
// finals are inherited but can't be overridden
// public - everyone, protected - in the same package and subclass, private - in the class


