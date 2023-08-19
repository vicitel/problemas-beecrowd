nome_funcionario = input()
salario_fixo = float(input())
vendas_efetuadas = float(input())
comissao = vendas_efetuadas*0.15
salario_comissao = salario_fixo+comissao

print(f'TOTAL = R$ {salario_comissao:.2f}')