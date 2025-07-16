package carros;

public class Carro {
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;
    float quantGasolina;

    void abastecer (int litros){
        combustivel = combustivel + litros;
    }

    int autonomiaCombustivel(){
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }
    float quant (){
        if (quantGasolina > capacidadeTanque) {
            float gasolina =   quantGasolina - (quantGasolina - capacidadeTanque);
            return gasolina;
        }

        return 0;
    }
    float sobrou (){
        if (quantGasolina > capacidadeTanque) {
            float sobra =  (quantGasolina - capacidadeTanque);
            return sobra;
        }
        return 0;
    }


}
