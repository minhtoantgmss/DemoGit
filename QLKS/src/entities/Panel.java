/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author minhtoan
 */
public class Panel extends JPanel {
    private final JLabel tenPH;
    private String MAPH;
    private int DonGia;
    private int TinhTrang;
    
    public Panel(String TenPH,int TT,String MAPH,int DonGia,int TinhTrang){
        tenPH =new JLabel(TenPH);
        this.TinhTrang=TinhTrang;
        this.DonGia=DonGia;
        switch (TT) {
            case 0:
                super.setBackground(Color.white);
                break;
            case 1:
                super.setBackground(Color.lightGray);
                break;
            case 2:
                super.setBackground(Color.YELLOW);
                break;
            default:
                break;
        }
        
        super.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        super.add(tenPH);
        super.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                superMouseClicked(evt);
            }
        });
    }
        
    public  void superMouseClicked(java.awt.event.MouseEvent evt) {
        if( super.getBackground()== Color.white)
        {
            super.setBackground(Color.red);
        }else if(super.getBackground()== Color.red)
        {
            super.setBackground(Color.white);
        }else
        {
            JOptionPane.showMessageDialog(null,"Ghế Đã Được Đặt !");
        }
    }


    public String getMAPH() {
        return MAPH;
    }

    public void setMAPH(String MAPH) {
        this.MAPH = MAPH;
    }
    
    public String getNhan() {
        return tenPH.getText();
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    

}
