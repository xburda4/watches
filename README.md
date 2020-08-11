# watches

For this project to run you must have postgresql server turned on. In application.properties you can change url, port, user and password values. 
Currently PostgreSql is set to localhost:5432, with name and password being "postgres". 

You can send POST request to http://localhost:8080/ to create new entry to DB. Accepted headers are "Contenty-type: application/json" and "Content-type: application/xml". 
In the body, there should be all the info included in Task pdf. These are "type", "price", "description" and "fountain". Price will be validated so that it cannot be negative integer number or zero and Fountain will be validated so that it can be decoded by Java Base64.Decoder and that the length of the field is lower than 255.
Successful POST request will return 201 Created response and ID of the newly created object.

You can send GET request to http://localhost:8080/{id}, to show object saved in DB. If object with this id does not exist, you will get 404. 
You can send GET request to http://localhost:8080/ returning 200 OK, so you can check if server is running and is accessible.

You can run this project by "mvn spring-boot:run" command.
