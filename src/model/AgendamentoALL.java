package model;
/**
 *
 * @author Perucello
 */
public class AgendamentoALL {
    
    private int id;
    private String nome;
    private String celular;
    private String data; 
    private String horario;
    

    public AgendamentoALL() {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.data = data;
        this.horario = horario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
   
        @Override
        public String toString(){
            return nome;
        }
}
