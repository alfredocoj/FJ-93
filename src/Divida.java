import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
	private double total;
    private double valorPago;
    private String credor;
    private Cnpj cnpjCredor = new Cnpj();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    
    public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
    
	// métodos que trabalham com a lista de pagamentos
    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    
    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        paga(pagamento.getValor());
    }
    
    public String getCredor() {
        return this.credor;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public double getValorPago() {
        return this.valorPago;
    }
    
    private void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }
   
    public void setCredor(String credor) {
        this.credor = credor;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double valorAPagar() {
        return this.total - this.valorPago;
    }
	
}
