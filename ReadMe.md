# Value As Element

```

	<bean name="emp" class="com.jagan.spring.springcore.Employee">
		<property name="id">
			<value>10</value> // value as element
		</property>

		<property name="name">
			<value>Jaga</value>
		</property>
	</bean>
```

# Value As Attribute


	<bean name="emp" class="com.jagan.spring.springcore.Employee">
		<property name="id" value="10" /> // value as attribute
		<property name="name" value="Ramesh"/>
	</bean>
