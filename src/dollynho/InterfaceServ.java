package dollynho;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by vinimaz on 5/5/16.
 */
public interface InterfaceServ extends Remote {
    ArrayList<Passagem> getPassagens();

    public ArrayList<Passagem> getTodasPassagens();
    public ArrayList<Hospedagem> getTodasHospedagens();
    public ArrayList<Passagem> getSearchPassagens(int origem, int destino, Date ida, Date volta,
                                                  int numAdultos, int numCriancas);
    public ArrayList<Hospedagem> getSearchHospedagem(int cidade, int hotel, Date inicio, Date fim,
                                                     int qtdQuartos, int numPessoas);
    public void cadastraNotificacaoHospedagem(int cidade, int hotel, Date inicio,
                                              Date fim, int numPessoas, float preco);
    public void cadastraNotificacaoPassagem(int origem, int destino, Date ida, Date volta,
                                            int numPessoas, float preco);
}
