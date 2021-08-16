if (o despertador tocar) {
    abrir os olhos
    desligar despertador
    } 
    
    else {
      continuar dormindo
    }
    
    if (ainda estiver deitada) {
    levantar da cama 
    calcar os chinelos
    }
    
    else if (eu ja estiver levantado) {
    ir ao banheiro
    escovar os dentes
    } 
    
    if (eu ja fui ao banheiro) {
    ir ate a cozinha
    abrir a geladeira
    pegar a caixa de leite 
    soltar a caixa de leite em cima da mesa 
    } 
    else if (o leita ja estiver em cima da mesa)
      {
    soltar a caixa de leite em cima da mesa 
    }
    
    if (a xicara nao estiver em cima da mesa) {
      ir ate o armario
      pegar uma xicara
      colocar a xicara em cima da mesa
    }
    else if (xicara ja estiver em cima da mesa) {
      pegar a caixa de leite
    }
    if (a caixa de leite estiver fechada) {
      abrir a caixa de leite
    }
    else if (caixa de leite estiver aberta) {
      apenas segura a caixa de leite
    }
    if (se a xicara estiver vazia) {
      sirva o leite dentro da xicara
    }
    else if (a xicara estiver cheia) {
      pegue a lata de nescau
      abra a lata de nescau
      pegue uma colher
      coloque tres colheres de nescau dentro da xicara com leite
      mexa o leite com a colher
    }
    while (a xicara nao estiver cheia de leite) {
      continue servindo
    }
    case: (o leite estiver pronto para beber){
      beba o leite
      break;
    }
    if (o leite nao foi bebido por completo){
      beba o leite
    }
    
    else if (o leite ja foi bebido por completo){
    o cafe da manha foi concluido
    } 
    
    case 1: (ainda estiver vestindo pijama){
      ir ate o quarto
      abrir o guarda roupa
      pegar uma camiseta
      vestir camiseta
      pegar uma calca
      vestir a calca
      pegar um sapato 
      calcar o sapato
      break;
    }
    
    case 2: (ja estiver trocado de vestimenta) {
      entao estou pronto para sair
      console.log("Você está pronto para sair")
      break
    }
    