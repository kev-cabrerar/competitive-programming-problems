var input = `4.5 -2.2`;
let linea1 = input.split(/[\s]/);
let x = linea1[0];
let y = linea1[1];

if (x == 0 && y == 0) {
  console.log("Origem");
} else if (x == 0 && y != 0) {
  console.log("Eixo Y");
} else if (x != 0 && y == 0) {
  console.log("Eixo X");
} else if (x > 0 && y > 0) {
  console.log("Q1");
} else if (x < 0 && y > 0) {
  console.log("Q2");
} else if (x < 0 && y < 0) {
  console.log("Q3");
} else if (x > 0 && y < 0) {
  console.log("Q4");
}
