var input = `7.0 5.0 7.0`;
let [a, b, c] = input.split(/[\s]/).map((x) => Number(x));
let list_sorted = [a, b, c].sort((x, y) => y - x);
[a, b, c] = list_sorted;

if (a >= b + c) {
  console.log("NAO FORMA TRIANGULO");
} else if (Math.pow(a, 2.0) == Math.pow(b, 2.0) + Math.pow(c, 2.0)) {
  console.log("TRIANGULO RETANGULO");
} else if (Math.pow(a, 2.0) > Math.pow(b, 2.0) + Math.pow(c, 2.0)) {
  console.log("TRIANGULO OBTUSANGULO");
} else if (Math.pow(a, 2.0) < Math.pow(b, 2.0) + Math.pow(c, 2.0)) {
  console.log("TRIANGULO ACUTANGULO");
}
if (a == b && b == c) {
  console.log("TRIANGULO EQUILATERO");
} else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
  console.log("TRIANGULO ISOSCELES");
}
