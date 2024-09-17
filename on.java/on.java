public class Tarefa {
    private String titulo;
    private int prioridade;
    private String descricao;
    private String prazo;

    
    public Tarefa(String titulo, int prioridade, String descricao, String prazo) {
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    
    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = "Descrição padrão"; 
        this.prazo = "Prazo padrão";         
    }