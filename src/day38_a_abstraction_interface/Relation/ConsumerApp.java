package day38_a_abstraction_interface.Relation;

import day38_a_abstraction_interface.shopping.Shipping;

//  going from interface to interface is INHERITANCE and we use "extends"
// since these are interfaces they do not follow the same roles as classes,
// so we can extend multiple interfaces

//We are passing the methods from AllowUserToSell and Shipping interfaces to ConsumerApp interface

public interface ConsumerApp extends AllowUserToSell, Shipping {



}

// class - class -------> extends
// class - interface ---> implements
//interface - interface ---> extends


abstract class TestA implements Shipping, AllowUserToSell {

}
