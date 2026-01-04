public class Principal {
    void main (){
        int quantidadePassos = 500;
        double alturaEmMetros = 1.60;
        Paciente jose = new Paciente();

//        int alturaEmCentimetros = 170;
//        alturaEmMetros= alturaEmCentimetros;
//        System.out.println(alturaEmMetros / 100);

        if (quantidadePassos < 1000){
            String sugestao = "sugiro que voce tente aumentar a meta";
            System.out.println(sugestao);
        }
    }
}
