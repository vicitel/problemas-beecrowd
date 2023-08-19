linha = input().split()

codigo = int(linha[0])
peca = int(linha[1])
valor = float(linha[2])

linha2 = input().split()

codigo2 = int(linha2[0])
peca2 = int(linha2[1])
valor2 = float(linha2[2])

valor_pagar = (peca * valor) + (peca2 * valor2)

print(f'VALOR A PAGAR: R$ {valor_pagar:.2f}')