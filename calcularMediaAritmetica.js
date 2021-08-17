valores = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
soma = 0 

for (contador = 0; contador < valores.length; contador++) {
  soma += valores[contador]
}

media = soma / valores.length
console.log(media)

