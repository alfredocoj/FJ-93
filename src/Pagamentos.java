import java.util.ArrayList;
import java.util.Calendar;

@SuppressWarnings("serial")
public class Pagamentos extends ArrayList<Pagamento> {
	
	private double valorPago;
	
	public double getValorPago() {
		return valorPago;
	}
	
	public void registra(Pagamento pagamento) {
		double valor = pagamento.getValor();
        if (valor < 0) {
          throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
          valor = valor - 8;
        }
        this.valorPago += valor;
        this.add(pagamento);
    }
	
	// métodos que trabalham com a lista de pagamentos
    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}
