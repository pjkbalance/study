/**
 * Created by jiakang on 2018/8/15.
 */
var util = require("util");
function Person() {
    this.name = 'jk';
    this.toSource = function() {
        console.log(this.name);
    }
}

var obj = new Person();
console.log(util.inspect(obj));
console.log("=====");
console.log(util.inspect(obj, true));
console.log("=====");
console.log(util.inspect(obj, true, 1));
console.log("=====");
console.log(util.inspect(obj, true, 2, true));