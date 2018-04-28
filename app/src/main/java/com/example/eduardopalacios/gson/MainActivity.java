package com.example.eduardopalacios.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.eduardopalacios.gson.clasesJson.Jugador;
import com.example.eduardopalacios.gson.clasesJson2.Direccion;
import com.example.eduardopalacios.gson.clasesJson2.Persona;
import com.example.eduardopalacios.gson.clasesJson3.AdressComponents;
import com.example.eduardopalacios.gson.clasesJson3.Location;
import com.example.eduardopalacios.gson.clasesJson3.Sitio;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btnej1);
        btn1.setOnClickListener(this);

        btn2=findViewById(R.id.btnej2);
        btn2.setOnClickListener(this);

        btn3=findViewById(R.id.btnej3);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnej1:

                ejemplo1();
                break;

            case R.id.btnej2:

                ejemplo2();
                break;

            case R.id.btnej3:

                ejemplo3();
                break;


                default:

                    break;
        }
    }

    public  void ejemplo1() {
        //**********JSON1**************
        //{
        //  "nombre":"Iniesta",
        //  "equipo":"barcelona",
        //  "numero": 2,
        //  "posicion":"delantero"

        //}

        String miJson="{\n" +
                "    \"nombre\":\"Iniesta\",\n" +
                "    \"equipo\":\"barcelona\",\n" +
                "    \"numero\": 2,\n" +
                "    \"posicion\":\"delantero\"\n" +
                "    \n" +
                "}";

        Gson gson=new Gson();
        Jugador jugador=gson.fromJson(miJson,Jugador.class);

        Toast.makeText(getApplicationContext(),jugador.getNombre()+"\n"+jugador.getEquipo()+"\n"+jugador.getPosicion()+"\n"+
                String.valueOf(jugador.getNumero()),Toast.LENGTH_SHORT).show();



    }

    public void ejemplo2()
    {

        String Json2="{\n" +
                "    \"Nombre\":\"Luis\",\n" +
                "    \"Apellido\":\"Ramirez\",\n" +
                "    \"Edad\": 25,\n" +
                "  \"Direccion\":{\n" +
                "    \"calleDireccion\":\"palma 2 centro\",\n" +
                "    \"Ciudad\":\"ciudad de mexico\",\n" +
                "    \"Delegacion\":\"Benito Juarez\",\n" +
                "    \"codigoPostal\": 1112\n" +
                "  }\n" +
                "    \n" +
                "}";

        Gson gson=new Gson();
        Persona persona=gson.fromJson(Json2,Persona.class);
        Direccion direccion=persona.getDireccion();
        //Toast.makeText(getApplicationContext(),persona.getNombre()+"\n"+persona.getApellido()+"\n"+String.valueOf(persona.getEdad()),Toast.LENGTH_SHORT).show();

        Toast.makeText(getApplicationContext(),direccion.getCalleDireccion()+"\n"+direccion.getCiudad()+"\n"+direccion.getDelegacion()+String.valueOf(direccion.getCodigoPostal()),Toast.LENGTH_SHORT).show();

    }

    public void ejemplo3()
    {
        String Json3="      {\n" +
                "         \"formatted_address\" : \"Av. Té 950, Granjas México, 08400 Ciudad de México, CDMX, México\",\n" +
                "\n" +
                "            \"location\" : {\n" +
                "               \"lat\" : 19.3963632,\n" +
                "               \"lng\" : -99.09197589999999\n" +
                "              },\n" +
                "\n" +
                "         \"address_components\" : [\n" +
                "            {\n" +
                "               \"long_name\" : \"950\",\n" +
                "               \"short_name\" : \"950\"\n" +
                "            \n" +
                "            },\n" +
                "            {\n" +
                "               \"long_name\" : \"Avenida Té\",\n" +
                "               \"short_name\" : \"Av. Té\"\n" +
                "              \n" +
                "            },\n" +
                "            {\n" +
                "               \"long_name\" : \"Granjas México\",\n" +
                "               \"short_name\" : \"Granjas México\"\n" +
                "            }\n" +
                "        \n" +
                "         ]\n" +
                "}";


          Gson gson=new Gson();

        Sitio sitio=gson.fromJson(Json3,Sitio.class);
        Location location=sitio.getLocation();
        List<AdressComponents>adressComponents=sitio.getAdressComponents();

        Toast.makeText(getApplicationContext(),sitio.getFormatted_address(),Toast.LENGTH_SHORT).show();




    }


}
