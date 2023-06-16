/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiago;
import java.util.Scanner;
/**
 *
 * @author a2459728
 */
public class Radio {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String modelo;
        String marca;
        int potencia;
        boolean ligado;
        double frequencia;
        int volume;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma quantidade de radios(no minimo 2 para testar todos os metodos): ");
        
        int quantidadeRadios = scan.nextInt();
        
        while(quantidadeRadios < 2){
            System.out.print("Digite uma quantidade de radios(no minimo 2 para testar todos os metodos): ");
            quantidadeRadios = scan.nextInt();
        }
        
        scan.nextLine();
        
        tipoRadio[] radios = new tipoRadio[quantidadeRadios];
        
        for(int i =0; i<quantidadeRadios; i++){
            
            System.out.print("Modelo: ");
            modelo = scan.nextLine();
            
            System.out.print("Marca: ");
            marca = scan.nextLine();
            
            System.out.print("Potencia: ");
            potencia = scan.nextInt();
            
            System.out.println("Digite 1 para radio ligado\nDigite 0 para radio desligado\n");
            int estado = scan.nextInt();
            
            while(estado != 1 && estado != 0){
                System.out.print("Valor invalido\n1 para ligado\n0 para desligado\n");
                estado = scan.nextInt();
            }
            
            if(estado == 1){
                ligado = true;
            }
            else{
                ligado = false;
            }
            
            System.out.print("Frequencia: ");
            frequencia = scan.nextDouble();
            
            System.out.print("Volume: ");
            volume = scan.nextInt();
            
            scan.nextLine();
            
            radios[i] = new tipoRadio(modelo, marca, potencia, ligado, frequencia, volume);
            
        }
        
        System.out.println("Primeiros valores de radio: ");
        for (tipoRadio radio : radios) {
            System.out.println("");
            String dadosRadio = radio.toString();
            System.out.println(dadosRadio);
        }
        
        
        System.out.println("Vamos aumentar a frequencia e o volume do primeiro radio\nVamos diminuir a frequencia e o volume do segundo radio e entao desliga-lo");
        radios[0].aumentarFrequencia();
        radios[0].aumentarVolume();
        radios[1].diminuirFrequencia();
        radios[1].diminuirVolume();
        radios[1].desligar();
        
        System.out.println("Agora com os valores alterados: ");
        for (tipoRadio radio : radios) {
            System.out.println("");
            String dadosRadio = radio.toString();
            System.out.println(dadosRadio);
        }
        
        
        
        
        
        
    }
        
        
        
        
    }
    

