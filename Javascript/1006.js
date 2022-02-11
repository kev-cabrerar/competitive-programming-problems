var input = `10.0
10.0
5.0`;
var lines = input.split("\n");
let res = (lines[0] * 2 + lines[1] * 3 + lines[2] * 5) / 10;
console.log(`MEDIA = ${res.toFixed(1)}`);
