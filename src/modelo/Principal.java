package modelo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        
        int opcion =0;
        int numero ;


        while (opcion !=7){

            System.out.println("***********************");
            System.out.println("sea bienvenido/a al conversor de moneda");
            System.out.println("1) Dolar =>> peso argentino");
            System.out.println("2) peso argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dolar");
            System.out.println("5) Dolar =>> peso colombiano");
            System.out.println("6) peso colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida");
            System.out.println("**************************");
            opcion = teclado.nextInt();


            if (opcion ==1){
                System.out.println("ingrese el valor que desea convertir");
                numero = teclado.nextInt();
                String direccion = "https://v6.exchangerate-api.com/v6/238549d20c6eac61a83b819a/pair/USD/ARS/" ;
                String direccionFinal= direccion+numero ;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionFinal)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Gson gson = new Gson();
                Moneda miConversion = gson.fromJson( json , Moneda.class);
                System.out.println("El valor de"+" "+ numero +" "+"USD"+" "+"corresponde al valor final de ==> " +miConversion+""+"ARS");}

            if  (opcion ==2 ) {

                System.out.println("ingrese el valor que desea convertir");
                numero = teclado.nextInt();
                String direccion = "https://v6.exchangerate-api.com/v6/238549d20c6eac61a83b819a/pair/ARS/USD/";
                String direccionFinal= direccion+numero ;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionFinal)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Gson gson = new Gson();
                Moneda miConversion = gson.fromJson( json , Moneda.class);
                System.out.println("El valor de "+" "+ numero +" "+"ARS" +" "+"corresponde al valor final de ==> " +miConversion + " "+ "USD");

                }
            if(opcion==3){
                System.out.println("ingrese el valor que desea convertir");
                numero = teclado.nextInt();
                String direccion = "https://v6.exchangerate-api.com/v6/238549d20c6eac61a83b819a/pair/USD/BRL/" ;
                String direccionFinal= direccion+numero ;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionFinal)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Gson gson = new Gson();
                Moneda miConversion = gson.fromJson( json , Moneda.class);
                System.out.println("El valor de "+" "+ numero +" "+"USB" +" "+"corresponde al valor final de ==> " +miConversion + " "+ "BRL");

            }
            if(opcion==4){
                System.out.println("ingrese el valor que desea convertir");
                numero = teclado.nextInt();
                String direccion = "https://v6.exchangerate-api.com/v6/238549d20c6eac61a83b819a/pair/BRL/USD/" ;
                String direccionFinal= direccion+numero ;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionFinal)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Gson gson = new Gson();
                Moneda miConversion = gson.fromJson( json , Moneda.class);
                System.out.println("El valor de "+" "+ numero +" "+"BRL" +" "+"corresponde al valor final de ==> " + miConversion +" "+ "USD");
            }
            if(opcion==5){
                System.out.println("ingrese el valor que desea convertir");
                numero = teclado.nextInt();
                String direccion = "https://v6.exchangerate-api.com/v6/238549d20c6eac61a83b819a/pair/USD/COP/" ;
                String direccionFinal= direccion+numero ;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionFinal)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Gson gson = new Gson();
                Moneda miConversion = gson.fromJson( json , Moneda.class);
                System.out.println("El valor de "+" "+ numero +" "+"USD" +" "+"corresponde al valor final de ==> " +miConversion +" "+ "COP");
            }
            if(opcion==6){
                System.out.println("ingrese el valor que desea convertir");
                numero = teclado.nextInt();
                String direccion = "https://v6.exchangerate-api.com/v6/238549d20c6eac61a83b819a/pair/COP/USD/" ;
                String direccionFinal= direccion+numero ;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionFinal)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Gson gson = new Gson();
                Moneda miConversion = gson.fromJson( json , Moneda.class);
                System.out.println("El valor de "+" "+ numero +" "+"COP" +" "+"corresponde al valor final de ==> " +miConversion + " "+ "USD");
            }}}}



