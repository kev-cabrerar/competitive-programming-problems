var input = `3 2`;
var lines = input.split(/[\s]/);
let precios = [4.0, 4.5, 5.0, 2.0, 1.5];
let product = Number(lines[0]);
let qtd = Number(lines[1]);
console.log("Total: R$ " + (precios[product - 1] * qtd).toFixed(2));
