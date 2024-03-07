/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosatextarea;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author ruben
 */
public class TA {


    public String cargar(String path) {
        try {
            String res = "";
            int c;
            FileReader fr = new FileReader(path);
            while ((c = fr.read()) != -1) {
                res += (char)c;
            }
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void guardar(JTextArea dest, String path) {
        try {
            FileWriter fw = new FileWriter(path, false);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(dest.getText());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
