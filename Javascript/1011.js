var input = `3`;
var lines = input.split("\n");
let pi = 3.14159;
console.log(
  "VOLUME = " + ((4 / 3) * pi * Math.pow(Number(lines[0]), 3)).toFixed(3)
);
