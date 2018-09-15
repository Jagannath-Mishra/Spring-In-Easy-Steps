# Spring-In-Easy-Steps
## Initializing Bean Value As Element

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

	<bean name="emp" class="com.jagan.spring.springcore.Employee">
		<property name="id">
			<value>10</value> // value as element
		</property>

		<property name="name">
			<value>Jaga</value>
		</property>
	</bean>
</beans> 
	
```

## Initializing Bean Value As Attribute

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

	<bean name="emp" class="com.jagan.spring.springcore.Employee">
		<property name="id" value="10" /> // Value as Attribute
		<property name="name" value="Ramesh"/>
	</bean>
</beans> 
```


## Initializing Bean Value as P-Schema /  P-NameSpace

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p" // Using this P-Schema
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

	<bean name="emp" class="com.jagan.spring.springcore.Employee" p:id="100" p:name="Gari"> // Using P - Syntax
	</bean>
</beans> 
```
