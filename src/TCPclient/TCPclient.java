package TCPclient;

import TCPserver.TCPserver;

import java.io.*;
import java.net.Socket;

//import static org.graalvm.compiler.debug.DebugOptions.PrintGraphTarget.File;

public class TCPclient {

        public String Hostname;
        public int Port;

        public static void main (String [] args) throws IOException {
            TCPclient client = new TCPclient("localhost",5555);
            client.Sensordata(123311222, (float) 3.0,"sensor 2");
          //  client.copyfile("C:\\Users\\Nasiem Ziad\\Documents\\test\\hallo.txt");


            client.Connecttoserver();

        }
        private  void copyfile(String filename)throws IOException {
            Socket socket = new Socket("localhost",5555);
            FileInputStream fis = new FileInputStream(filename);
            OutputStream os = socket.getOutputStream();

            int read = 0;
            do{
                read = fis.read();
                if(read != -1){
                    os.write(read);
                }
            }while (read !=-1);
            socket.close();
        }

        TCPclient (String hostname,int port){
            this.Hostname = hostname;
            this.Port = port;
        }
    private void Sensordata (long timestamp, float value, String sensorname) throws IOException {
        Socket socket = new Socket(this.Hostname,this.Port);
        OutputStream os = socket.getOutputStream();

        DataOutputStream daos = new DataOutputStream(os);
        daos.writeLong(timestamp);
        daos.writeFloat(value);
        daos.writeUTF(sensorname);

        daos.close();

    }

        public void Connecttoserver(){

        }
    }

