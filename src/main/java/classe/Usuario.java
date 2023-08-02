package classe;

public class Usuario {
    String nome;
    String email;
    
    public boolean equals(Object objeto){
        
        if (objeto instanceof Usuario) {
                    Usuario outro= (Usuario) objeto;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        return nomeIgual && emailIgual;
        } else {
            return false;
        }
        

    }
    

    public String getNome() {
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
    
    
}
