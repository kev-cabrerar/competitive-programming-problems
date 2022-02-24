var input = `400.00`;
let lines = input.split("\n");
let num = Number(lines[0]);
let salario, porcentaje;

if (num >= 0 && num <= 400) {
  porcentaje = 0.15;
}
if (num > 400 && num <= 800) {
  porcentaje = 0.12;
}
if (num > 800 && num <= 1200) {
  porcentaje = 0.1;
}
if (num > 1200 && num <= 2000) {
  porcentaje = 0.07;
}
if (num > 2000) {
  porcentaje = 0.04;
}
salario = num * (porcentaje + 1);
console.log("Novo salario:", salario.toFixed(2));
console.log("Reajuste ganho:", (salario - num).toFixed(2));
console.log("Em percentual:", (porcentaje * 100).toFixed(0) + " %");
