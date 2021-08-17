nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", "Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", "Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", "Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", "Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", "Leonardo", "Isadora", "Noah", "Lorena","Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

nomeComum = false
meuNome = prompt("Digite seu nome")

for (contador = 0; contador < nomesComuns.length; contador++) {
  if (meuNome == nomesComuns[contador]) {
      nomeComum = true
      break
    }
} if (nomeComum) {
    console.log("É, nome comum :P")
} else {
    console.log("Diferentão, hein? XD")
}