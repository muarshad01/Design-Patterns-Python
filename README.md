# Design Patterns

[Python Design Patterns](https://refactoring.guru/design-patterns/python)

***

## Structural Design Patterns

* [Proxy](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Structural_Design_Patterns/Proxy)

***

## Creational Design Patterns

* [Singleton](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Singleton)

* [Factory](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Creational_Design_Patterns/Factory)

* [Abstract Factory](https://github.com/muarshad01/Python-Design-Patterns/blob/main/Creational_Design_Patterns/Abstract_Factory)

* [Builder](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Creational_Design_Patterns/Builder)

## Behavioral Design Patterns

* [Iterator](https://github.com/muarshad01/Python-Design-Patterns/tree/main/Behavioral_Design_Patterns/Iterator)

***

## Install Python

First, install Homebrew.

```
$ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)" # 
```

Upgrade Homebrew

```
$ brew update && brew upgrade
```

Install Python

```
$ brew install python3
```

Make sure that python has been installed by following these steps:

* `$ python3 --version`
* `$ pip3 --version`
* `$ which python3`

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
