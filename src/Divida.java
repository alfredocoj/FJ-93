
public class Divida {
	private double total;
    private String credor;
    private Cnpj cnpjCredor = new Cnpj();
    private Pagamentos pagamentos = new Pagamentos();
    
    public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
    
    public String getCredor() {
        return this.credor;
    }
    
    public double getTotal() {
        return this.total;
    }
   
    public void setCredor(String credor) {
        this.credor = credor;
    }
    public void setTotal(double total) {
        this.total = total;
    }

	public Pagamentos getPagamentos() {
		return pagamentos;
	}
	
	public double valorAPagar() {
        return this.total - this.pagamentos.getValorPago();
    }
}
