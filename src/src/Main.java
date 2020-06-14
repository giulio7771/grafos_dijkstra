package src;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\temp\\entrada.in");
            Scanner scn = new Scanner(file);

            while (true) {
                int[] linha = readLine(scn);
                int numeroLocais = linha[0];
                int numeroRuas = linha[1];
                System.out.println(numeroLocais);
                System.out.println(numeroRuas);
                
                if (numeroLocais == 0 && numeroRuas == 0) {
                    break;
                }
                Cidade cidade = new Cidade();
                for (int i = 1; i <= numeroLocais; i++) {
                    cidade.addLocal(new Local(i));
                }

                for (int i = 0; i < numeroRuas; i++) {
                    int[] linha_rua = readLine(scn);
                    Local localInicio = cidade.getLocal(linha_rua[0]);
                    Local localDestino = cidade.getLocal(linha_rua[1]);
                    int tempo = linha_rua[2];
                    Rua rua = new Rua(localInicio, localDestino, tempo);
                    localInicio.addRua(rua);
                }
                
                int[] locais = readLine(scn);
                Local pontoPartida = cidade.getLocal(locais[0]);
                Local pontoDestino = cidade.getLocal(locais[1]);
                int tempo = cidade.calculaMenorCusto(pontoPartida, pontoDestino);
                System.out.println(tempo);
            }
            scn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static int[] readLine(Scanner scn) {
        String linha = scn.nextLine();
        String[] linha_split = linha.split(" ");
        int numeroCidades = Integer.parseInt(linha_split[0]);
        int numeroRuas = Integer.parseInt(linha_split[1]);
        int[] response = new int[linha_split.length];
        for (int i = 0; i < linha_split.length; i++) {
            response[i] = Integer.parseInt(linha_split[i]);
        }
        return response;
    }

}
