peso = prompt("escreva seu peso")
altura = prompt("escreva sua altura")
imc = peso / (altura * altura)

console.log("Seu IMC é", imc)

if (imc < 18.50) {
  console.log("Classificacao: Magreza")
  console.log("Grau de Obesidade: 0")
}

else if (imc < 24.99) {
  console.log("Classificacao: Normal")
  console.log("Grau de Obesidade: 0")
}

else if (imc < 29.99) {
  console.log("Classificacao: Sobrepeso")
  console.log("Grau de Obesidade: 1")
}

else if (imc < 39.99) {
  console.log("Classificacao: Obesidade")
  console.log("Grau de Obesidade: 2")
  console.log("Cuidado! Voce esta acima do peso recomendado pela OMS.")
}

else if (imc >= 40.00)
{
  console.log("Classificacao: Obesidade grave")
  console.log("Grau de Obesidade: 3")
  console.log("Cuidado! Voce esta acima do peso recomendado pela OMS.")
  console.log("É importante procurar um médico para avaliar sua saúde.")
}

