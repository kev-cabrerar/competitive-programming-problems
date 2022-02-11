var input = `10.0
10.0
5.0`;
var lines = input.split("\n");
let res = (lines[0] * 3.5 + lines[1] * 7.5) / 11;
console.log(`MEDIA = ${res.toFixed(5)}`);
