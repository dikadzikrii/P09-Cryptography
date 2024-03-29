/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crypto;

import java.io.UnsupportedEncodingException;
/**
 *
 * @author dikadzikrii
 */
public class MyStringUtils {
    static final byte[] HEX_CHAR_TABLE ={
        (byte)'0',(byte)'1',(byte)'2',(byte)'3',(byte)'4',(byte)'5',(byte)'6',
        (byte)'7',(byte)'8',(byte)'9',(byte)'a',(byte)'b',(byte)'c',(byte)'d',
        (byte)'e',(byte)'f'
    };
    
    public static String getHexString(byte[] raw){
        String hex = "";
        try{
            byte[] hexa = new byte[2 * raw.length];
            int index = 0;
            for (byte b : raw){
                int v = b & 0xff;
                hexa[index++] = HEX_CHAR_TABLE[v >>> 4];
                hexa[index++] = HEX_CHAR_TABLE[v & 0xff];
            }
            hex = new String(hexa, "AASCII");
        } catch (UnsupportedEncodingException e){
            
        }
        return hex;
    }
    
}
