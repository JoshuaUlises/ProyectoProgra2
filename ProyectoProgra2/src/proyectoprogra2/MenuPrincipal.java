package proyectoprogra2;

import java.util.ArrayList;

public class MenuPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    public MenuPrincipal(String rol) {
        initComponents();
        setLocationRelativeTo(null);

        ArrayList<Tecnico> tecnicos = new ArrayList<>();

        Tecnico tecnico1 = new Tecnico(1, "123456789", "Carlos Mora", "Mecanica", "88887777", "carlos@gmail.com", "Activo");
        Tecnico tecnico2 = new Tecnico(2, "987654321", "Luis Perez", "Electricidad", "88889999", "luis@gmail.com", "Activo");

        tecnicos.add(tecnico1);
        tecnicos.add(tecnico2);

        System.out.println("LISTA DE TECNICOS");
        for (Tecnico tecnico : tecnicos) {
            System.out.println("Nombre: " + tecnico.getNombre());
            System.out.println("Especialidad: " + tecnico.getEspecialidad());
            System.out.println("-----------------------");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal("ADMIN").setVisible(true));
    }

    // Variables declaration - do not modify
    // End of variables declaration
}
