var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");
console.log(
  "TOTAL = R$ " +
    (parseFloat(lines[1]) + parseFloat(lines[2]) * 0.15).toFixed(2)
);
