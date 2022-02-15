var input = `2.0 4.0 7.5 8.0
6.4`;
let lines = input.split(/[\s]/);
let res = (lines[0] * 2 + lines[1] * 3 + lines[2] * 4 + lines[3] * 1) / 10;
console.log("Media: " + res.toFixed(1));
if (res >= 7) {
  console.log("Aluno aprovado.");
} else if (res >= 5 && res <= 6.9) {
  console.log("Aluno em exame.");
  res = (res + Number(lines[4])) / 2;
  console.log("Nota do exame: " + Number(lines[4]).toFixed(1));
  if (res >= 5) {
    console.log("Aluno aprovado.");
  } else {
    console.log("Aluno reprovado.");
  }
  console.log("Media final: " + res.toFixed(1));
} else if (res < 5) {
  console.log("Aluno reprovado.");
}
