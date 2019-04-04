# ISTE422-Project

<!-- Navigate to the right folder -->
<!--
    See the test text files for the individual test plans.
	Place folder on Desktop
	Open terminal
	Enter following command
-->

cd Desktop/ISTE422-Project/testPlan	


<!-- Enter the following commands to compile and then run the programs -->

<!-- For src.CreateDDLMySQLTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \src.CreateDDLMySQLTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore src.CreateDDLMySQLTest



<!-- For src.EdgeConvertCreateDDLTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \src.EdgeConvertCreateDDLTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore src.EdgeConvertCreateDDLTest



<!-- For src.EdgeFieldTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \src.EdgeFieldTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore src.EdgeFieldTest



<!-- For src.EdgeTableTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \src.EdgeTableTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore src.EdgeTableTest
