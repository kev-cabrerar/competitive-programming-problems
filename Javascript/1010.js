var input = `12 1 5.30
16 2 5.10`;
var lines = input.split(/[\s]/);
console.log(
  "VALOR A PAGAR: R$ " + (lines[1] * lines[2] + lines[4] * lines[5]).toFixed(2)
);
