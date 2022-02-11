var input = `400`;
var lines = input.split("\n");
let edad = lines[0];
let ano = parseInt(edad / 365);
let mes = parseInt((edad % 365) / 30);
let dia = parseInt((edad % 365) % 30);
console.log(`${ano} ano(s)`);
console.log(`${mes} mes(es)`);
console.log(`${dia} dia(s)`);
