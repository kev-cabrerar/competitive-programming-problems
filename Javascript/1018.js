var input = `1257`;
var lines = input.split("\n");
var num = lines[0];
let billetes = [100, 50, 20, 10, 5, 2, 1];
console.log(num);

for (let i in billetes) {
  console.log(
    parseInt(num / billetes[i]) + " nota(s) de R$ " + billetes[i] + ",00"
  );
  num %= billetes[i]; 
}
