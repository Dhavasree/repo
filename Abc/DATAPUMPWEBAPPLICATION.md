# DATAPUMP (WEB APPLICATION)


### Softwares Required for Datapump 



 ## 1.[JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html?printOnly=1)
      
      * Download JDK from this link (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html?printOnly=1) or click the heading JDK.
      *  To set the JDK path in environment varaiable(see maven).
 
 

## 2. [Maven](https://downlinko.com/download-install-apache-maven-3-3-9-windows.html)

       * Download Apache Maven from this link(https://downlinko.com/download-install-apache-maven-3-3-9-windows.html) or Click the heading Maven.
       * Right click Computer ->Choose properties -> Advanced system settings -> Enviroment variable(in system property dailog box) -> there is two option named user variables and system variables, in user varaiables click New -> in variable name textbox ,type value as PATH and in variable value textbox, type value as %PATH%;C:\Program Files\Java\jdk1.8.0_181\bin;D:\tools\apache-maven-3.3.9\bin; (choose the path of jdk and maven upto bin) -> Click Ok.
       * In environment variables dialog box, In user variables Click New -> in variable name taxtbox, type values as JAVA_HOME and in variable value textbox, type value as C:\Program Files\Java\jdk1.8.0_181 (choose the path of jdk only) -> click ok.

  

## 3.  [Eclipse](https://www.eclipse.org/downloads/packages/release/neon/2/eclipse-ide-java-developers)


     * Download eclipse from this link (https://www.eclipse.org/downloads/packages/release/neon/2/eclipse-ide-java-developers) or Click the heading eclipse.
     * In Eclipse folder, Click the eclipse.exe and click Browse and choose the folder for workspace.
     * Download project from this github link(https://github.com/Dhavasree/CoreJava/tree/master/SourceAndDestinationConnection)
     * Unzip the downloaded project.
     * In Eclipse,Click File-> Import-> Choose (Existing Maven Project) under Maven folder -> Next -> Browse (select the project location) -> Ok -> Finish .



   ## 4. [Tomcat](https://tomcat.apache.org/download-70.cgi) 

     * Download Tomcat from this link(https://tomcat.apache.org/download-70.cgi) or click the heading Tomcat.
     * In Eclipse, there is option named server in bottom,Click (no servers are available.Click this link to create a new server) -> choose Tomcat v7.0 server( depend on version you have to choose) -> Next -> Finish.



## 5. [H2 database](http://www.h2database.com/html/download.html)

         * Download H2 database from this link (http://www.h2database.com/html/download.html) or Download database depend on your requirement.
         * Unzip the downloaded database.
         * Open the database and click connect.
      
      
   ### Script Setup in Database
   
1. Create Two schema for source and destination table
   * create schema source_schema;  --> for source table
   * create schema destination_schema; --> for destination table

 2. Create query under schema for both tables.
      * create table source_schema.Employee( id int,firstname varchar2(20),lastname varchar2(30), age int(2)); --> for source table
      * create table source_schema.Employee( id int,firstname varchar2(20),lastname varchar2(30), age int(2),state varchar2(20)); --> for destination table


### Run the Project in Eclipse

1. Right Click the Project -> choose Run as -> Click Run on server -> choose Tomcat v7.0 server(depend on version) -> Click Next -> click Finish.
2. Webpage displayed in the browser.
   
 
     

