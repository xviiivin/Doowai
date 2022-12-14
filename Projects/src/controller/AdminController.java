/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author sasimai
 */
import view.*;
import frame.*;
import layout.*;
import java.awt.*;
import components.*;
public class AdminController {
    private AdminFrame adminFrame;
    private AdminLayout adminLayout;
    private AdminBody adminBody;
    private AdOne adOne;
    private AdTwo adTwo;
    private AdThree adThree;
    private AdFour adFour;
    
    private adsidePane adSide;
    private adtopPane adTop;
    public AdminController() {
        adminFrame = new AdminFrame();
        adminLayout = new AdminLayout();
        adminBody = new AdminBody();
        adOne = new AdOne();
        adTwo = new AdTwo();
        adThree = new AdThree();
        adFour = new AdFour();
        adSide = new adsidePane();
        adTop = new adtopPane();
        
        adminLayout.getAdminNavPanel().setLayout(new BorderLayout());
        adminLayout.getAdminNavPanel().add(adSide);
        
        adminLayout.getAdminTopPanel().setLayout(new BorderLayout());
        adminLayout.getAdminTopPanel().add(adTop);
        
        adminLayout.getAdminBodyPanel().setLayout(new BorderLayout());
        adminLayout.getAdminBodyPanel().add(adminBody);
        
        adminBody.setLayout(new BorderLayout());
//        adminBody.add(adOne);
//        adminBody.add(adTwo);
        adminBody.add(adThree);
//        adminBody.add(adFour);

        
        adminFrame.setLayout(new BorderLayout());
        adminFrame.add(adminLayout);
        adminFrame.setVisible(true);
    }
}
