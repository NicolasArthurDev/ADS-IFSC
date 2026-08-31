Laboratório de [[5. Kotlin - Outros conceitos da linguagem]] — [[0. Programação para Aplicativos Móveis]]

- Aula: 06/08/2026
- **Data da entrega: 13/08/2026**
- Inscrição obrigatória pelo [formulário](https://forms.gle/QNB4a3KRS2BXhGVc9)

## Objetivo
Praticar **outros conceitos da linguagem Kotlin** (enums, data class, coleções).

## Exercício — Sistema de pedidos (delivery)
Sistema em modo console para modelar pedidos de uma lanchonete/delivery:

1. Enum `CategoriaItem` com no mínimo `PIZZA`, `BEBIDA`, `SOBREMESA`, cada valor com atributo `descricao: String` e função `descricao()` retornando uma string amigável
2. Enum `StatusPedido` com no mínimo `NOVO`, `EM_PREPARO`, `SAIU_PARA_ENTREGA`, `ENTREGUE`, `CANCELADO`, incluindo função de controle de fluxo (`podeCancelar(): Boolean` ou `podeAvancar(): Boolean`)
3. `data class ItemPedido` com `nome: String`, `categoria: CategoriaItem`, `preco: Double`
4. `data class Pedido` com `id: Int`, `cliente: String`, `itens: List<Pair<ItemPedido, Int>>` e `status: StatusPedido` (valor inicial `NOVO`)
5. No `main()`, uma coleção com pelo menos 3 pedidos e itens variados

![[MOV-lab_4.pdf]]
