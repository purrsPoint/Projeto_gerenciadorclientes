package dao;
import model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    
    public void salvar(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
        // comando sql para inserir dados na tabela clientes
            String sql = "INSERT INTO clientes(nome,email,telefone) VALUES(?,?,?)";
            stmt = con.prepareStatement(sql);
            
            //define os valores para cada '?' no comando SQL
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            
            //Executa o comando sql
            stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Erro ao salvar cliente"+ex.getMessage());
        } finally{
            //fecha a conexão e o statement, independentemente do que aconteceu
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
}
