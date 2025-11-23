# Spring Core Topics

- Dependency Injection
- Inversion of Control
- Spring IOC Container and ApplicationContext interface

---

## Ways To Inject Dependency Using XML Configuration File

- Setter Injection
    1. Inserting Primitive Values
    2. Inserting Collections
    3. Inserting Objects

> We can insert data using `property` tag within a `bean`. Data can be passed with `value` as a tag, directly with *
*Property** or using **p schema**.

- Constructor Injection
    1. Inserting Primitive Values
    2. Inserting Collections
    3. Inserting Objects

> We can insert data using `constructor-arg` tag within a `bean`. Data can be passed with `value` as a tag, directly
> with **Property** or using **c schema**.

In case of passing data using constructor injection it can lead to _Ambiguity Problem_ i.e. Spring IOC may get confused
if it is not able to match the data types or number of arguments or which data should be kept first or second.

This problem can be overcome by specifying `type` for data type and `index` to map the position of values within *
*constructor-arg**.

---

## LifeCycle Methods

By default, all beans get these 2 methods:

- `public void int()`
- `public void destroy()`

LifeCycle Flow:

1. configure a `bean`
2. instantiate object and initialize object
3. calls `init` method
4. read data using `bean`
5. calls `destroy` method
6. end

The LifeCycle methods can be visualized in 3 ways

1. Using XML Configuration File
2. Using Interface
3. Using Annotation

---

## Autowiring in Spring
This is a **Spring** feature to automatically inject _dependencies_ during run time. This can be applied only on `Primitive Type` and `String`. It can be implemented in 2 ways:
1. Using XML Configuration
2. Using Annotation

`Autowiring` ways in XML:
1. no, this is the default
2. byName
3. byType
4. constructor

`Autowiring` ways using annotation `@Autowired`
1. Using on fields name.
2. Using on constructor
3. Using on setter function

`Ambiguity` in Autowiring:
If we create 2 beans of same class Spring will get confused which one to inject at run-time. To overcome this we can use `@Qualifier()` annotation. It gives unique names to run-time fields
