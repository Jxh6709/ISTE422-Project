Run the following commands to compile the files:
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester.java
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeTableTest.java
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeFieldTest.java

Run the following to display the help dialog:
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -h

Run the following to run a single test on a table with id '1' and name 'name'
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -n "1|name"

Run the following to run the tests stored in the testing .txt file
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar MainTester -f "testInput.txt"