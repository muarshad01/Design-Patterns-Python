# Design Patterns

[Python Design Patterns](https://refactoring.guru/design-patterns/python)

***

## Structural Design Patterns (ABCDF2P)

* [Adapter](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Adapter)

* [Bridge](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Bridge)

* [Composite](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Composite)

* [Decorator](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Decorator)

* [Facade](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Facade)

* [Flyweight](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Flyweight)

* [Proxy](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Structural_Design_Patterns/Proxy)

***

## Creational Design Patterns (ABFPS)

* [Abstract Factory](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Creational_Design_Patterns/Abstract_Factory)

* [Builder](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Builder)

* [Factory](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Creational_Design_Patterns/Factory)

* [Prototype](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Prototype)

* [Singleton](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Singleton)

***

## Behavioral Design Patterns (C2-I-M2-O-S2-TV)

* [Command](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/command)

* [Chain of Responsibility](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Behavioral_Design_Patterns/ChainOfResponsibility)

* [Iterator](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Behavioral_Design_Patterns/Iterator)

* [Memento](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Memento)

* [Mediator](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Mediator)

* [Observer](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Observer)

* [Strategy](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Strategy)

* [State](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/State)

* [Template](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Template)

* [Visitor](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Visitor)

***

# How to Install Python on MacOS

### 1. Install Homebrew.

```
$ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)" # 
```

### 2. Upgrade Homebrew

```
$ brew update && brew upgrade
```

### 3. Install Python

```
$ brew install python3
```

### 4. Check if Python has been installed successfull:

```
$ python3 --version
$ pip3 --version
$ which python3
```

Open a terminal application and type `pip3`. You will be able to see the help information from `pip3` only if the python installation is successful.

***

## Add VSCode Extensions

* Python: IntelliSense (Pylance), Linting, Debugging   ...
* Pylance: A performant, feature-rich language ...


* [Top 10 VSCode Extensions for More Productive Python Development](https://bas.codes/posts/best-vscode-extensions-python)
* [Top 10 VS Code Extensions For Python](https://www.geeksforgeeks.org/top-10-vs-code-extensions-for-python/)
* [The Best VS Code Extensions For Python Developers In 2022.](https://dev.to/wiseai/vs-code-extensions-for-python-developers-3n9b)

***

## Generating UML Diagrams

```
$ pip install pylint

$ pyreverse -o png <path_to_src>
```
