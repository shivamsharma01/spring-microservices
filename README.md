# spring-microservices
in28minutes spring microservices


when creating a duplicate instance
in vm arguments write
	-Dserver.port=XXXX
	
	@EnableDiscoveryClient vs @EnableEurekaClient
	
	both are same 
	@EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath
	@EnableEurekaClient is a specific discovery service and lives in spring-cloud-netflix and works only for eureka
	
	
install rabbitmq
install erlang
set RABBIT_URI=amqp://localhost
java -jar zipkin-server-2.12.9-exec.jar
open zipkin console localhost:9411
