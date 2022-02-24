var input = `2 16`;
let [inicio, fin] = input.split(/[\s]/).map((x) => Number(x));
if (inicio == fin) {
  console.log("O JOGO DUROU 24 HORA(S)");
} else if (inicio > fin) {
  console.log("O JOGO DUROU " + (24 - inicio + fin) + " HORA(S)");
} else if (inicio < fin) {
  console.log("O JOGO DUROU " + (fin - inicio) + " HORA(S)");
}
