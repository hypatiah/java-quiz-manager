# java-quiz-manager

#### To setup h2 database:  
Download h2: http://www.h2database.com/html/download.html  
Unzip file, go to bin/ and click on file: for windows - h2.bat, for linux/mac - h2.sh  
May need to update xcode when try to open  

To run h2:
Go to terminal, `$ cd ~/downloads/h2/bin/`  
Then `$ sh (or try $ sh h2.sh)`

This will open an h2 window in your browser.
In the dialogue, put JDBC URL as: `{file path depending on your operating system}/java-quiz-manager`
For example:
`JDBC URL: jdbc:h2:~/java-quiz-manager`  

Add the same JDBC url to your application.properties file:  
for example:  
```
db.url=jdbc:h2:~/java-quiz-manager
db.username=sa
db.password=
```
