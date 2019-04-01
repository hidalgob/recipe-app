# Recipe App with Angular and Spring Boot

This app features a web page using Angular where you can create and list recipes with CRUD operations. The app has a server in Spring Boot using an in-memory H2 database which provides APIs with get, post, put and delete HTTP methods that the client consumes.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Node.js](https://nodejs.org/).

* [Getting Started](#getting-started)
* [Help](#help)
* [License](#license)

## Getting Started

To install this app, run the following commands on a terminal:

​```
git clone https://github.com/hidalgob/recipe-app.git
cd recipe-app
​```
This will get a copy of the project installed locally.

To run the server, cd into the `server` folder and run:
​```
./mvnw spring-boot:run
​```
To access the server database console, type `localhost:8080/h2_console` on your browser and connect to `jdbc:h2:mem:~/h2/testdb` as the JDBC URL with `sa` as username and no password.

To run the client, cd into the `client` folder and run:

​```
npm install && npm start
​```

To access the web app, type `localhost:4200` on your browser.

**Enjoy!**

*The web page is Portuguese(BR) language since this was created for a Brazilian Challenge.*

## Help

If you have any questions, e-mail me on my contacts provided on [GitHub](https://github.com/hidalgob)

## License

The MIT License (MIT)

Copyright (c) 2019 Bruno Hidalgo

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
