
package modelos;

public class Tarefa {
    String titulo;
    String descricao;
    Boolean concluida;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConcluida() {
        return (concluida) ? "Concluída" : "Não Concluída";
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }
    
}
