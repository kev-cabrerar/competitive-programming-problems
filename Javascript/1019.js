var input = `140153`;
var lines = input.split("\n");
let t = lines[0];
let hora = parseInt(t / 3600);
let min = parseInt((t % 3600) / 60);
let seg = parseInt(t % 60);
console.log(`${hora}:${min}:${seg}`);
