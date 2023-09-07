* from __future__ import annotations
* from abc import ABC, abstractmethod
* from random import randrange
* from typing import Any, List, Optional

* from collections.abc import Iterable, Iterator

* from datetime import datetime
* from random import sample
* from string import ascii_letters, digits

* import json
* from typing import Dict

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
