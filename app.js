var express = require('express');
var app = express();
var port = process.env.PORT || 8080;
var path = require('path');

app.get("/", function(req, res) {
    res.sendFile(path.join(__dirname + '/templates/index.html'));
});

app.get("/form", function(req, res) {
    res.sendFile(path.join(__dirname + '/templates/form.html'));
});

app.post("/form", function(req, res){
    console.log("i recieved a POST req");
});

app.listen(port, function() {
    console.log("Listening on " + port);
});

//console.log('Server running at http://localhost:8080/');
