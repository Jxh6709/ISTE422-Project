# ISTE422-Project

<!-- Navigate to the right folder -->
<!--
    See the test text files for the individual test plans.
	Place folder on Desktop
	Open terminal
	Enter following command
-->

cd Desktop/submission


<!-- Enter the following commands to compile and then run the programs -->

<!-- For CreateDDLMySQLTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \CreateDDLMySQLTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore CreateDDLMySQLTest



<!-- For EdgeConvertCreateDDLTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \EdgeConvertCreateDDLTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeConvertCreateDDLTest



<!-- For EdgeFieldTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \EdgeFieldTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeFieldTest



<!-- For EdgeTableTest.java -->

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \EdgeTableTest.java

java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeTableTest
