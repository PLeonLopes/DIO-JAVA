package Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando Música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada!");
    }

    // NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada!");
    }

    // AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Realizando Ligação!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }

}