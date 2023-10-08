public class ReprodutorMusical {
   
   public void tocar(){
    System.out.println("Tocando a playlist favorita");
   }
   public void pausar(){
    System.out.println("Música Pausada");
   }
   public void selecionarMusica(){
    passarMusica();
    retornarMusica();
    escolhendoMusicaPreferida();
   }

   private void passarMusica(){
    System.out.println("pulando uma música");
   }
   private void retornarMusica(){
    System.out.println("Retornando a música anterior");
   }
   private void escolhendoMusicaPreferida(){
    System.out.println("Escolhendo a música preferida");
   }
}
