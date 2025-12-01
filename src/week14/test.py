class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        print("Hello, my name is " + self.name)
    def __str__(self):
        return self.name + " " + str(self.age)

class Student(Person):
    def __init__(self, fname, age,credits):
        Person.__init__(self, fname, age)
        self.credits=credits
    def __str__(self):
        return Person.__str__(self)+" "+str(self.credits)

p1 = Person("Emil", 36)

print(p1.name)
print(p1.age)
p1.greet()
print(p1)
s1=Student("bob",1,2)
print(s1)