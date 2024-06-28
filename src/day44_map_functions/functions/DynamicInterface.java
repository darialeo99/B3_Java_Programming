package day44_map_functions.functions;
// I want to make Funtional Interface to be able to work with all different data types
// <E> ---> Generic
// <> ----> defines that it will work with any datatype - any object can be used
// T -----> T is a common name used

@FunctionalInterface
public interface DynamicInterface <T> { // will work with any datatype

    void test(T t);




}
