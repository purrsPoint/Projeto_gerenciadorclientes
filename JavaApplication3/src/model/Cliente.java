package model;


public class Cliente {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    
    //getter e setters
    public int getID(){
        return id;
    }
    
    public void setID(){
    this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
