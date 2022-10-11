# log4j2 integration with springboot

### dependency
<pre>
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-log4j2:2.7.4'
}
</pre>

### dependency exclusion 
<pre>
configurations {
	implementation.exclude module: 'spring-boot-starter-logging'
}
</pre>
