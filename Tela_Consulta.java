package gulosa_brigaderia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tela_Consulta extends javax.swing.JFrame {

    public Tela_Consulta() {

        titulo_lbl = new javax.swing.JLabel();
        nome_lbl = new javax.swing.JLabel();
        consulta_cliente = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_cliente = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(500, 250);
        setResizable(false);

        nome_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        nome_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome_lbl.setText("Nome");
        nome_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        titulo_lbl.setFont(new java.awt.Font("Arial Unicode MS", 2, 18)); // NOI18N
        titulo_lbl.setText("Consulta Cliente");

        consulta_cliente.setText("Consultar");
        consulta_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(consulta_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_lbl)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consulta_cliente)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        consulta_cliente.getAccessibleContext().setAccessibleName("Consultar");

        pack();
        
        ImageIcon icone = new ImageIcon("C:/Users/Victor/Documents/NetBeansProjects/Gulosa_brigaderia/Logo.jpg");
        setIconImage(icone.getImage());
        
    }
    
     private void consultarActionPerformed(java.awt.event.ActionEvent e) {
         try {
             if(nome.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!");
             }else{
            Class.forName("org.postgresql.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gulosa_brigaderia", "postgres", "123456");
            String Query = ("select nome from cliente WHERE nome LIKE '%"+nome.getText()+"%'");
            System.out.println(Query);
            Statement stm = con.createStatement();
            stm.executeQuery(Query);
            System.out.println(stm);
             }
         } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //System.out.println("erro1");
        } catch (SQLException ex) {
            ex.printStackTrace();
            //System.out.println("erro2");
        }
     }
    
    private javax.swing.JButton consulta_cliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista_cliente;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nome_lbl;
    private javax.swing.JLabel titulo_lbl;
}
