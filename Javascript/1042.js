var input = `-5 -1 7`;
let [num1, num2, num3] = input.split(/[\s]/).map((x) => Number(x));
let linea1_sorted = Array.from([num1, num2, num3]).sort((a, b) => a - b);
console.log(`${linea1_sorted[0]}\n${linea1_sorted[1]}\n${linea1_sorted[2]}\n`);
console.log(`${num1}\n${num2}\n${num3}`);
