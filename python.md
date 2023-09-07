* from __future__ import annotations

* from [abc](https://docs.python.org/3.13/library/collections.abc.html) import [ABC](https://docs.python.org/3/library/abc.html?highlight=abc#abc.ABC), [abstractmethod](https://docs.python.org/3/library/abc.html?highlight=abstractmethod#abc.abstractmethod)

* from random import randrange

* from [typing](https://docs.python.org/3/library/typing.html?highlight=typing#module-typing) import [Any](https://docs.python.org/3/library/typing.html?highlight=any#typing.Any), [List](https://docs.python.org/3/library/typing.html?highlight=typing%20list#typing.List), [Optional](https://docs.python.org/3/library/typing.html?highlight=typing%20optional#typing.Optional)

* from collections.abc import Iterable, Iterator

* from datetime import datetime
* from random import sample
* from string import ascii_letters, digits

* import json
* from typing import Dict

* import copy

* from threading import Lock, Thread

## Import Packages



* [collections.abc](https://docs.python.org/3/library/collections.abc.html?highlight=collections%20abc#module-collections.abc)

To create an iterator in Python, there are two abstract classes from the built-in `collections` module - `Iterable`, `Iterator`.
We need to implement the `__iter__()` method in the iterated object (collection),
and the `__next__ ()` method in the iterator.

* [typing.Any, typing.List](https://docs.python.org/3/search.html?q=typing)

* [__future__](https://docs.python.org/3/library/__future__.html?highlight=__future_#module-__future__)

***

## Underscore

The underscore prefix is meant as a hint to another programmer that a variable or method starting with a single underscore is intended for internal use.
