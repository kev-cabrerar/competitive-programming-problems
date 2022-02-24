var input = `vertebrado
mamifero
onivoro`;
let lines = input.split("\n");

if (lines[0] == "vertebrado") {
  if (lines[1] == "ave") {
    if (lines[2] == "carnivoro") {
      console.log("aguia");
    } else {
      console.log("pomba");
    }
  } else {
    if (lines[2] == "onivoro") {
      console.log("homem");
    } else {
      console.log("vaca");
    }
  }
} else {
  if (lines[1] == "inseto") {
    if (lines[2] == "hematofago") {
      console.log("pulga");
    } else {
      console.log("lagarta");
    }
  } else {
    if (lines[2] == "hematofago") {
      console.log("sanguessuga");
    } else {
      console.log("minhoca");
    }
  }
}
