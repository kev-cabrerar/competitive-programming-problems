var input = `2 3 2 6`;
var lines = input.split(/[\s]/);
let a = lines[0];
let b = lines[1];
let c = lines[2];
let d = lines[3];

if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 === 0) {
  console.log("Valores aceitos");
} else {
  console.log("Valores nao aceitos");
}
