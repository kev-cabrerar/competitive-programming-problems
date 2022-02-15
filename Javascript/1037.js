var input = `25.01`;
var lines = input.split("\n");
let num = lines[0];

if (num >= 0 && num <= 25.0) {
  console.log("Intervalo [0,25]");
} else if (num > 25.0 && num <= 50.0) {
  console.log("Intervalo (25,50]");
} else if (num > 50.0 && num <= 75.0) {
  console.log("Intervalo (50,75]");
} else if (num > 75.0 && num <= 100.0) {
  console.log("Intervalo (75,100]");
} else {
  console.log("Fora de intervalo");
}
