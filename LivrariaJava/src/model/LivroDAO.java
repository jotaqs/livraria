package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDAO {
    private Connection con;

    public LivroDAO() {
        con = new conectar().conectar();
    }

    public ArrayList<Livro> listar() {
        String sql = "SELECT * FROM livraria";
        ArrayList<Livro> livraria;
        livraria = new ArrayList<Livro>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Livro l = new Livro();
                l.setId(rs.getInt("id"));
                l.setAutor(rs.getString("autor"));
                l.setNomeLivro(rs.getString("nomelivro"));
                l.setRegistro(rs.getString("registro"));
                livraria.add(l);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return livraria;
    }

    public void inserir(Livro l) {
        String sql = "INSERT INTO livraria(autor,nomeLivro,registro) VALUE(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, l.getNomeLivro());
            ps.setString(2, l.getAutor());
            ps.setString(3, l.getRegistro());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void atualizar(Livro l) {
        String sql = "UPDATE livraria SET registro=?,nomeLivro=?, autor=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, l.getRegistro());
            ps.setString(2, l.getNomeLivro());
            ps.setString(3, l.getAutor());
            ps.setInt(4, l.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM livraria WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro excluido com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
