module co.edu.uniquindio.poo.walletix {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.walletix to javafx.fxml;
    exports co.edu.uniquindio.poo.walletix;
}