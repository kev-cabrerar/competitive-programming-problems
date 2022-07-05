var input = `2001`;
let lines = input.split("\n");
let salario = Number(lines[0]);

if (salario >= 0 && salario <= 2000) {
  console.log("Isento");
} else if (salario > 2000 && salario <= 3000) {
  console.log("R$", ((salario - 2000.0) * 0.08).toFixed(2));
} else if (salario > 3000 && salario <= 4500) {
  console.log(
    "R$",
    (
      (salario - 2000.0 - (salario - 3000.0)) * 0.08 +
      (salario - 3000.0) * 0.18
    ).toFixed(2)
  );
} else if (salario > 4500) {
  console.log(
    "R$",
    (
      (salario - 2000.0 - (salario - 3000.0)) * 0.08 +
      (salario - 3000.0 - (salario - 4500.0)) * 0.18 +
      (salario - 4500.0) * 0.28
    ).toFixed(2)
  );
}
