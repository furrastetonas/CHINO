/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alta.sql.CP_GENERAL;

/**
 *
 * @author LCE X - XX
 */
public class GURREN extends javax.swing.JFrame {

    /**
     * Creates new form GURREN
     */
    public GURREN() {
        initComponents();  StringBuilder resultado = new StringBuilder();

        // Añadir doctype y apertura de HTML
        resultado.append("<!DOCTYPE html>")
                 .append("<html lang=\"en\">")
                 .append("<head>")
                 .append("<meta charset=\"UTF-8\">")
                 .append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">")
                 .append("<title>Dai Gurren</title>")
                 .append("<link rel=\"stylesheet\" href=\"gurren.css\">")
                 .append("</head>")
                 .append("<body>");

        // Añadir contenido de la página
        resultado.append("<h1 class=\"content\">GURREN LAGANN</h1>")
                 .append("<div class=\"slider\">")
                 .append("<div class=\"list\">")
                 .append("<div class=\"item\"><img src=\"ASSETS/3333192.jpg\" alt=\"\"></div>")
                 .append("<div class=\"item\"><img src=\"ASSETS/3333226.jpg\" alt=\"\"></div>")
                 .append("<div class=\"item\"><img src=\"ASSETS/3333261.jpg\" alt=\"\"></div>")
                 .append("<div class=\"item\"><img src=\"ASSETS/4894336.jpg\" alt=\"\"></div>")
                 .append("<div class=\"item\"><img src=\"ASSETS/9006824.png\" alt=\"\"></div>")
                 .append("</div>") // Cierre de .list
                 .append("<div class=\"buttons\">")
                 .append("<button id=\"prev\"><</button>")
                 .append("<button id=\"next\">></button>")
                 .append("</div>")
                 .append("<ul class=\"dots\">")
                 .append("<li class=\"active\"></li>")
                 .append("<li></li>")
                 .append("<li></li>")
                 .append("<li></li>")
                 .append("<li></li>")
                 .append("</ul>")
                 .append("</div>") // Cierre de .slider
                 .append("</body>")
                 .append("<script src=\"app.js\"></script>")
                 .append("</html>");

        // Añadir CSS directamente dentro del StringBuilder
        resultado.append("<style>")
                 .append("@import url('https://fonts.cdnfonts.com/css/ica-rubrik-black');")
                 .append("@import url('https://fonts.cdnfonts.com/css/poppins');")
                 .append("body { margin: 0; font-family: monospace; }")
                 .append(".content{ position: absolute; z-index: 1; top: 50%; left: 10%; padding-right: 30px; font-size: 10em; font-style: italic; font-family: 'ICA Rubrik'; margin: 0; color: #fff; -webkit-text-stroke:2px black; }")
                 .append(".content h1{ background-blend-mode: difference; filter: invert(100%); }")
                 .append(".slider { width: 100vw; height: 100vh; margin: auto; position: relative; overflow: hidden; }")
                 .append(".list { position: absolute; top: 0; left: 0; height: 100%; display: flex; width: max-content; transition: 1s; }")
                 .append(".list img { width: 100vw; height: 100vh; object-fit: cover; }")
                 .append(".buttons { position: absolute; top: 50%; left: 10px; right: 10px; display: flex; justify-content: space-between; transform: translateY(-50%); }")
                 .append(".buttons button { width: 50px; height: 50px; border-radius: 50%; background-color: rgba(218, 115, 115, 0.333); color: #ffffff; border: none; font-family: monospace; font-weight: bold; }")
                 .append(".dots { position: absolute; bottom: 20px; color: #fff; left: 0; width: 100%; margin: 0; padding: 0; display: flex; justify-content: center; }")
                 .append(".dots li { list-style: none; width: 10px; height: 10px; background-color: #fff; margin: 20px; border-radius: 20px; transition: 1s; }")
                 .append(".dots li.active { width: 30px; }")
                 .append("</style>");

        // Añadir el código de JavaScript
        resultado.append("<script>")
                 .append("let slider = document.querySelector('.slider .list');")
                 .append("let items = document.querySelectorAll('.slider .list .item');")
                 .append("let next = document.getElementById('next');")
                 .append("let prev = document.getElementById('prev');")
                 .append("let dots = document.querySelectorAll('.slider .dots li');")
                 .append("let lengthItems = items.length - 1;")
                 .append("let active = 0;")
                 .append("next.onclick = function(){ active = active + 1 <= lengthItems ? active + 1 : 0; reloadSlider(); }")
                 .append("prev.onclick = function(){ active = active - 1 >= 0 ? active - 1 : lengthItems; reloadSlider(); }")
                 .append("let refreshInterval = setInterval(()=> {next.click()}, 3000);")
                 .append("function reloadSlider(){")
                 .append("slider.style.left = -items[active].offsetLeft + 'px';")
                 .append("let last_active_dot = document.querySelector('.slider .dots li.active');")
                 .append("last_active_dot.classList.remove('active');")
                 .append("dots[active].classList.add('active');")
                 .append("clearInterval(refreshInterval);")
                 .append("refreshInterval = setInterval(()=> {next.click()}, 3000);")
                 .append("}")
                 .append("dots.forEach((li, key) => {")
                 .append("li.addEventListener('click', ()=>{ active = key; reloadSlider(); })")
                 .append("})")
                 .append("window.onresize = function(event) { reloadSlider(); };")
                 .append("</script>");

        // Convertir StringBuilder a String
        String htmlContent = resultado.toString();
        
        // Aquí puedes imprimir el contenido generado o guardarlo en un archivo
       jEditorPane1.setText(htmlContent);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEditorPane1.setContentType("text/html");
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GURREN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GURREN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GURREN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GURREN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GURREN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
