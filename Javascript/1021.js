var input = `576.73`;
var lines = input.split("\n");
var num = Number(lines[0]) + 0.001;
let billetes = [100, 50, 20, 10, 5, 2];
let monedas = [1.0, 0.5, 0.25, 0.1, 0.05, 0.01];
console.log("NOTAS:");
for (let i in billetes) {
  console.log(
    parseInt(num / billetes[i]) + " nota(s) de R$ " + billetes[i].toFixed(2)
  );
  num %= billetes[i];
}
console.log("MOEDAS:");
for (let i in monedas) {
  console.log(
    parseInt(num / monedas[i]) + " moeda(s) de R$ " + monedas[i].toFixed(2)
  );
  num %= monedas[i];
}
