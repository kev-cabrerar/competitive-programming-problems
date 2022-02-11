var input = `7 14 106`;
var lines = input.split(/[\s]/).sort((a, b) => Number(b) - Number(a));
console.log(lines[0] + " eh o maior");
