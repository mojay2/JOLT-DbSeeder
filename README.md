# JOLT-DbSeeder
This is a script to populate the database for the web project JOLT
Instructions for use:
1. Create a database named JoltDB
2. Download and open this project in netbeans 
3. Add the necessary JAR Files to project libraries
    - commons-codec-1.9.jar
    - derbyclient.jar
4. Run File JoltDbScript.java

The script will automatically create and populate tables. You may also reset the table values by running it again, as it also drops the tables if it exists.
