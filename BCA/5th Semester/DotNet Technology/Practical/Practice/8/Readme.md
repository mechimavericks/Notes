# For Creating the NameSpace File, You Need to Compile it with following Command
 ### For Linux USer with mono-csc
 ```bash
#  For Compiling the namespaces to .dll file
 mono-csc A.cs /t:library

#  For Executing the namespaces used cs file
mono-csc MyApp.cs /r:A.dll
 ```

 ### For Windows User with csc
 ```bash
#  For Compiling the namespaces to .dll file
csc /t:library A.cs
 
#  For Executing the namespaces used cs file
csc /r:A.dll MyApp.cs
 ```

 Note: Here the A.cs is the File used to create the namespace and MyApp.cs is the file where the namespace is used. 