var input = `10.0 20.1 5.1`;
var lines = input.split(/[\s]/);
let a = lines[0];
let b = lines[1];
let c = lines[2];

if (b * b - 4 * a * c < 0 || 2 * a === 0.0) {
  console.log("Impossivel calcular");
} else {
  console.log(
    "R1 = " + ((-b + Math.sqrt(b * b - 4.0 * a * c)) / (2 * a)).toFixed(5)
  );
  console.log(
    "R2 = " + ((-b - Math.sqrt(b * b - 4.0 * a * c)) / (2 * a)).toFixed(5)
  );
}
