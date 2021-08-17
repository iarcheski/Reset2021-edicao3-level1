// verifica se nomeDoFulano é igual a nomeDoBeltrano;

function mesmoNome(nomeUm = "Debora", nomeDois = "Iarcheski"){
    return nomeUm == nomeDois
    }
    mesmoNome();
    
// variável que verifica se idade é de um adulto;

function maiorDeIdade(idade = 26){
      return idade >= 18
    }
    maiorDeIdade();

// calcula o valor de um boleto com atraso;

function totalComJuros(boletoValor = 280) {
    return boletoValor * 1.1
}

// representação da fórmula de média aritmética;

function mediaAritmetica(todosOsItens)
soma = 0

// somando os itens

for (contador = 0; contador < todosOsItens.length; contador++){
  soma += todosOsItens[contador]
}
return soma / todosOsItens.length

// lucro bruto de uma empresa;

function lucroBruto(receitaLiquidaDeVendas - custoDosProdutosVendidos)

/*lucroBruto = 800
receitaLiquidaDeVendas = 500
custoDosProdutosVendidos = 600*/

lucroBruto = receitaLiquidaDeVendas - custoDosProdutosVendidos


return (lucroBruto / receitaLiquidaDeVendas) * 100