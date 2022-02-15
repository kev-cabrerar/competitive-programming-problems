var input = `6 25`;
let [a, b] = input.split(/[\s]/);
console.log(a % b === 0 || b % a === 0 ? "Sao Multiplos" : "Nao sao Multiplos");
