
public class TesteLista06A{
    public static void main(String[] args) {

        //Testando - Classe Coordenador
        Coordenador coordenador = new Coordenador("Kilda", "001.000.001-01", "003-R", "MASP", 2000);
        System.out.println("\n\n\n*** Dados do Funcionário  - Grupo de Servidor - Coordenador ***");
        System.out.println("\nNome: "+coordenador.getNome()+"\nCPF: "+coordenador.getCpf()+"\nÓrgão: "+coordenador.getNumRegistro()+" - "+coordenador.getOrgaoLotacao() +"\nSalário atual: R$ " + coordenador.getSalarioBase());

        //Chamando os metodos
        coordenador.aumentoSalario();
        coordenador.reembolso();
        System.out.println("\nTem algum reembolso a ser realizado? "+ coordenador.reembolso());
        coordenador.adicionarProfessor();

        //Testando - Classe Funcionarios Administrativos
        FuncionarioAdmin funcionarioAdmin = new FuncionarioAdmin("Antonia", "003.003.003-03", "001-W", "MASP", 4000, "Secretário", "Pleno");
        System.out.println("\n\n\n*** Dados do Funcionário  - Grupo de Servidor - Função Administrativa ***");
        System.out.println("\nNome: "+funcionarioAdmin.getNome()+"\nCPF: "+funcionarioAdmin.getCpf()+"\nÓrgão: "+ funcionarioAdmin.getNumRegistro()+" - "+funcionarioAdmin.getOrgaoLotacao()+
                "\nSalário atual: R$ " + funcionarioAdmin.getSalarioBase() +"\nFunção Administrativa: "+funcionarioAdmin.getFuncaoAdmin()+"\nSenioridade: "+funcionarioAdmin.getSenioridade());

        //Chamando os metodos
        funcionarioAdmin.aumentoSalario();
        funcionarioAdmin.reembolso();
        System.out.println("\nTem algum reembolso a ser realizado? "+ funcionarioAdmin.reembolso());



        //Testando - Classe Professor
        Professor professor = new Professor("Pedro Neto", "000.000.000-00", "X007", "MASP", 5000, "Superior Completo",
                "Informática", 100, 4);
        System.out.println("\n\n\n*** Dados do Funcionário  - Grupo de Servidor - Professor ***");
        System.out.println("\nNome: "+professor.getNome()+"\nCPF: "+professor.getCpf()+"\nÓrgão: "+ professor.getNumRegistro()+" - "+professor.getOrgaoLotacao()+
                "\nNível de Graduação: "+professor.getNivelGraduacao()+ "\nSalário atual: R$ " +professor.getSalarioBase() +
                "\nDisciplina Ministrada: "+professor.getDisciplinaMinistrada()+"\nQuantidade de alunos: "+professor.getQtdAlunos()+"  -  Quantidade de Turmas: "+professor.getQtdTurmas());

        //Chamando os metodos
        professor.aumentoSalario();
        professor.reembolso();
        System.out.println("\nTem algum reembolso a ser realizado? " + professor.reembolso());
        professor.adicionarTurma();
        professor.adicionarEstagiario();



        //Testando - Classe Estagiario
        System.out.println("\n\n\n*** Informações Bolsa Estagiário ***");
        Estagiario estagiario = new Estagiario();

        //Chamando metodo
        estagiario.informeValorBolsa();
        estagiario.reembolso();
        System.out.println("\nTem algum reembolso a ser realizado? " + estagiario.reembolso());

    }
}
