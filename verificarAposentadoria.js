colaboradores = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
idades = [69, 66, 58, 61, 60, 64, 59, 55]
temposDeTrabalho = [31, 29, 30, 26, 25, 24, 26, 29]

function verificarAposentadoria(nome) {

    colaborador = false
    idade = 0
    tempoTrabalho = 0

    for (contador = 0; contador < colaboradores.length; contador++) {
        if (nome == colaboradores[contador]) {
            colaborador = true
            idade = idade[contador]
            tempoTrabalho = temposDeTrabalho[contador]
        }
    }
    if (colaborador) {
        porIdade = (idade >= 65)
        porTempoDeTrabalho = (temposDeTrabalho > 30)
        porIdadeTempo = (idade > 60 && temposDeTrabalho >= 25)
    }

    if (porIdade || porTempoDeTrabalho || porIdadeTempo) {
        console.log("Parabéns, já pode sair de férias eternas :)")
    }
    else {
        console.log("Infelizmente para você, ainda falta um tempo :(")
    }
  if (nome != colaboradores) {
        console.log("Colaborador inválido :|")
    }
}