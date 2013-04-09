/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gulosa_brigaderia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tela_Inicial extends javax.swing.JFrame{
    
    public Tela_Inicial() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        inicial_tela = new javax.swing.JPanel();
        sobre_emp = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricao_emp = new javax.swing.JTextArea();
        cliente_tela = new javax.swing.JPanel();
        nome_lbl = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        telefone = new javax.swing.JFormattedTextField();
        celular = new javax.swing.JFormattedTextField();
        estado = new javax.swing.JComboBox();
        cpf = new javax.swing.JFormattedTextField();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        ano = new javax.swing.JTextField();
        salva_cliente_bt = new javax.swing.JButton();
        limpa_cliente = new javax.swing.JButton();
        sair_cliente = new javax.swing.JButton();
        data_nasc_lbl = new javax.swing.JLabel();
        rg_lbl = new javax.swing.JLabel();
        endereco_lbl = new javax.swing.JLabel();
        bairro_lbl = new javax.swing.JLabel();
        cidade_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        cpf_lbl = new javax.swing.JLabel();
        estado_lbl = new javax.swing.JLabel();
        celular_lbl = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        telefone_lbl = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        venda_tela = new javax.swing.JPanel();
        cliente_lbl = new javax.swing.JLabel();
        produto_lbl = new javax.swing.JLabel();
        quantid_lbl = new javax.swing.JLabel();
        desconto_lbl = new javax.swing.JLabel();
        produtos_venda_lbl = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        produto = new javax.swing.JTextField();
        quantidade = new javax.swing.JTextField();
        desconto = new javax.swing.JTextField();
        novo_venda = new javax.swing.JButton();
        finaliza_venda = new javax.swing.JButton();
        cancelar_venda = new javax.swing.JButton();
        sair_venda = new javax.swing.JButton();
        relatórios_tela = new javax.swing.JPanel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(500,250);
        setResizable(false);

        sobre_emp.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        sobre_emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobre_emp.setText("Sobre a Empresa");
        sobre_emp.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        descricao_emp.setEditable(false);
        descricao_emp.setBackground(new java.awt.Color(232, 232, 232));
        descricao_emp.setColumns(20);
        descricao_emp.setRows(5);
        jScrollPane2.setViewportView(descricao_emp);

        javax.swing.GroupLayout inicial_telaLayout = new javax.swing.GroupLayout(inicial_tela);
        inicial_tela.setLayout(inicial_telaLayout);
        inicial_telaLayout.setHorizontalGroup(
            inicial_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicial_telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inicial_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(inicial_telaLayout.createSequentialGroup()
                        .addComponent(sobre_emp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inicial_telaLayout.setVerticalGroup(
            inicial_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicial_telaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sobre_emp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gulosa Brigaderia", inicial_tela);

        nome_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        nome_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome_lbl.setText("Nome");
        nome_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mês...", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        salva_cliente_bt.setText("Salvar Cliente");
        salva_cliente_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                  salvarClienteActionPerformed(evt);  
            }
        });

        limpa_cliente.setText("Limpar Cadastro");

        sair_cliente.setText("Sair");

        data_nasc_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        data_nasc_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        data_nasc_lbl.setText("Dt. Nasc.");
        data_nasc_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        rg_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        rg_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rg_lbl.setText("RG");
        rg_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        endereco_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        endereco_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endereco_lbl.setText("Endereço");
        endereco_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bairro_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        bairro_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bairro_lbl.setText("Bairro");
        bairro_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cidade_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cidade_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cidade_lbl.setText("Cidade");
        cidade_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        email_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        email_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_lbl.setText("E-mail");
        email_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cpf_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cpf_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpf_lbl.setText("CPF");
        cpf_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        estado_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        estado_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_lbl.setText("Estado");
        estado_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        celular_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        celular_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        celular_lbl.setText("Celular");
        celular_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        telefone_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        telefone_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefone_lbl.setText("Telefone");
        telefone_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout cliente_telaLayout = new javax.swing.GroupLayout(cliente_tela);
        cliente_tela.setLayout(cliente_telaLayout);
        cliente_telaLayout.setHorizontalGroup(
            cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cliente_telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cliente_telaLayout.createSequentialGroup()
                        .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(data_nasc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(rg_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cliente_telaLayout.createSequentialGroup()
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(cliente_telaLayout.createSequentialGroup()
                                .addComponent(rg)
                                .addGap(66, 66, 66)
                                .addComponent(cpf_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cliente_telaLayout.createSequentialGroup()
                        .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cidade_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nome_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endereco_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(bairro_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefone_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cliente_telaLayout.createSequentialGroup()
                                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celular_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estado, 0, 139, Short.MAX_VALUE)
                                    .addComponent(celular)))
                            .addComponent(bairro)
                            .addComponent(endereco))))
                .addContainerGap())
            .addGroup(cliente_telaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salva_cliente_bt)
                .addGap(50, 50, 50)
                .addComponent(limpa_cliente)
                .addGap(43, 43, 43)
                .addComponent(sair_cliente)
                .addGap(102, 102, 102))
        );
        cliente_telaLayout.setVerticalGroup(
            cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cliente_telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_lbl)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data_nasc_lbl)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg_lbl)
                    .addComponent(cpf_lbl)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco_lbl)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro_lbl)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade_lbl)
                    .addComponent(estado_lbl)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celular_lbl)
                    .addComponent(telefone_lbl))
                .addGap(20, 20, 20)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_lbl)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(cliente_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salva_cliente_bt)
                    .addComponent(sair_cliente)
                    .addComponent(limpa_cliente))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Cliente", cliente_tela);

        cliente_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cliente_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cliente_lbl.setText("Cliente");
        cliente_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        produto_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        produto_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        produto_lbl.setText("Produto");
        produto_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        quantid_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        quantid_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantid_lbl.setText("Quantid.");
        quantid_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        desconto_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        desconto_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desconto_lbl.setText("Desconto");
        desconto_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        produtos_venda_lbl.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        produtos_venda_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        produtos_venda_lbl.setText("Produtos");
        produtos_venda_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gulosa_brigaderia/Consulta_normal.gif"))); // NOI18N
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new Tela_Consulta().setVisible(true);
            }
        });

        novo_venda.setText("Novo Produto");

        finaliza_venda.setText("Finalizar Compra");
        finaliza_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarVendaActionPerformed(evt);
            }
        });

        cancelar_venda.setText("Cancelar Venda");

        sair_venda.setText("Sair");

        javax.swing.GroupLayout venda_telaLayout = new javax.swing.GroupLayout(venda_tela);
        venda_tela.setLayout(venda_telaLayout);
        venda_telaLayout.setHorizontalGroup(
            venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venda_telaLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(novo_venda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finaliza_venda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelar_venda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair_venda)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(venda_telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desconto_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(produto_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantid_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtos_venda_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(venda_telaLayout.createSequentialGroup()
                        .addComponent(cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(produto)
                    .addGroup(venda_telaLayout.createSequentialGroup()
                        .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        venda_telaLayout.setVerticalGroup(
            venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(venda_telaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produto_lbl)
                    .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantid_lbl)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desconto_lbl)
                    .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produtos_venda_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(venda_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo_venda)
                    .addComponent(sair_venda)
                    .addComponent(cancelar_venda)
                    .addComponent(finaliza_venda))
                .addGap(21, 21, 21))
        );

        finaliza_venda.getAccessibleContext().setAccessibleName("Finalizar Venda");

        jTabbedPane1.addTab("Venda", venda_tela);

        javax.swing.GroupLayout relatórios_telaLayout = new javax.swing.GroupLayout(relatórios_tela);
        relatórios_tela.setLayout(relatórios_telaLayout);
        relatórios_telaLayout.setHorizontalGroup(
            relatórios_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        relatórios_telaLayout.setVerticalGroup(
            relatórios_telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Relatórios", relatórios_tela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    
    
        
        ImageIcon icone = new ImageIcon("C:/Users/Victor/Documents/NetBeansProjects/Gulosa_brigaderia/Logo.jpg");
        setIconImage(icone.getImage());
        
    }
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {
        new Tela_Consulta().setVisible(true);
    }
    
    
    private void salvarClienteActionPerformed(java.awt.event.ActionEvent e) {
        try {  
            if(nome.getText().equals("")|| dia.getSelectedItem().equals("Dia...")
                    || mes.getSelectedItem().equals("Mês...") 
                    || ano.getText().equals("")
                    || cpf.getText().equals("")
                    ||endereco.getText().equals("")
                    || bairro.getText().equals("") 
                    || cidade.getText().equals("")
                    || estado.getSelectedItem().equals("Selecione...") 
                    || telefone.getText().equals("")
                    ){
                JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!");
            }else{
            
            Class.forName("org.postgresql.Driver");  
            Connection conn;  
            conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gulosa_brigaderia", "postgres", "123456");  
            String Query=("insert into cliente (nome, data_nasc, rg, cpf, "
                    + "endereco, bairro, cidade, estado, telefone, celular, email) "
                    + "VALUES ('"+nome.getText()+ "','"+dia.getSelectedItem()+"/"+
                    mes.getSelectedItem()+"/"+ano.getText()+"','"+rg.getText()+"','"+cpf.getText()+"','"+
                    endereco.getText()+"','"+bairro.getText()+"','"+cidade.getText()+ "','"+
                    estado.getSelectedItem()+"','"+telefone.getText()+"','"+
                    celular.getText()+"','"+ email.getText()+"')");  
            Statement cmd;  
            cmd=conn.createStatement();  
            System.out.println(Query);
            cmd.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            conn.close();
            }
        } catch (ClassNotFoundException ex) {  
            ex.printStackTrace(); 
            //System.out.println("erro1");
        }catch(SQLException ex){  
            ex.printStackTrace(); 
            //JOptionPane.showMessageDialog(null, "Cliente já cadastrado!");
            //System.out.println("erro2");
        }  
    }
    
    private void salvarVendaActionPerformed(java.awt.event.ActionEvent e) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gulosa_brigaderia", "postgres", "123456");
            Date data_venda = new Date();
            String Query = ("insert into venda (cliente, produto, quantidade, desconto, descricao, "
                    + "valor_venda, data_venda)"
                    + "VALUES ('" + nome.getText() + "','" + produto.getText() + "','" + quantidade.getText() + "','"
                    + desconto.getText() + "','" /*+ produtos.getText() + */+"','" + "250,00" + "','"
                    + data_venda + "')");

            Statement cmd = conn.createStatement();
            //System.out.println(Query);
            cmd.executeUpdate(Query);
            conn.close();
            JOptionPane.showMessageDialog(null, "Venda realizada!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //System.out.println("erro1");
        } catch (SQLException ex) {
            ex.printStackTrace();
            //System.out.println("erro2");
        }
    }
    

    private javax.swing.JTextField ano;
    private javax.swing.JTextField bairro;
    private javax.swing.JLabel bairro_lbl;
    private javax.swing.JButton cancelar_venda;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JLabel celular_lbl;
    private javax.swing.JTextField cidade;
    private javax.swing.JLabel cidade_lbl;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel cliente_lbl;
    private javax.swing.JPanel cliente_tela;
    private javax.swing.JButton consultar;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpf_lbl;
    private javax.swing.JLabel data_nasc_lbl;
    private javax.swing.JTextField desconto;
    private javax.swing.JLabel desconto_lbl;
    private javax.swing.JComboBox dia;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel endereco_lbl;
    private javax.swing.JComboBox estado;
    private javax.swing.JLabel estado_lbl;
    private javax.swing.JButton finaliza_venda;
    private javax.swing.JPanel inicial_tela;
    private javax.swing.JLabel sobre_emp;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea descricao_emp;
    private javax.swing.JButton limpa_cliente;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nome_lbl;
    private javax.swing.JButton novo_venda;
    private javax.swing.JTextField produto;
    private javax.swing.JLabel produto_lbl;
    private javax.swing.JLabel produtos_venda_lbl;
    private javax.swing.JLabel quantid_lbl;
    private javax.swing.JTextField quantidade;
    private javax.swing.JPanel relatórios_tela;
    private javax.swing.JTextField rg;
    private javax.swing.JLabel rg_lbl;
    private javax.swing.JButton sair_cliente;
    private javax.swing.JButton sair_venda;
    private javax.swing.JButton salva_cliente_bt;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JLabel telefone_lbl;
    private javax.swing.JPanel venda_tela;
}
