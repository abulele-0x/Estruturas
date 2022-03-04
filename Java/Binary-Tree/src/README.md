# PTI Estruturas de Dados

## Item 1 - Contar Nós Esquerdo-festivos

Precisei utilizar sobrecarga de métodos, pois a primeira chamada precisaria partir do nó root e as subsequentes teriam de passar os nós como parâmetro. Como eu não tenho como fazer a primeira chamada passando parâmetro de nó, por ele ser um atributo privado, fiz a primeira chamada com um método sem parâmetros e as chamadas subsequentes com a mesma implementação, mas com parâmetro passando o nó seguinte como argumento.

## Item 2 - Imprimir id dos elementos com recuos proporcionais ao nível do nó.

Utilizei, novamente, sobrecarga de métodos, pelos motivos acima.

Coloquei um parâmetro 'count' pra passar como argumento representando o número de espaços que seriam dados a cada chamada da função, representando a posição do nó na hierarquia.

Na primeira chamada, o contador era 0, pois se tratava do nó raiz.
Segunda chamada, o contador foi incrementado em 1.

Imprime-se o valor do id daquele nó com o current.getId(), mas **antes** são imprimidos 'n' espaços. 'n' sendo o número do contador;
Verifica-se se o nó atual tem filhos e, se tiver, chama a função novamente, passando os filhos como argumento e incrementando o contador passado para a chamada seguinte da função.
