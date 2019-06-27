var express = require('express');
var app = express();
var port = process.env.PORT || 8080;
var path = require('path');


//Controller for root
app.get("/", function(req, res) {
    res.sendFile(path.join(__dirname + '/templates/index.html'));
});

//GET controller for Form
app.get("/form", function(req, res) {
    res.sendFile(path.join(__dirname + '/templates/form.html'));
});

//POST controller for Form
app.post("/form", function(req, res){
    console.log("i recieved a POST req");
});

app.listen(port, function() {
    console.log('Server running at http://localhost:'+port+'/');
});


