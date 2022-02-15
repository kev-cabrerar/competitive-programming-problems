var input = `7.0 5.0 7.0`;
let [a, b, c] = input.split(/[\s]/).map((x) => Number(x));

if (a < b + c && b < c + a && c < a + b) {
  console.log("Perimetro = " + (a + b + c).toFixed(1));
} else {
  console.log("Area = " + (((a + b) * c) / 2).toFixed(1));
}
