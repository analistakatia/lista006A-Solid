# lista006A-Solid

LISTA DE EXERCÍCIOS 006A - Entregar
Nessa versão faremos os seguintes ajustes.
Modele as classes referentes aos funcionários de uma universidade, que serão os professores, coordenadores e funcionários administrativos. 

O que fazer de novo: 
Teremos agora estagiários, - esses não têm salários e sim bolsas.
Estagiários são vinculados a professores que têm até 2 - dois.
Todos os funcionários e estagiários terão a função reembolso despesas.
Fim! 

Os atributos comuns de todos os funcionários são: Nome, CPF, número de registro, órgão de lotação e salário. 
Os professores possuem os atributos: Nível de graduação, disciplina ministrada , quantidade de alunos e quantidade de turmas. 
Os coordenadores possuem os atributos: ProfessoresSupervisionados
Os funcionários administrativos possuem os atributos: Função Administrativa e Senioridade.
Implemente, além dos getters e setters e os construtores, os seguintes métodos:
aumentoSalario: para todos menos os coordenadores aumenta o salário em 10% e para os coordenadores o aumento é de 5%. 
adicionaTurma: para os professores. 
adicionaProfessor (para os coordenadores): Para adicionar um professor na lista de professores supervisionados. 
