/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiago;

/**
 *
 * @author a2459728
 */
public class tipoRadio {
    
    public String modelo;
    public String marca;
    public int potencia;
    public boolean ligado;
    public double frequencia;
    public int volume;
    
    public tipoRadio(String modelo, String marca, int potencia, boolean ligado, double frequencia, int volume){
        this.modelo = modelo;
        this.marca = marca;
        
        if((potencia>100000) || (potencia < 1000)){
            System.out.println("Potencia nao permitida. Sera definida para menor potencia possivel.");
            this.potencia = 1000;
        }
        else{
            this.potencia = potencia;
        }
        
        
        
        this.ligado = ligado;
        
        if((frequencia < 88.7) || (frequencia> 108.1)){
            System.out.println("Frequencia invalida. Sera definida para a menor frequencia possivel.");
            this.frequencia = 88.7;
        }
        else{
            this.frequencia = frequencia;
        }
        if((volume < 0) || (volume > 30)){
            System.out.println("Volume invalido. Sera definido para o menor volume possivel");
            this.volume = 0;
        }
        else{
            this.volume = volume;
        }
        
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
        ligado = false;
    }
    
    public double aumentarFrequencia(){
        if(ligado){
        if(frequencia>=108.1){
            System.out.println("Frequencia maxima ja foi atingida.");
        }
        else{
            frequencia+=0.2;
        }
        }
        else{
            System.out.println("Necessario ligar o radio.");
        }
       return frequencia;
    }
    
    public double diminuirFrequencia(){
        if(ligado){
        if(frequencia<=87.7){
            System.out.println("Frequencia minima ja foi atingida.");
        }
        else{
        frequencia-=0.2;
        }
        }
        else{
            System.out.println("Necessario ligar o radio.");
        }
        return frequencia;
    }
    
    public void aumentarVolume(){
       if(ligado){
       if(volume>=30){
         System.out.println("Volume ja esta no maximo.");
       }
       else{
       volume += 1;
       }
       }
       else{
           System.out.println("Necessario ligar o radio.");
       }
    }
    
    public void diminuirVolume(){
        if(ligado){
        if(volume<=0){
            System.out.println("Volume ja esta no minimo.");
        }
        else{
            volume -= 1;
        }
        }
        else{
            System.out.println("Necessario ligar o radio.");
        }
        
    }
    
    @Override
    public String toString(){
        return ("Modelo: "+modelo+ "\n" + "Marca: "+marca+"\n" + "Potencia: "+potencia+"\n"+"Ligado: "+ligado+"\n"+"Frequencia: "+frequencia+"\n"+"Volume: "+volume+"\n");
    }
    
   
    
}
