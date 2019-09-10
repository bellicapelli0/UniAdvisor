# UniAdvisor

UniAdvisor is a service to help find places to study in Rome, mostly in the Center of the city and in buildings of La Sapienza, University of Rome.
This is part of a project for "Reti di Calcolatori", a class taught by Professor Andrea Vitaletti.

Once logged in, the user can either look for a specific location they already know of, or input their coordinates to find a list of the three closest locations. 

On the location page, the user can find a map of the location, and some important information like the availability of Wi-Fi, electricity plugs and AC.
Users are also able to give a 1 to 5 star rating to give their opinion on the location.

# How to start

Once downloaded, you will need to provide your own oauth client-id and client-secret, and input them in the file application-oauth2.properties found in /src/main/resources/.

Compile it with maven using ```mvn package``` command on the project folder. Compilation output is "uniadvisor-1.0.jar".

Run it using ```java -jar uniadvisor-1.0.jar init``` to initialize the database and then ```java -jar uniadvisor-1.0.jar prod``` to run the program itself.

Application tests are provided in /src/test/python/ folder.

# API endpoints
The application exposes several API endpoints that can be used by the user directly, these being:

<h4>uniadvisor.com:8080/api/location/</h4>
This endpoint asks for the parameter <b>name</b> and returns the information of the location with that name.

<h4>uniadvisor.com:8080/api/coordinates/</h4>
This endpoint asks for the parameters <b>lat</b> and <b>lng</b> and finds the closest location to the given coordinates.

<h4>uniadvisor.com:8080/api/threeClosest/</h4>
This endpoint asks for the parameters <b>lat</b> and <b>lng</b> and finds the three closest locations to the given coordinates.

The above mentioned APIs will default of the Dipartimento di ingegneria informatica e automatica 'Antonio Ruberti' when no parameters are provided.

<h4>uniadvisor.com:8080/api/stars/</h4>
This endpoint asks for the parameters <b>location</b> and <b>rate</b> and will recieve the rating specified, update the average rating for the given location, and return it.
In case only the <b>location</b> parameter is specified, the average rating will be returned, without applying any changes to it.

This api is intended only for internal use, but is nonetheless available for testing.