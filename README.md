# DESAFIO DA POOL DE MERCADOS

## DESAFIO PROPOSTO PELA FORMAÇÃO BACK END JAVA DA ADA LETS CODE

### RESUMO

<p>Representar vendedores em um pool de vários mercados que são bonificados com aumento de 10% em suas vendas ao alcançar a meta estabelecida por cada mercado atuante, segundo um órgão regulador.</p>

### O projeto possui 4 classes (Vendedor, Mercado, Comprador e Regulador)

- Cada mercado possui um array de Vendedores[], nome, local, total de vendas e meta como parametro
- Cada vendedor possui um nome, valor de venda individual e qual mercado ele pertence
- Cada Comprador faz uma compra de um mercado, vendedor e valor aleatorio.
- O Regulador é responsável por cuidar da bonificação caso o vendedor atinja a meta das vendas do mercado, é feito um calculo de 10% sobre o valor vendido
- Foi feita 3 instancias de Mercado e cada Mercado recebe um array de 10 Vendedores
- Quando executado o programa mostra um sumario de todas as vendas, qual vendedor atingiu a meta, quando foi a bonificação, e isso tudo é separado por cada mercado