
public class Cnpj {
	 private String cnpj;
	 
	// métodos que trabalham com CNPJ
    public boolean cnpjValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }
    private int primeiroDigitoCorretoParaCnpj() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int primeiroDigitoVerificadorDoCnpj() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    
    public String getCnpjCredor() {
        return this.cnpj;
    }
    
    private int segundoDigitoCorretoParaCnpj() {
        // Calcula o segundo dígito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int segundoDigitoVerificadorDoCnpj() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    public void setCnpjCredor(String cnpjCredor) {
        this.cnpj = cnpjCredor;
    }
}
