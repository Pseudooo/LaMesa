package com.lamesa.ui;

public class homewindow extends javax.swing.JFrame {

	private static final long serialVersionUID = 3293682142470590958L;
	
	/**
     * Creates new form homewindow
     */
    public homewindow() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        navigationButtonContainer = new javax.swing.JPanel();
        homewindowButton = new javax.swing.JButton();
        myprofileButton = new javax.swing.JButton();
        searchContainer = new javax.swing.JPanel();
        searchLable = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        restaurantButtonContainer = new javax.swing.JPanel();
        tacoButton = new javax.swing.JButton();
        pizzaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 500));
        // sets text of the homewindowButton
        homewindowButton.setText("RESTAURANTS");
        homewindowButton.setMaximumSize(new java.awt.Dimension(95, 32));
        homewindowButton.setMinimumSize(new java.awt.Dimension(95, 32));
        homewindowButton.setPreferredSize(new java.awt.Dimension(95, 32));
        //checks for button press of the homewindowButton
        homewindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantButtonActionPerformed(evt);
            }
        });
        //sets the text of the myprofilewindow
        myprofileButton.setText("MYPROFILE");
        //checks for press of the myprofileButton
        myprofileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileButtonActionPerformed(evt);
            }
        });

        searchLable.setText("SEARCH");

        javax.swing.GroupLayout searchContainerLayout = new javax.swing.GroupLayout(searchContainer);
        searchContainer.setLayout(searchContainerLayout);
        searchContainerLayout.setHorizontalGroup(
            searchContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(searchLable, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchContainerLayout.setVerticalGroup(
            searchContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLable)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navigationButtonContainerLayout = new javax.swing.GroupLayout(navigationButtonContainer);
        navigationButtonContainer.setLayout(navigationButtonContainerLayout);
        navigationButtonContainerLayout.setHorizontalGroup(
            navigationButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationButtonContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homewindowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myprofileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navigationButtonContainerLayout.setVerticalGroup(
            navigationButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationButtonContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navigationButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofileButton)
                    .addComponent(homewindowButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        restaurantButtonContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tacoButton.setText("TACOS ");
        tacoButton.setMaximumSize(new java.awt.Dimension(70, 32));
        tacoButton.setMinimumSize(new java.awt.Dimension(70, 32));
        tacoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacoButtonActionPerformed(evt);
            }
        });

        pizzaButton.setText("PIZZA ");
        pizzaButton.setMaximumSize(new java.awt.Dimension(70, 32));
        pizzaButton.setMinimumSize(new java.awt.Dimension(70, 32));
        pizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout restaurantButtonContainerLayout = new javax.swing.GroupLayout(restaurantButtonContainer);
        restaurantButtonContainer.setLayout(restaurantButtonContainerLayout);
        restaurantButtonContainerLayout.setHorizontalGroup(
            restaurantButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantButtonContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restaurantButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pizzaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(tacoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );
        restaurantButtonContainerLayout.setVerticalGroup(
            restaurantButtonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurantButtonContainerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pizzaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tacoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationButtonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restaurantButtonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationButtonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurantButtonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                

    private void myprofileButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
      this.dispose();
      myprofilewindow newMyprofilewindow = new myprofilewindow();
      newMyprofilewindow.setVisible(true);
       
            
    }                                               

    private void restaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 

    }                                                

    private void tacoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
    this.dispose();
    tacorestaurantwindow newRestaurantWindow2 = new tacorestaurantwindow();
    newRestaurantWindow2.setVisible(true);
    }                                          

    private void pizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.dispose();
        restaurantwindow newRestaurantWindow = new restaurantwindow();
        newRestaurantWindow.setVisible(true);
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homewindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homewindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homewindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homewindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homewindow().setVisible(true);
            }
        });
    }

    // Variables declaration                   
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton myprofileButton;
    private javax.swing.JPanel navigationButtonContainer;
    private javax.swing.JButton pizzaButton;
    private javax.swing.JButton homewindowButton;
    private javax.swing.JPanel restaurantButtonContainer;
    private javax.swing.JPanel searchContainer;
    private javax.swing.JLabel searchLable;
    private javax.swing.JButton tacoButton;
    // End of variables declaration                   
}
