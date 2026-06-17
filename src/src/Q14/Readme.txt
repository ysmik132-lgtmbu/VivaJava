A smart automation ecosystem built around a Java interface (SmartDevice) 
that defines a common contract of turnOn() and turnOff() methods. Both SmartFan 
and SmartLight provide their own implementations, demonstrating why interfaces 
are preferred over inheritance hierarchies for heterogeneous devices that share
behavior but not implementation.

