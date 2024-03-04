# Design Patterns

* [Python Design Patterns](https://refactoring.guru/design-patterns/python)
* [Python Design Patterns by Brandon Rhodes](https://python-patterns.guide/)

***

## Creational Design Patterns (AB---FPS)

* [Abstract Factory](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Creational_Design_Patterns/Abstract_Factory) -- Feb 27, 2024
  
* [Builder](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Builder) -- Feb 27, 2024
  
* [Factory Method](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Creational_Design_Patterns/Factory) -- Feb 27, 2024
  
* [Prototype](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Prototype) -- Feb 27, 2024
  
* [Singleton](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Singleton) -- Feb 27, 2024

***

## Structural Design Patterns (ABCD-F2-P)

* [Adapter](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Adapter) -- Feb 27, 2024

* [Bridge](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Bridge) -- March 03, 2024

* [Composite](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Composite) -- March 01, 2024

* [Decorator](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Decorator) -- March 03, 2024

* [Facade](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Facade) -- March 01, 2024

* [Flyweight](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Structural_Design_Patterns/Flyweight) -- March 01, 2024

* [Proxy](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Structural_Design_Patterns/Proxy) -- Feb 27, 2024

***

## Behavioral Design Patterns (C2-I-M2-O-S2-TV)

* [Chain of Responsibility](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Behavioral_Design_Patterns/ChainOfResponsibility) -- Feb 29, 2024

* [Command](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/command)

* [Iterator](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Behavioral_Design_Patterns/Iterator) -- Feb 29, 2024

* [Memento](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Memento) -- Feb 29, 2024

* [Mediator](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Mediator)

* [Observer](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Observer) -- March 01, 2024

* [Strategy](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Strategy)

* [State](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/State) -- Feb 29, 2024

* [Template](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Template) -- Feb 29, 2024

* [Visitor](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Behavioral_Design_Patterns/Visitor) -- March 01, 2024

***
# How to Install Python on Windows 11

* [How to Install Python 3 on Windows](https://www.youtube.com/watch?v=0DQsjE8vMpc)

```
$ C:\Users\<user-name>\python3 --version
```
* The above command returns nothing.

```
$ C:\Users\<user-name>\where python3
```

* The above commands shows python executable path at: `C:\Users\<user-name>\AppData\LocalMicrosoft\WindowsApps\python3.exe`


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

***

## Object-Oriented Programming in Python vs Java

* [Object-Oriented Programming in Python vs Java](https://realpython.com/oop-in-python-vs-java/)

***

## Python Code Formatting

```
$ pip install black
$ black  {source_file_or_directory}

$pip install pylint
$ pylint {source_file}
```

* Extensions -> search `black` -> `Black Formatter (Microsoft)`
* Extensions -> search `isort` -> `isort (Microsoft)`

***
