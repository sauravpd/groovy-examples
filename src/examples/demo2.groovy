package examples
class MyClass{
	void doSometning(Closure closure) {
		closure.call();
	}
}

myObj=new MyClass();
myObj.doSometning { 
	println new Date();
}