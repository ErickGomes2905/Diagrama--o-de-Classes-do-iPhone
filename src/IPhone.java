public class IPhone {
    public static void main(String[] args) {
        
        //Reprodutor Musical
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        //Aparelho Telefonico
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        //Navegador na Internet
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }
}