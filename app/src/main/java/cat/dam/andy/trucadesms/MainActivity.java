package cat.dam.andy.trucadesms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView msg_user;
    TextView tel_user;
    Button buto1;
    Button buto2;
    Button buto3;
    Button buto4;
    Button buto5;
    Button buto6;
    Button buto7;
    Button buto8;
    Button buto9;
    Button butoSMS;
    Button butoCALL;
    Button butoDEL;
    TextView notificacio1;
    TextView notificacio2;

    static String numeroTelefon;

    public boolean comprovarNumero(String numeroTel){

        boolean numeroReal = false;

        if(numeroTel.length() == 11){
            numeroReal = true;
        }else{
            numeroReal = false;
        }

        return numeroReal;
    }

    /**
     * Funcio en la que podrem veure si hi ha algun missatge introduït o no
     * @param msg - valor String edl AutoCompleteText
     * @return Boolean
     */
    public boolean msgExistent(String msg){

        boolean msgEscrit = true;

        if(msg.length() == 0){
            msgEscrit = false;
        }else {
            msgEscrit = true;
        }

        return msgEscrit;
    }

    /**
     * Funcio en la que depenguent del boolea que entri com a paramatre mostrara un text per pantalla
     * @param msg - boolea introduït
     * @param notificacio1 - Textview on mostrarem el msg
     */
    public void msgNotificacioSMS(boolean msg, TextView notificacio1){

        if(msg == false){
            notificacio1.setText("INTRODUEIX UN MISSATGE!");
        }else{
            notificacio1.setText("MISSATGE ENVIAT CORRECTAMENT!");
        }
    }

    /**
     * Funcio en la que mostrarem un msg per pantalla depenguent de la resposta del boolea entrada dins del paramatre
     * @param ComprovacioNumero
     * @param notificacio2
     * @return
     */
    public boolean msgNotificacioNumero(boolean ComprovacioNumero, TextView notificacio2){

        boolean comprovant = false;

        if(ComprovacioNumero == false){
            notificacio2.setText("NUMERO INTRODUÏT NO CORRECTE");
            comprovant = false;
        }
        else{
            comprovant = true;
        }
        return comprovant;
    }

    /**
     * Funcio que servira per posar espais entra el tercer i sise numero que es mostri per pantalla
     * @param numero
     * @return
     */
    public String LongitudNumero(String numero){

        if(numero.length() == 3 || numero.length() == 7){
            numero = numero + " ";
        }
        return  numero;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg_user = (AutoCompleteTextView) findViewById(R.id.msg_user);
        tel_user = (TextView) findViewById(R.id.num_tel);
        buto1 = (Button) findViewById(R.id.button_1);
        buto2 = (Button) findViewById(R.id.button_2);
        buto3 = (Button) findViewById(R.id.button_3);
        buto4 = (Button) findViewById(R.id.button_4);
        buto5 = (Button) findViewById(R.id.button_5);
        buto6 = (Button) findViewById(R.id.button_6);
        buto7 = (Button) findViewById(R.id.button_7);
        buto8 = (Button) findViewById(R.id.button_8);
        buto9 = (Button) findViewById(R.id.button_9);
        butoSMS = (Button) findViewById(R.id.button_SMS);
        butoCALL = (Button) findViewById(R.id.button_CALL);
        butoDEL = (Button) findViewById(R.id.button_DEL);
        notificacio1 = (TextView) findViewById(R.id.Notificacio1);
        notificacio2 = (TextView) findViewById(R.id.Notificacio2);

        buto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "1";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "1";
                }
            }
        });
        buto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "2";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "2";
                }
            }
        });
        buto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "3";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "3";
                }
            }
        });
        buto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "4";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "4";
                }
            }
        });
        buto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    String numsInserits = LongitudNumero(tel_user.getText().toString());
                    if(numsInserits.length() <= 10){
                        numsInserits = numsInserits + "5";
                        tel_user.setText(numsInserits);
                        numeroTelefon = numeroTelefon + "5";
                    }


            }
        });
        buto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "6";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "6";
                }
            }
        });
        buto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "7";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "7";
                }
            }
        });
        buto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "8";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "8";
                }
            }
        });
        buto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numsInserits = LongitudNumero(tel_user.getText().toString());
                if(numsInserits.length() <= 10){
                    numsInserits = numsInserits + "9";
                    tel_user.setText(numsInserits);
                    numeroTelefon = numeroTelefon + "9";
                }
            }
        });
        butoSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean comprovantTel = comprovarNumero(tel_user.getText().toString());

                if(msgNotificacioNumero(comprovantTel, notificacio2)){
                    Boolean comprovantMSG = msgExistent(msg_user.getText().toString());
                    msgNotificacioSMS(comprovantMSG, notificacio1);
                }
                else {
                    notificacio2.setText("NUMERO INTRODÏT NO VALID!");
                }

            }
        });
        butoCALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean comprovantTel = comprovarNumero(tel_user.getText().toString());

                if(msgNotificacioNumero(comprovantTel, notificacio2)){
                    notificacio2.setText("NUMERO TELEFON VALID");
                }
                else{
                    notificacio2.setText("NUMERO INTRODÏT NO VALID!");
                }
            }
        });
        butoDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String numeroTel = tel_user.getText().toString();
               if(numeroTel.length() >= 1){
                   numeroTel = numeroTel.substring(0, numeroTel.length()-1);
                   tel_user.setText(numeroTel);
               }
            }
        });

    }

}