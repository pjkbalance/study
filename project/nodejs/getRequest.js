/**
 * Created by jiakang on 2018/8/15.
 */
var http = require('http');
var util = require('util');
var url = require('url');

http.createServer(function(request, response) {
    response.writeHead(200, {
        "Content-Type" : "text/plain"
    });
    console.log(request.url);
    var params = url.parse(request.url, true).query;
    response.write("web name: ", params.name);
    response.write("\n");
    response.write("web url: ", params.url);
    response.end();
}).listen(8888);

console.log('project started')