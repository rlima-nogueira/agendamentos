package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.AgendamentoALL;

public class AgendamentoDAO {

    private final Connection con;
    private PreparedStatement cmd;
    
    public AgendamentoDAO(){
        this.con = ConexaoBD.Conectar();
        
     }
  
 //metodo Inserir    
    public int inserir(AgendamentoALL p){
           try{
            String sql = "insert into agendamento (nome, celular, dia, hora) values (?, ?, ?, ?);";
            
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            cmd.setString(1, p.getNome());
            cmd.setString(2, p.getCelular());
            cmd.setString(3, p.getData());
            cmd.setString(4, p.getHorario());
            
                        if (cmd.executeUpdate() > 0){
                            ResultSet rs = cmd.getGeneratedKeys();
                            return (rs.next()) ? rs.getInt(1): -1;
                        }else{
                            return -1;
                        }
        }        
        catch (SQLException e){
            System.out.println("ERRO SQL: " + e.getMessage());
            return -1;
        }  
        finally{
            ConexaoBD.Desconectar(con);
        }     
    }   

//Metodo Listar
    public List<AgendamentoALL> listar(){
        try{
            String sql = "select * from agendamento order by id";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            
            List<AgendamentoALL> lista = new ArrayList<>();
            while(rs.next()){
                
                AgendamentoALL p = new AgendamentoALL();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCelular(rs.getString("celular"));
                p.setData(rs.getString("dia"));
                p.setHorario(rs.getString("hora"));
                
                lista.add(p);
            }
            return lista;
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }   
        finally{
            ConexaoBD.Desconectar(con);
        }
            
    }
    
//Metodo Listar por Nome
    public List<AgendamentoALL> pesquisarPorNome(String nome){
        try{
            String sql = "select * from agendamento where nome like ? order by nome;";
            cmd = con.prepareStatement(sql);
            cmd.setString(1, "%" + nome + "%");
            
            ResultSet rs = cmd.executeQuery();
            List<AgendamentoALL> lista = new ArrayList<>();
            
            while(rs.next()){
                AgendamentoALL p = new AgendamentoALL();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCelular(rs.getString("celular"));
                p.setData(rs.getString("dia"));
                p.setHorario(rs.getString("hora"));
                
                lista.add(p);
            }
            return (List<AgendamentoALL>) lista;
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
    }  
   
//Metodo Deletar
    public int deletar(AgendamentoALL p){
        try{
            String sql = "delete from agendamento where id = ?";
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, p.getId());
            cmd.execute();
//            System.out.println("Ecluido com sucesso !");
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }
//        catch (HeadlessException | SQLException e){
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
        return 0;
    }
  
//Metodo Update  
    public int atualizar(AgendamentoALL p){
        try{
            //String SQL - Banco Dados + declaração das Variaveis
            String sql = "update agendamento set nome=?, celular=?, dia=?, hora=? where id=?;";
            
            cmd = con.prepareStatement(sql);
            
            cmd.setString(1, p.getNome());
            cmd.setString(2, p.getCelular());
            cmd.setString(3, p.getData());
            cmd.setString(4, p.getHorario());
            cmd.setInt(5, p.getId());
            
            // bloco if , para executar a String e retornar
                if (cmd.executeUpdate() > 0){
                    return p.getId();
                }
                    else{
                        return -1;
                    }
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
    }
     
}//fim da classe















