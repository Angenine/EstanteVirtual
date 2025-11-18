/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.CadastroDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CadastroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    /**
     * CREATE - Insere um novo item na coleção.
     */
    public void cadastrarItem(CadastroDTO objcad) {
        String sql = "INSERT INTO colecao (tipo, nome, genero, nota, favorito) VALUES (?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcad.getTipo());
            pstm.setString(2, objcad.getNome());
            pstm.setString(3, objcad.getGenero());
            pstm.setInt(4, objcad.getNota());
            pstm.setBoolean(5, objcad.isFavorito());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar item: " + e.getMessage());
        }
    }

    /**
     * UPDATE - Edita um item existente na coleção, baseado no ID.
     */
    public void editarItem(CadastroDTO objcad) {
        String sql = "UPDATE colecao SET tipo=?, nome=?, genero=?, nota=?, favorito=? WHERE id=?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcad.getTipo());
            pstm.setString(2, objcad.getNome());
            pstm.setString(3, objcad.getGenero());
            pstm.setInt(4, objcad.getNota());
            pstm.setBoolean(5, objcad.isFavorito());
            pstm.setInt(6, objcad.getId()); 
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro ao editar item: " + e.getMessage());
        }
    }

    /**
     * DELETE - Exclui um item da coleção pelo ID.
     */
    public void excluirItem(int id) {
        String sql = "DELETE FROM colecao WHERE id=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir item: " + e.getMessage());
        }
    }

    /**
     * READ - Lista todos os itens da coleção, com filtro por nome.
     */
    public List<CadastroDTO> listarItens(String filtro) {
        String sql = "SELECT * FROM colecao WHERE nome LIKE ? ORDER BY nome ASC";
        conn = new ConexaoDAO().conectaBD();
        List<CadastroDTO> lista = new ArrayList<>();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + filtro + "%");
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                CadastroDTO obj = new CadastroDTO();
                obj.setId(rs.getInt("id"));
                obj.setTipo(rs.getString("tipo"));
                obj.setNome(rs.getString("nome"));
                obj.setGenero(rs.getString("genero"));
                obj.setNota(rs.getInt("nota"));
                obj.setFavorito(rs.getBoolean("favorito"));
                
                lista.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar itens: " + e.getMessage());
        }
        return lista;
    }

    /**
     * UPDATE - Altera um item existente (similar ao editarItem).
     */
    public void alterarItem(CadastroDTO objcad) {
        String sql = "UPDATE colecao SET tipo=?, nome=?, genero=?, nota=?, favorito=? WHERE id=?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcad.getTipo());
            pstm.setString(2, objcad.getNome());
            pstm.setString(3, objcad.getGenero());
            pstm.setInt(4, objcad.getNota());
            pstm.setBoolean(5, objcad.isFavorito());
            pstm.setInt(6, objcad.getId()); 
            int linhas = pstm.executeUpdate();
            if (linhas > 0) {
                System.out.println("Registro alterado com sucesso!");
            } else {
                System.out.println("Nenhum registro foi atualizado.");
            }
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao alterar item: " + erro.getMessage());
        }
    }
}

